<?php    
if (isset($_POST['submit'])) 
{        
        //echo "Nome: " . htmlspecialchars($_POST['Nome']) . "<br>";
        //echo "Sobrenome: " . htmlspecialchars($_POST['Sobrenome']) . "<br>";
        //echo "Email: " . htmlspecialchars($_POST['email']) . "<br>";
        //echo "Senha: " . htmlspecialchars($_POST['senha']) . "<br>";
    include_once('conexão.php');
    
    $nome=$_POST['Nome'];
    $sobrenome=$_POST['Sobrenome'];
    $email=$_POST['email'];
    $senha=$_POST['senha'];

    $result= mysqli_query($conexao, "INSERT INTO registro(Nome,Sobrenome,email,senha) VALUES ('$nome','$sobrenome','$email','$senha')");
    //if ($result) {
        //echo "Dados inseridos com sucesso!";
    //} else {
        //echo "Erro ao inserir os dados: " . mysqli_error($conexao);
    //}
   header('Location: login.php'); 
}
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos/registrostyle.css"> <!-- Link para o CSS -->
    <script src="jvs/registrojvs.js" defer></script> <!-- Link para o JavaScript -->
    <title>Cadastro GameFinder</title>
</head>
<body>
    <div class="container">
        <div class="form-wrapper">
            <h2>Cadastre-se no GameFinder</h2>
            <!-- Removido o formulário aninhado -->
            <form id="registrationForm" action="registro.php" method="POST">
                <div class="input-group">
                    <input type="text" placeholder="Nome" name="Nome" id="Nome" class="input-field" required />
                    <input type="text" placeholder="Sobrenome" name="Sobrenome" id="Sobrenome" class="input-field" required />
                </div>
                <div class="input-group">
                    <input type="email" placeholder="E-mail" name="email" id="email" class="input-field" required />
                    <input type="password" name="senha" id="senha" placeholder="Senha" class="input-field" required />
                </div>
                <button type="submit" name="submit" class="submit-button">Cadastrar</button>
                <p class="login-prompt">Já possui uma conta? <a href="login.php" class="login-link">Faça Login</a></p>
            </form>
            <div id="message" class="message"></div>
        </div>
    </div>
</body>
</html>
