app.controller('userStudentController',function($scope,$http,userStudentService,loginService){
	//单条查询
	$scope.login={};
	$scope.selectOne=function(id){
		userStudentService.selectOne(id).success(
			function(response){
				$scope.entity=response;
			}		
		);
	}
	//显示登录名
	$scope.showLoginName=function(){
		loginService.loginName().success(
			function(response){
				$scope.login=response;
			}			
		);
	} 
	
	//修改学生密码
	$scope.updatePass=function(){
		var object=null;
		object=userStudentService.updatePassById($scope.entity);
	}
});