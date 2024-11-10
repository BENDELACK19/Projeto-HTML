<?php
    $servidor = "localhost"; // ou o IP do servidor
    $usuario = "root";
    $senha = "";
    $banco = "projgamefinder";

    $conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

    // Verifique se a conexão falhou
    if (!$conexao) {
        die("Falha na conexão: " . mysqli_connect_error());
    }
?>
