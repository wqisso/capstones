app.service("userStudentService",function($http){

	this.selectOne=function(id){
		return $http.get('../Student/selectOne.do?id='+id);
	}
	
	//修改密码
	this.updatePassById=function(entity){
		return $http.post('../Student/updatePassById.do',entity);
	}
	

});
