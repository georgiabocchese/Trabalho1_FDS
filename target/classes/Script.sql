CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    dataNascimento DATE NOT NULL
);

CREATE TABLE livros (
    codigo INT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    autor VARCHAR(200) NOT NULL,
    ano INT NOT NULL,
    emprestado BOOLEAN DEFAULT FALSE,
    usuarioEmprestimo INT,
    CONSTRAINT fk_usuario_emprestimo FOREIGN KEY (usuarioEmprestimo) REFERENCES usuarios(id)
);

INSERT INTO usuarios(id, nome, anoNascimento) VALUES
(1, 'Georgia', '2005'),
(2, 'Caihan', '2222'),
(3, 'Julio', '1994');

INSERT INTO livros(codigo, titulo, autor, ano, emprestado, usuarioEmprestimo) VALUES
(1111, 'é assim que acaba', 'Collen Hoover', 2016, TRUE, 1),
(2222, 'Romeu e Julieta', 'William Shakespeare', 1597, FALSE, NULL),
(3333, 'Jogos Vorazes', 'Suzanne Collins', 2008, TRUE, 2),
(4444, 'O Silêncio das Águas', 'Brittainy Cherry', 2010, FALSE, NULL),
(5555, 'Dom Quixote', 'Miguel de Cervantes', 1605, TRUE, 3);
