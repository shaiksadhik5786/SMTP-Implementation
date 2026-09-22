<!DOCTYPE html>
<html>
<head>
    <title>Simple Email Form</title>
</head>
<body>
    <h2>Email Form</h2>
    <form action="/sendMail" method="post">
        <label for="to">To:</label><br>
        <input type="email" id="to" name="to" required><br><br>

        <label for="subject">Subject:</label><br>
        <input type="text" id="subject" name="subject" required><br><br>

        <label for="body">Message:</label><br>
        <textarea id="body" name="text" rows="6" cols="40" required></textarea><br><br>

        <input type="submit" value="Send">
    </form>
</body>
</html>
