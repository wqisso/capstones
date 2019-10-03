app.controller('TrainController',function($scope,$controller,TrainService){
	//增加保存
	$scope.save=function(entity){
		var object=null;		
		object=TrainService.insert(entity);
		object.success(
				function(response){
					if(response.success){
						alert(response.message);
					}else{
						alert(response.message);
					}
				}
		);
	}   
	//单条查询
	$scope.selectOne=function(id){
		TrainService.selectOne(id).success(
			function(response){
				$scope.entity=response;
			}		
		);
	}
	$scope.reloadList=function(){
		 //切换页码  
		$scope.search( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
	}
	
	//分页控件配置 
	$scope.paginationConf = {
		 currentPage: 1,
		 totalItems: 1,
		 itemsPerPage: 1,
		 perPageOptions: [1, 2, 3, 4, 5],
		 onChange: function(){
		        	 $scope.reloadList();//重新加载
		 }
	};

   //分页
	$scope.findPage=function(page,rows){	
		TrainService.findPage(page,rows).success(
				function(response){
					$scope.list=response.rows;	
					$scope.paginationConf.totalItems=response.total;//更新总记录数
				}			
		);
	}
	
	//审核
	$scope.updateState=function(id,state){
		TrainService.updateState(id,state).success(
				function(response){
					if(response.success){
						$scope.reloadList();//刷新列表
					}else{
						alert("失败");
					}	
				}
		);
	}
	
	$scope.searchEntity={};//定义搜索对象
	//条件查询
	$scope.search=function(page,rows){
		TrainService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.paginationConf.totalItems=response.total;//总记录数 
				$scope.list=response.rows;//给列表变量赋值 

			}		
		)
	}
	//批量设置课程
	$scope.selIds=Ids;
	$scope.insertLesTra=function(ids,traid){
		$scope.selIds=Ids;
		TrainService.insertLesTra($scope.selIds,traid).success(
			function(response){
				if(response.success){
					$scope.reloadList();
				}
			}	
		);
	}
	$scope.state=['未审核','已审核','审核未通过'];//商品状态
});