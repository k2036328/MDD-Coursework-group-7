<!doctype html>
<html>
    <head>
        <title>Berwyn buses List</title>
        <style>
           /* * {
                box-sizing: border-box;
            }*/

           /* body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }*/
            /* The grid: Three equal columns that floats next to each other */
            
            .column {
                /*float: center;*/
                width: 33.33%
                
                padding: 15px;
                text-align: center;
                font-size: 40px;
                /*cursor: pointer;*/
                color: white;
                /*margin: 35px;*/
                /*display: table;*/
                
            }
            .column1 {
                width:22.22%;
                padding: 30px;
                text-align: center;
                font-size: 40px;
                color: white;
                position: absolute;
                left: 80px;
                top: 160px;
            }
            .column2 {
                width:22.22%;
                padding: 30px;
                text-align: center;
                font-size: 40px;
                color: white;
                position: absolute;
                left: 550px;
                top: 160px;
            }
            .column3 {
                width:22.22%;
                padding: 30px;
                text-align: center;
                font-size: 40px;
                color: white;
                position: absolute;
                left: 1020px;
                top: 160px;
            }

            .column4 {
                width:22.22%;
                padding: 30px;
                text-align: center;
                font-size: 40px;
                color: white;
                position: absolute;
                left: 280px;
                top: 460px;
            }

            .column5 {
                width:22.22%;
                padding: 30px;
                text-align: center;
                font-size: 40px;
                color: white;
                position: absolute;
                left: 780px;
                top: 460px;
            }
            .containerTab {
                padding: 20px;
                color: white;
            }
            .row:after {
                content:"";
                /*display: table;*/
                clear: both;
            }
            .closebtn {
                float: right;
                color: white;
                font-size: 35px;
                cursor: pointer;
            }
        </style>
    </head>
    <body background="background6.jpg">
    <div>
    <h1 style="text-align:left"> Berwyn Buses Hire</h1>
    <p></p>
    <div style="text-align:center">
    </div>

    <!-- columns // div class="row"-->
    <div>
        <div class="column1" onclick="openTab('b1');" style="background:#80ff80;">
            <p><a href="FindBus.php">Find bus </a></p>
        </div>
        <div class="column2" onclick="openTab('b2');" style="background:#99bbff;">
            <p><a href="MyAccount.php">My account </a></p>
        </div>
        <div class="column3" onclick="openTab('b3');" style="background:#ff8080;">
            <p><a href="AboutUs.php">About us </a></p>
        </div>
        <div class="column4" onclick="openTab('b4');" style="background:#ffff80;">
            <p><a href="BookingBasket.php">Booking basket </a></p>
        </div>
        <div class="column5" onclick="openTab('b5');" style="background:#ffc266;">
            <p><a href="Promotions.php">Promotions </a></p>
        </div>
    </div>
    </body>
</html>