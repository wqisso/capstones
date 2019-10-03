app.service("StudentService",function($http){
	//查询全部学生
	this.selectAll=function(){
		return $http.get('../Student/selectAll.do');
	}
	//单条查询
	this.selectOne=function(id){
		return $http.get('../Student/selectOne.do?id='+id);
	}
	//查询学生密码
	this.selectPassById=function(id){
		return $http.get('../Student/selectPassById.do?id='+id);
	}
	//分页
	this.findPage=function(page,rows){
		return $http.get('../Student/findPage.do?page='+page+'&rows='+rows);
	}
	//修改
	this.update=function(entity){
		return $http.post('../Student/update.do',entity);
	}
	//修改密码
	this.updatePassById=function(entity){
		return $http.post('../Student/updatePassById.do',entity);
	}
	//增加
	this.insert=function(entity){
		return $http.post('../Student/insert.do',entity);
	}
	//模糊查询分页
	this.search=function(page,rows,searchEntity){
		return $http.post('../Student/search.do?page='+page+'&rows='+rows,searchEntity);
	}
	
});