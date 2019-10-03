app.controller('selCourseController',function($scope,$http,selCourseService){
	//查询全部选课情况
	$scope.selectAll=function(id){
		selCourseService.selectAll(id).success(
				function(response){
					$scope.list=response;
					console.log(response);
				}	
		);
	}
	//查询全部选课情况
	$scope.adminSelAll=function(){
		selCourseService.adminSelAll().success(
				function(response){
					$scope.adminlist=response;
				}	
		);
	}
	//增加保存
	
	$scope.save=function(uid,sid){
		var object=null;		
			object=selCourseService.insert(uid,sid);
		
		object.success(
				function(response){
					if(response.success){
						
					}else{
						alert(response.message);
					}
				}
		);
	}
	//查询实体
	$scope.selectOneLes=function(id){
		selCourseService.selectOne(id).success(
			function(response){
				$scope.lentity=response;
			}		
		);
	} 
	$scope.studelete=function(stuid,lesteaid){
		selCourseService.studelete(stuid,lesteaid);
	}
	$scope.state=['未审核','已选中','未选中'];
});