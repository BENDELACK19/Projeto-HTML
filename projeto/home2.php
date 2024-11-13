<?php
session_start();
print_r($_SESSION);
if ((!isset($_SESSION['email']) == true) and (!isset($_SESSION['senha']) == true)) {
    unset($_SESSION['email']);
    unset($_SESSION['senha']);
    header('Location: login.php');
}
$logado = $_SESSION['email']
?>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Landing Page - GameFinder</title>
    <link rel="stylesheet" href="estilos/style2.css" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel="stylesheet" />
</head>

<body>
    <div class="hero">
        <?php
        echo "<h1>Bem vindo $logado</h1>";
        ?>
        <nav class="navigation">
            <!-- Links de navegação -->
            <div class="links">
                <ul>

                    <li><a href="integrantes.html">Sobre nós</a></li>
                    <li><a href="pag-games.html">Games</a></li>
                    <li><a class="login-btn" href="sair.php" aria-label="Login">Sair</a></li>
                    <li><a href="editusers2.php">Lista</a></li>
                </ul>
            </div>

        </nav>

        <!-- Conteúdo -->
        <div class="content">
            <div class="content-container">
                <h1>Game<span>Finder</span></h1>
                <p>Bem-vindo ao GameFinder, a plataforma perfeita para quem busca jogos de maneira rápida e
                    eficiente!<br />
                    Seja você um gamer hardcore, casual ou alguém que está apenas começando a explorar o vasto universo
                    dos games,<br />
                    o GameFinder está aqui para facilitar sua jornada.</p>


            </div>
        </div>
    </div>
</body>

</html>
