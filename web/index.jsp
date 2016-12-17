<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>jQuery Autocomplete</title>
    <script src="http://code.jquery.com/jquery-1.7.js"
            type="text/javascript"></script>
    <script
            src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"
            type="text/javascript"></script>
    <link
            href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
            rel="stylesheet" type="text/css" />
    <STYLE TYPE="text/css" media="all">
        .ui-autocomplete {
            position: absolute;
            cursor: default;
            height: 200px;
            overflow-y: scroll;
            overflow-x: hidden;}
    </STYLE>

    <script type="text/javascript">
        $(document).ready(function() {
            $("input#autoText").autocomplete({
                width: 300,
                max: 10,
                delay: 100,
                minLength: 4,
                autoFocus: true,
                cacheLength: 1,
                scroll: true,
                highlight: false,
                source: function(request, response) {
                    console.log(request)
                    $.ajax({
                        url: "/auto",
                        dataType: "json",
                        data: request,
                        success: function( data, textStatus, jqXHR) {
                            console.log( data);
                            response(data);
                        },
                        error: function(jqXHR, textStatus, errorThrown){
                            console.log( textStatus);
                        }
                    });
                }

            });
        });

    </script>
</head>
<body>
<form name="as400samplecode" action="" method="get">
    <table>
        <tr>
            <td><p>Destination:</p><input id="autoText" name="str" maxlength="100" placeholder="Destination or Hotel Name" />
            </td>
        </tr>

        <tr>
            <td><p>Arrival Date:</p><input id="ad" maxlength="0" placeholder="mm/dd/yyyy"/>
            </td>
             <tr>
                 <td> <p>Departure Date:</p> <input id="dd" maxlength="100" placeholder="mm/dd/yyyy"/>
                 </td>
             </tr>
        </tr>


    </table>

</form>
</body>
</html>