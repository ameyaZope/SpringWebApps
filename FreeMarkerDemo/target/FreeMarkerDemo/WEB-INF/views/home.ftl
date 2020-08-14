<html>
<head>
    <title>FreeMarker Website</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 40%;
  margin: auto;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 1% 2%;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  margin-left:45%;
  font-size: 200%;
}
    </style>
</head>
<body>
<form action="/FreeMarkerDemo/welcome">
    <h1 align="center" style="font-family:'Comic Sans MS', cursive, sans-serif">
        Buy and Sell Anything !
    </h1>
    <table>
        <tr>
            <th>Details Required</th>
            <th>Your Input</th>
        </tr>
        <tr>
            <td>First Name</td>
            <td><input type="text" id="firstName" name="firstName"></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" id="lastName" name="lastName"></td>
        </tr>
    </table>
    <button type="submit" class="button">Submit</button>
</form>

</body>
</html>