console.log("emp 모듈..");

let empService = function() {

	function list(callback) {

		$.ajax({

			type: "GET",
			url: "/emps/list",
			success: function(result) {
				console.log(result);
				if(callback){
					callback(result);
				}
			},
			error: function(e) {
				console.log(e);
			}

		});

	}
	
	function deptList(callback) {

			$.ajax({

				type: "GET",
				url: "/emps/deptList",
				success: function(result) {
					console.log(result);
					if(callback){
						callback(result);
					}
				},
				error: function(e) {
					console.log(e);
				}

			});

		}

	function join(emp) {

		$.ajax({

			type: "POST",
			url: "/emps/",
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify(emp),
			success: function(result) {

				if (result == "SUCCESS")
					console.log(result);

			},
			error: function(e) {
				console.log(e);
			}

		});

	}

	function del(empno) {

		$.ajax({

			type: "DELETE",
			url: "/emps/" + empno,
			success: function(result) {

				console.log("삭제된 개수 : " + result);

			},
			error: function(e) {
				console.log(e);
			}

		});

	}
	

	return {
		list : list,
		deptList : deptList,
		join : join,
		del	: del,
	}

}