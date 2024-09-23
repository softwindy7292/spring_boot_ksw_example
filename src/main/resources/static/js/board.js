/*
 * boardService 
 * 모듈 구성하기
 *    
 * 모듈 패턴은 쉽게 말해서 Java의 클래스처럼 JavaScript를 이용해서 메서드를 가지는 객체를 구성한다. 
 * 모듈 패턴은 JavaScript의 즉시 실행함수와 '{}'를 이용해서 객체를 구성한다. 
 *  
 * */

console.log("board 모듈..");

let boardService = function() {
	/*console.log("안녕하세요");*/
	function list() {

		$.ajax({

			type: "GET",
			url: "/boards/list",
			success: function(result) {
				console.log(result);
			},
			error: function(e) {
				console.log(e);
			}

		});

	}

	function get(id) {

		$.ajax({

			type: "GET",
			url: "/boards/" + id,
			success: function(result) {
				console.log(result);
			},
			error: function(e) {
				console.log(e);
			}

		});

	}

	function add(board) {

		$.ajax({

			type: "POST",
			url: "/boards/",
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify(board),
			success: function(result) {

				if (result == "SUCCESS")
					console.log(result);

			},
			error: function(e) {
				console.log(e);
			}

		});

	}

	function del(bid) {

		$.ajax({

			type: "DELETE",
			url: "/boards/" + bid,
			success: function(result) {

				console.log("삭제된 개수 : " + result);

			},
			error: function(e) {
				console.log(e);
			}

		});

	}
	
	function update(board) {

		$.ajax({

			type: "PUT",
			url: "/boards/",
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify(board),
			success: function(result) {

				console.log("수정된 개수" + result);

			},
			error: function(e) {
				console.log(e);
			}

		});

	}

	return {
		list : list,
		get	: get,
		add	: add,
		del	: del,
		update : update
	}

}