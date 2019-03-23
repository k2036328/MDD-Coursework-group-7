<!doctype html>
<html>
    <head>
        <title>All the Buses page</title>
        <style>
        .searching {
            margin: 15px;
        }
        th {
            padding: 7px;
        }
        td {
            padding: 4px;
            text-align: center;
        }
        </style>
    </head>
    <body background="background6.jpg">
        <p>Hello All the Buses!</p>
        <table>
            <thead>
                <tr>
                    <th>vehicle Registration No</th>
                    <th>manufacturer</th>
                    <th>model</th>
                    <th>date of Registration</th>
                    <th>colour</th>
                    <th>hourly Rate</th>
                    <th>required License</th>
                    <th>capacity</th>
                </tr>
            </thead>
            <tbody>
            <form method="post" action="FindBus.php">
            Search for capacity:
            <input name="search"/><br/>

            Search for price:
            <input name="searchPrice"/><br/>
            <!--
            Search for available date:
            <input name="searchAvailableDate" type="date"/>
            -->
            <input type="submit" value="Search!"/><br/>
            <p></p>
            <button id="browse"><a href="FindBus.php">Reset </a></button><br/>
            <p></p>
            </form>

            <button><a href="BookingBus.php">Start booking!</a></button>
            
                <?php foreach ($results as $BerwynBus) : ?>
                <tr>
                    <td><?= $BerwynBus->vehicleRegistrationNo ?></td>
                    <td><?= $BerwynBus->manufacturer ?></td>
                    <td><?= $BerwynBus->model ?></td>
                    <td><?= $BerwynBus->dateOfRegistration ?></td>
                    <td><?= $BerwynBus->colour ?></td>
                    <td><?= $BerwynBus->hourlyRate ?></td>
                    <td><?= $BerwynBus->requiredLicense ?></td>
                    <td><?= $BerwynBus->capacity ?></td>
                </tr>
                <?php endforeach ?>
            </tbody>
        </table>
    </body>
</html>