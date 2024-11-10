<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8" />
    <meta name="author" content="hary" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="estilos/loginstyle.css">
    <title>Log in - GameFinder</title>

    <!-- Inclua os scripts do Ionicons -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</head>

<body>
    <section>
        <form action="testeLogin.php" method="POST">
            <h1>Log in</h1>
            <div class="inputbox">
                <ion-icon name="mail-outline"></ion-icon>
                <input type="email" name="email" id="email" placeholder="Email" required />
                
            </div>
            <div class="inputbox">
                <ion-icon name="lock-closed-outline"></ion-icon>
                <input type="password" id="password" name="senha" placeholder="Senha" required/>
                
            </div>
            
         <button type="submit" name="submit" value="Enviar">Login</button>
         <div class="register">
                <p>Não tem uma conta? <a href="registro.php">Cadastrar-se</a></p>
            </div>
        </form>
    </section>
</body>

</html>
