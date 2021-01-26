
function moveToDetail(i_board) {
	console.log(i_board);
	location.href = '/detail?i_board=' + i_board;
}

var delBtn = document.querySelector('#delBtn');
var modBtn = document.querySelector('#modBtn');
if(delBtn) {
	delBtn.addEventListener('click', function() {
		location.href=`/del?i_board=${this.dataset.id}`;
	});	
}
if(modBtn) {
	modBtn.addEventListener('click', function() {
		location.href=`/mod?i_board=${this.dataset.id}`;
	});
}



