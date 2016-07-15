jQuery(document).ready(function() {
	$("#list").jqGrid({
		url : "userInfo",
		datatype : "json",
		mtype : 'POST',
		colNames : [  'FirstName', 'LastName','Password' ],
		colModel : [  {
			name : 'firstName',
			index : 'firstName',
			width : 150,
			editable : true
		}, {
			name : 'lastName',
			index : 'lastName',
			width : 150,
			editable : true
		}, {
			name : 'password',
			index : 'password',
			width : 150,
			editable : true
		}],
		pager : '#pager',
		rowNum : 10,
		rowList : [ 10, 20, 30 ],
		sortname : 'invid',
		sortorder : 'desc',
		viewrecords : true,
		gridview : true,
		caption : 'User Information',
		jsonReader : {
			repeatitems : false,
		},
		editurl : "userInfo"
	});
	jQuery("#list").jqGrid('navGrid', '#pager', {
		edit : true,
		add : true,
		del : true,
		search : true
	});
});