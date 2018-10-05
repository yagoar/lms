-- BASIS Laufbahnstufen

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (1, 0, 'Junior', 'BASIS');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (2, 1, 'Software Engineer', 'BASIS');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (2, 'SE', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (2, 'SKF', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (2, 'UDH', 'GL');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (2, 'AM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (2, 'SA', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (2, 'QM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (2, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (2, 'PM', 'GL');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (3, 2, 'Senior Software Engineer', 'BASIS');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'SE', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'QM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'SKF', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (3, 'UDH', 'GL');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'SE', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'AM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'SA', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'QM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'PM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'SKF', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (3, 'BPK', 'GL');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (13, 1, 'IT Consultant', 'BASIS');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (13, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (13, 'SKF', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (13, 'UDH', 'GL');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (13, 'SE', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (13, 'QM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (13, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (13, 'PM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (13, 'BPK', 'GL');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (14, 2, 'Senior IT Consultant', 'BASIS');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'QM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'ITM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'SKF', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'UDH', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (14, 'BPK', 'GL');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'SE', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'AM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'SA', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'QM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'ITM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'PM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'SKF', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'BPK', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (14, 'AKQ', 'GL');

-- TECHNOLOGIE / ARCHITEKTUR Laufbahnstufen

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (4, 3, 'Software Architect / Lead Software Engineer', 'TECHNOLOGIE_ARCHITEKTUR');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'SE', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'SA', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'QM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'BPK', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (4, 'AKQ', 'GL');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (4, 'SE', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (4, 'SA', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (4, 'QM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (4, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (4, 'PM', 'FU');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (5, 4, 'Senior Solution Architect / Senior Software Architect / Senior Lead Software Engineer', 'TECHNOLOGIE_ARCHITEKTUR');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'SE', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'SA', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (5, 'AKQ', 'FU');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'AM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'PM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'SKF', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'UDH', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (5, 'BPK', 'EX');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (6, 5, 'Principal Solution Architect / Principal Software Architect', 'TECHNOLOGIE_ARCHITEKTUR');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'SE', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'AM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'SA', 'FR');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'PM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'SKF', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'UDH', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (6, 'AKQ', 'FU');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'SE', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'QM', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'UDH', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'BPK', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (6, 'AKQ', 'EX');

-- PROJEKT - ORGANISATION Laufbahnstufen

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (7, 3, 'Project Manager', 'PROJEKT_ORGANISATION');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'SE', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'AM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'PM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'BPK', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (7, 'AKQ', 'GL');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (7, 'AM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (7, 'SA', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (7, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (7, 'PM', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (7, 'AKQ', 'FU');


INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (8, 4, 'Senior Project Manager', 'PROJEKT_ORGANISATION');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'SE', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'AM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'PM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (8, 'AKQ', 'EX');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'SE', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'SA', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'QM', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'SKF', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'UDH', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (8, 'AKQ', 'EX');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (9, 5, 'Principal Project Manager', 'PROJEKT_ORGANISATION');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'SE', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'AM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'QM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'PM', 'FR');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'SKF', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'UDH', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (9, 'AKQ', 'EX');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'SA', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'ITM', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'SKF', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'UDH', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'BPK', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (9, 'AKQ', 'FR');

-- FACHLICHKEIT Laufbahnstufen

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (10, 3, 'Business Architect / Lead IT Consultant', 'FACHLICHKEIT');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'AM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'QM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'ITM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (10, 'AKQ', 'GL');


INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'SE', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'SA', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'QM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'ITM', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'PM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (10, 'AKQ', 'FU');


INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (11, 4, 'Senior Business Architect / Senior Lead IT Consultant', 'FACHLICHKEIT');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'AM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'ITM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'PM', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'SKF', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'UDH', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'BPK', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (11, 'AKQ', 'FU');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (11, 'SE', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (11, 'PM', 'FU');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (11, 'SKF', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (11, 'UDH', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (11, 'BPK', 'EX');

INSERT INTO laufbahnstufe(ID, STUFE, NAME, LAUFBAHN) VALUES (12, 5, 'Principal Business Architect / Principal IT Consultant', 'FACHLICHKEIT');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'AM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'SA', 'GL');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'QM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'ITM', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'PM', 'FU');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'SKF', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'UDH', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'BPK', 'EX');
INSERT INTO laufbahnstufe_pflicht_kompetenzen VALUES (12, 'AKQ', 'FU');

INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'SE', 'GL');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'AM', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'QM', 'EX');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'ITM', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'UDH', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'BPK', 'FR');
INSERT INTO laufbahnstufe_optional_kompetenzen VALUES (12, 'AKQ', 'EX');