function handleSubmit(event) {
    event.preventDefault(); // Evita o envio padrão do formulário
    const messageDiv = document.getElementById('message');
    messageDiv.textContent = 'Cadastro realizado com sucesso!'; // Mensagem de sucesso
    messageDiv.style.color = 'green'; // Define a cor da mensagem
    document.getElementById('registrationForm').reset(); // Reseta o formulário
    return false; // Retorna falso para prevenir recarregamento
}
