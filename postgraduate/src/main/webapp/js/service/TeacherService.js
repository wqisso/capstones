app.service("TeacherService",function($http){
	//查询全部导师
	this.selectAll=function(){
		return $http.get('../Teacher/selectAll.do');
	}
	//单条查询
	this.selectOne=function(id){
		return $http.get('../Teacher/selectOne.do?id='+id);
	}
	//查询导师密码
	this.selectPassById=function(id){
		return $http.get('../Teacher/selectPassById.do?id='+id);
	}
	//分页
	this.findPage=function(page,rows){
		return $http.get('../Teacher/findPage.do?page='+page+'&rows='+rows);
	}
	//修改
	this.update=function(entity){
		return $http.post('../Teacher/update.do',entity);
	}
	//修改密码
	this.updatePassById=function(entity){
		return $http.post('../Teacher/updatePassById.do',entity);
	}
	//增加
	this.insert=function(entity){
		return $http.post('../Teacher/insert.do',entity);
	}
	//模糊查询分页
	this.search=function(page,rows,searchEntity){
		return $http.post('../Teacher/search.do?page='+page+'&rows='+rows,searchEntity);
	}
	this.insertLesTea=function(lesid,teaid){
		return $http.post('../LesTea/insertLesTea.do?lesid='+lesid+'&teaid='+teaid);
	}
});