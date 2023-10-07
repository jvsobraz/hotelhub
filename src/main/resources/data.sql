INSERT INTO Quarto (numero, tipo, capacidade_maxima, preco_por_noite) VALUES 
(101, 'Simples', 1, 100.00),
(102, 'Simples', 1, 100.00),
(201, 'Duplo', 2, 150.00),
(202, 'Duplo', 2, 150.00),
(301, 'Suíte', 3, 250.00),
(302, 'Suíte', 3, 250.00);

INSERT INTO Reserva (data_checkin, data_checkout, quarto_id, usuario_id, status, preco_total) VALUES
('2023-10-15', '2023-10-20', 1, 1, 'confirmada', 500.00),
('2023-11-01', '2023-11-05', 3, 2, 'pendente', 600.00),
('2023-11-10', '2023-11-15', 5, 3, 'confirmada', 1250.00);
