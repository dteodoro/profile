@param gg.jte.Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Profile</title>
</head>
<body class="p-3 m-0 border-0 bd-example m-0 border-0">
    <nav>
        <ul class="nav nav-tabs">
            <li class="nav-item" >
                <a class="nav-link active" href="#">View</a>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="#">Create</a>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="#">Edit</a>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="#">Export</a>
            </li>
        </ul>
    </nav>
    <div class="container-l" id="content">
        ${content}
    </div>
    <footer>
    </footer>
</body>
</html>