insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');

//doctor
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
values (1, 'Adam', 'Bober', '123456789', 'bober.adam@gmail.com', '000001', 'lekarz_rodzinny');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
values (2, 'Marcin', 'Krupa', '987654321', 'krupa.marcin@gmail.com', '000002', 'chirurg');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
values (3, 'Bożena', 'Kowalska', '123789456', 'bozena.kowalska@gmail.com', '000003', 'endokrynolog');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
values (4, 'Artur', 'Nowak', '987321456', 'nowak.artur@gmail.com', '000004', 'okulista');

//patient
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, height)
values (1, 'Miłosz', 'Mazur', '741963852', 'milosz.mazur@gmail.com', '000001', '1976-01-09', 188);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, height)
values (2, 'Patrycja', 'Lizak', '963258741', 'patrycja.lizak@gmail.com', '000002', '1999-08-19', 170);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, height)
values (3, 'Milena', 'Suchy', '753951486', 'milena.suchy@gmail.com', '000003', '2002-09-29', 179);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, height)
values (4, 'Krzysztof', 'Kamiński', '159753624', 'krzysztof.kaminski@gmail.com', '000004', '1966-12-12', 181);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, height)
values (5, 'Maciej', 'Słaby', '951123369', 'maciej.slaby@gmail.com', '000005', '1986-04-26', 174);

//visit
insert into visit (id, description, time, doctor_id, patient_id)
values (1, 'wizyta okulistyczna', '2024-01-12', 4, 4);
insert into visit (id, description, time, doctor_id, patient_id)
values (2, 'wizyta kontrolna', '2023-12-12', 1, 2);
insert into visit (id, description, time, doctor_id, patient_id)
values (3, 'wizyta endokrynologiczna', '2023-12-01', 3, 1);
insert into visit (id, description, time, doctor_id, patient_id)
values (4, 'wycięcie migdałków', '2024-04-06', 2, 4);
insert into visit (id, description, time, doctor_id, patient_id)
values (5, 'wizyta okulistyczna', '2024-03-12', 4, 5);
insert into visit (id, description, time, doctor_id, patient_id)
values (6, 'wizyta kontrolna', '2024-05-06', 1, 4);

//medical treatment
insert into medical_treatment (id, description, type, visit_id)
values (1, 'wycięcie migdałków pomyślne', 'chirurgia', 4);
insert into medical_treatment (id, description, type, visit_id)
values (2, 'przepisanie skierowania na badanie krwi', 'skierowanie', 2);
insert into medical_treatment (id, description, type, visit_id)
values (3, 'przepisanie recepty na tabletki', 'recepta', 2);
insert into medical_treatment (id, description, type, visit_id)
values (4, 'przepisanie skierowania na badanie moczu', 'skieroweanie', 2);
insert into medical_treatment (id, description, type, visit_id)
values (5, 'przepisanie skierowania na badanie wzroku', 'skierowanie', 6);
insert into medical_treatment (id, description, type, visit_id)
values (6, 'wizyta endokrynologiczna - brak potrzeby dalszej konsuktacji', 'wizyta', 3);
insert into medical_treatment (id, description, type, visit_id)
values (7, 'badanie wzroku', 'badanie', 5);