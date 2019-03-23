<!doctype html>
<html>
    <head>
    
    <script type="text/javascript" src="//code.jquery.com/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="model2/clientcode.js"></script>
        <title>booking bus page</title>
        <style>
            .field {
                padding:15px;
            }
            form {display: inline-block; background-color: #ffc107; color: #000; width: 400px;}
            
            .label {margin-bottom: 8px;}

            #backToHome, #bookingBasket {
                margin:15px;
                padding:10px;
                background-color: yellow;
            }
            
        </style>
    </head>
    <body background="background6.jpg">
        <p>Hello booking bus!</p>
        <div class="text-center">
            <form method="post" action="BookingBasket.php">

                <h2>Book your Bus journey</h2>

                <div class="field">
                    booking Id <input type="text" name="bookingId" placeholder="Enter booking ID" required />
                </div>

                <div id="niceajaxsearch" class="field">
                    Selected Bus <input type="text" name="bus" placeholder="Type your Bus" required /><!-- show the bus that you chose-->
                    <div class="results">
                        <div class="result"></div> <!--related to clientcode.js line 80? -->
                    </div>
                    <!--button id="reset"><a href="FindBus.php">reset </a></button-->
                </div>
                <!---->
                
                <!---->
                <div class="field">
                    Destination <input tye="text" name="destination" placeholder="Type destination" required />
                </div>

                <div class="field">
                    Depart date <input type="date" name="departDate" placeholder="Type depart date" required />
                </div>

                <div class="field">
                    Arrive date <input type="date" name="arriveDate" placeholder="Type arrive date" required />
                </div>

                <div class="field">
                Required date
                <select name="requiredDate" required>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                </select>
                </div>

                <div class="field">
                    drive yourself?<br/>
                    <I>(if yes you need a license)</I>
                    <input type="radio" name="requiredLicense" value="Yes">YES
                    <input type="radio" name="requiredLicense" value="No">NO
                </div>

                <div class="field">
                    total price <input tye="text" name="totalPrice" />
                </div>

                <div class="field">
                    <!--input type="submit" onclick="alert('Your booking has been confirmed!')" value="click to book" /><br/-->
                    <input type="submit" value="click to book" /><br/>
                    
                </div>
<!--
                <input type="submit" value="click to book" 
                    id="bookingConfirmed" onclick="bookingConfirmed()" /><br/>

                <div class="field">
                <div id="bookingConfirmed">
                    Your booking has been confirmed!
                </div>

                
                    <button id="bookingConfirmed" onclick="bookingConfirmed()">Click to book</button>
-->
            </form>
        </div>
        <button id="backToHome"><a href="index.php">back to home </a></button>
        <button id="bookingBasket"><a href="BookingBasket.php">see my booking </a></button>

        <script>
        </script>
    </body>
</html>