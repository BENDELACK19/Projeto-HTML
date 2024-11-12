<?php
session_start();
include_once('conexão.php');
// Verifica se a sessão não está configurada corretamente
if (!isset($_SESSION['email']) || !isset($_SESSION['senha'])) {
    // Se não estiver logado, destrói as variáveis de sessão e redireciona para o login
    unset($_SESSION['email']);
    unset($_SESSION['senha']);
    header('Location: login.php');
    exit();  // Adiciona exit() para garantir que o código abaixo não seja executado
}

// Se estiver logado, continua com o processamento
$logado = $_SESSION['email'];  // Aqui, o valor de $_SESSION['email'] é atribuído a $logado

// Supondo que $conexao já esteja definido corretamente com a conexão ao banco
// Por exemplo: $conexao = new mysqli('localhost', 'usuario', 'senha', 'banco');

// Consulta SQL para selecionar todos os registros ordenados por ID de forma decrescente
$sql = "SELECT * FROM registro ORDER BY id DESC";

// Executa a consulta
$result = $conexao->query($sql);

//print_r($result);


?>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="estilos/editusers.css">
    <title>Editar Usuários - GameFinder</title>
</head>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nome</th>
      <th scope="col">Sobrenome</th>
      <th scope="col">Email</th>
      <th scope="col">Senha</th>
      <th scope="col">...</th>
    </tr>
  </thead>
  <tbody>
  <?php
while($user_data = mysqli_fetch_assoc($result))
{
  echo "<tr>";
  echo "<td>".$user_data['id']."</td>";
  echo "<td>".$user_data['Nome']."</td>";
  echo "<td>".$user_data['Sobrenome']."</td>";
  echo "<td>".$user_data['email']."</td>";
  echo "<td>".$user_data['senha']."</td>";
  echo "<td>ações</td>";
  echo "</tr>";
}
?>
  </tbody>
</table>