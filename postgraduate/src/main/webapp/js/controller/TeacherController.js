app.controller('TeacherController',function($scope,$http,TeacherService){
	$scope.selectAll=function(){
		TeacherService.selectAll().success(
				function(response){
					$scope.list=response;
				}
		);
	}
	//单条查询
	$scope.selectOne=function(id){
		TeacherService.selectOne(id).success(
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
				 TeaIds.splice(0,TeaIds.length);
			        	 $scope.reloadList();//重新加载
			 }
	};
	
	    //分页
	$scope.findPage=function(page,rows){	
		TeacherService.findPage(page,rows).success(
				function(response){
					$scope.list=response.rows;	
					$scope.paginationConf.totalItems=response.total;//更新总记录数
				}			
		);
	}
	
	//增加保存
	$scope.save=function(){
		var object=null;		
		if($scope.entity.id!=null){
			object=TeacherService.update($scope.entity);
		}else{
			object=TeacherService.insert($scope.entity);
		}
		object.success(
				function(response){
					if(response.success){
						$scope.reloadList();
					}else{
						alert(response.message);
					}
				}
		);
	}
	//修改学生密码
	$scope.updatePass=function(){
		var object=null;
		object=TeacherService.updatePassById($scope.entity);
	}
	//更新复选
	$scope.updateSelection = function($event,id){
		if($event.target.checked){
			TeaIds.push(id);
		}else{
			var idx = TeaIds.indexOf(id);
			TeaIds.splice(idx,1);//删除
		}
	}
	$scope.searchEntity={};//定义搜索对象
	//条件查询
	$scope.search=function(page,rows){
		TeacherService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.paginationConf.totalItems=response.total;//总记录数 
				$scope.list=response.rows;//给列表变量赋值 

			}		
		)
	}
	//批量设置课程
	$scope.selIds=TeaIds;
	$scope.insertLesTea=function(lesid,TeaIds){
		$scope.selIds=TeaIds;
		TeacherService.insertLesTea(lesid,$scope.selIds).success(
			function(response){
				if(response.success){
					
					$scope.reloadList();
				}
			}	
		);
	}
	$scope.politicalList={data:[{id:'中共党员',text:'中共党员'},{id:'中共预备党员',text:'中共预备党员'},{id:'共青团员',text:'共青团员'},{id:'群众',text:'群众'}]};
	
});