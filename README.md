# Spring_Zakharchenko_22
Функціональні вимоги:

1. Як викладач, я хочу мати можливість переглядати список тем курсових проектів, щоб обрати тему для керівництва студентами.
2. Як викладач, я хочу мати можливість виставляти оцінки студентам за їх курсові проекти, щоб оцінити їхні досягнення.
3. Як викладач, я хочу мати можливість переглядати список студентів, щоб відстежувати їхні академічні досягнення та прогрес.
4. Як викладач, я хочу мати можливість переглядати список власних предметів, щоб було зручніше розподіляти теми для студентів.
5. Як студент, я хочу мати можливість обирати тему курсового проекту з доступного списку, щоб почати його виконання.
6. Як студент, я хочу мати можливість переглядати свої оцінки за курсові проекти, щоб відстежувати свій академічний прогрес.
7. Як адміністратор системи, я хочу мати можливість додавати нові теми курсових проектів до бази даних, щоб розширити вибір для студентів.
8. Як адміністратор системи, я хочу мати можливість додавати нових викладачів разом з їх предметами викладання до бази даних, щоб відображати актуальну інформацію про кадри.
9. Як адміністратор системи, я хочу мати можливість додавати нових студентів до бази даних, щоб студенти могли обрати тему курсового проекту та переглядати свої оцінки.
10. Як адміністратор системи, я хочу мати можливість додавати групи, щоб краще керувати можливим вибором студентів щодо теми курсового.
11. Як адміністратор системи, я хочу мати можливість оновлювати інформацію про студентів, викладачів та теми курсових проектів, щоб забезпечити актуальні дані.
12. Як адміністратор системи, я хочу мати можливість видаляти студентів, викладачів та теми курсових проектів з бази даних, якщо вони вже не актуальні або потрібні.

 Системні поведінки:

1. Перегляд списку тем курсових проектів (викладач):
- Викладач може переглянути список доступних тем курсових проектів.
- Система відображає перелік тем з бази даних, включаючи назву та кількість доступних місць для студентів.
- Викладач може вибрати тему для студентів, і система фіксує вибір теми для групи студентів.

2. Виставлення оцінок викладачем:
- Викладач може виставити оцінку студенту за його курсовий проект.
- Система перевіряє правильність введених даних (ідентифікація студента, теми, викладача та оцінки).
- Система зберігає оцінку в базі даних і оновлює відповідні записи.
  
3. Перегляд списку студентів (викладач):
- Викладач може переглянути список студентів для своїх предметів або проектів.
- Система витягує дані про студентів із бази даних і відображає їх із можливістю фільтрування по групах або темах.

4. Перегляд списку предметів (викладач):
- Викладач може переглянути список власних предметів.
- Система відображає предмети, закріплені за викладачем, та відповідні курсові проекти, якщо вони є.

5. Вибір теми курсового проекту (студент):
- Студент може переглянути доступні теми курсових проектів.
- Система відображає список тем і дозволяє студенту обрати одну тему.
- Після вибору тема зберігається як закріплена за студентом.

6. Перегляд оцінок (студент):
- Студент може переглянути свої оцінки за курсові проекти.
- Система витягує з бази даних записи про оцінки і відображає їх разом з темами проектів.

7. Додавання нових тем курсових проектів (адміністратор):
- Адміністратор може додати нову тему курсового проекту, вказавши її назву та кількість доступних місць.
- Система перевіряє, чи немає такої теми в базі даних.
- Якщо тема є унікальною, вона додається до бази даних.

8. Додавання нових викладачів та предметів (адміністратор):
- Адміністратор може додати нового викладача, вказавши його ім'я та список предметів.
- Система перевіряє правильність введених даних і додає нові записи до бази даних.

9. Додавання нових студентів (адміністратор):
- Адміністратор може додати нового студента, вказавши його ім'я та групу.
- Система перевіряє, чи немає такого студента в базі даних, і, якщо він унікальний, додає його.

10. Додавання нових груп (адміністратор):
- Адміністратор може додати нову групу студентів, вказавши її назву.
- Система перевіряє, чи така група вже існує, і, якщо ні, додає її до бази даних.

11. Оновлення інформації про студентів, викладачів та теми (адміністратор):
- Адміністратор може оновити інформацію про студентів, викладачів або теми курсових проектів.
- Система дозволяє змінювати дані у відповідних полях, перевіряє їх правильність і зберігає зміни в базі даних.

12. Видалення студентів, викладачів або тем курсових проектів (адміністратор):
- Адміністратор може видаляти студентів, викладачів або теми курсових проектів з бази даних.
- Система перевіряє наявність даних і видаляє записи.

Системні функції та REST API ендпоінти:

1. Додавання тем курсових проектів
- Метод: POST
- URL: /api/topics
- Параметри: topics_names (назва теми)
- Відповідь: Підтвердження додавання нової теми курсового проекту.
2. Додавання викладачів
- Метод: POST
- URL: /api/teachers
- Параметри: teachers_names (ім'я викладача), teachers_subject (предмет викладання)
- Відповідь: Підтвердження додавання нового викладача.
3. Перегляд списку тем курсових проектів
- Метод: GET
- URL: /api/topics
- Відповідь: Список всіх доступних тем курсових проектів.
4. Виставлення оцінок викладачем
- Метод: POST
- URL: /api/grades
- Параметри: students_id (номер студента), grades (оцінка)
- Відповідь: Підтвердження виставлення оцінки.
5. Перегляд списку студентів
- Метод: GET
- URL: /api/students
- Відповідь: Список всіх студентів разом з їхніми особистими даними.
6. Вибір теми курсового проекту студентом
- Метод: POST
- URL: /api/students/choose-topic
- Параметри: students_id (номер студента), topics_id (номер теми курсового проекту)
- Відповідь: Підтвердження вибору теми курсового проекту.
7. Перегляд оцінок студентом
- Метод: GET
- URL: /api/students/grades
- Параметри: students_id (номер студента)
- Відповідь: Список оцінок для конкретного студента.
8. Відслідковування запланованої та фактичної кількості виконаних курсових проектів
- Метод: GET
- URL: /api/topics/amount
- Відповідь: Кількість запланованих та виконаних курсових проектів для кожної теми.
9. Оновлення інформації про студентів, викладачів та теми курсових проектів
- Метод: PUT
- URL: /api/update
- Параметри: students_id (номер студента), teachers_id (номер викладача), topics_id (номер теми курсового проекту) та відповідні зміни даних.
- Відповідь: Підтвердження оновлення інформації.
10. Видалення студентів, викладачів та тем курсових проектів
- Метод: DELETE
- URL: /api/delete
- Параметри: students_id (номер студента), teachers_id (номер викладача), topics_id (номер теми курсового проекту) для видалення.
- Відповідь: Підтвердження видалення даних.
