INSERT INTO enderecos(
            logradouro, numero, cidade_id, complemento, longitude, latitude,
            pessoa_id, cep)
    VALUES ('rua cristiano viana', 1399, 1, null, -33.333, -25.555, 1, '05411-002');

INSERT INTO vagas(
            endereco_id, coberta, metros_quadrados, disponivel,
            periodos, dias_disponiveis, horarios, logradouro, numero, longitude,
            latitude)
    VALUES (1, true, 10, true,
            'avulso/mensal', 'seg a sex', '8 as 18hs', 'rua cristiano viana', 1399, -33.333,
            -25.555);
