app.service("selCourseService",function($http){
	//增加
	this.insert=function(uid,sid){
		return $http.post('../SelCourse/insert.do?uid='+uid+'&sid='+sid);
	}
	//查询选课情况
	this.selectAll=function(id){
		return $http.post('../SelCourse/selectAll.do?id='+id);
	}	
	//管理员查询选课情况
	this.adminSelAll=function(){
		return $http.get('../SelCourse/adminSelAll.do');
	}
	this.selectOne=function(id){
		return $http.get('../Plesson/selectOne.do?id='+id);
	}
	//删除已选中课程
	this.studelete=function(stuid,lesteaid){
		return $http.post('../SelCourse/delete.do?stuid='+stuid+'&lesteaid='+lesteaid);
	}
});