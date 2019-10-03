app.controller('StudentController',function($scope,$http,StudentService){
	$scope.selectAll=function(){
		StudentService.selectAll().success(
				function(data){
					$scope.list=data;
					console.log(data);
				}
		);
	}
	//单条查询
	$scope.selectOne=function(id){
		StudentService.selectOne(id).success(
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
		StudentService.findPage(page,rows).success(
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
			object=StudentService.update($scope.entity);
		}else{
			object=StudentService.insert($scope.entity);
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
		object=StudentService.updatePassById($scope.entity);
	}
	
	$scope.searchEntity={};//定义搜索对象
	//条件查询
	$scope.search=function(page,rows){
		StudentService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.paginationConf.totalItems=response.total;//总记录数 
				$scope.list=response.rows;//给列表变量赋值 

			}		
		)
	}
	$scope.educateList={data:[{id:'统分',text:'统分'},{id:'定向培养',text:'定向培养'},{id:'自费',text:'自费'},{id:'委托培养',text:'委托培养'}]};
	$scope.politicalList={data:[{id:'中共党员',text:'中共党员'},{id:'中共预备党员',text:'中共预备党员'},{id:'共青团员',text:'共青团员'},{id:'群众',text:'群众'}]};
	$scope.categoryList={data:[{id:'学术性硕士学位',text:'学术性硕士学位'},{id:'专业型硕士学位',text:'专业型硕士学位'},{id:'其他',text:'其他'}]};
});