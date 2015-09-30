<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Default tiles template</title>
    <style type="text/css">
    body {
        margin:0px;
        padding:0px;
        height:100%;
        overflow:hidden;
    }
    .page {
        min-height:100%;
        position:relative;
    }
    .content {
            padding:10px;
            padding-bottom:20px; /* Height of the footer element */
            overflow:hidden;
    }
    .body {
        margin:50px 10px 0px 250px;
    }
    
     .menu {
        padding:50px 10px 0px 10px;
        width:100px;
        float:left;
        font-family:cursive;
    	font-size: 100%;
    	color: white;
    }
       .footer {
        clear:both;
        position:absolute;
        bottom:0;
        left:0;
        text-align:center;
        width:100%;
        height:40px;
        background: #3399cc;
        font-family:cursive;
    	font-size: 100%;
    	color: white;
   }
    </style>
</head>
<body>
    <div class="page">
        <tiles:insertAttribute name="header" />
        <div class="content">
            <tiles:insertAttribute name="menu" />
            <tiles:insertAttribute name="body" />
        </div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>