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
13. Як адміністратор системи, я хочу мати можливість реєтрувати викладачів та студентів.
14. Як користувач системи, я хочу мати можливість авторизуватися в систему.

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

13. Реєстрація викладачів та студентів (адміністратор):
- Адміністратор може реєструвати нових викладачів і студентів у системі.
- Система запитує необхідні дані для викладача (ім'я, предмети) або студента (ім'я, група).
- Система перевіряє, чи користувач з такими даними вже існує в базі даних.
- Якщо користувач унікальний, система створює новий обліковий запис для викладача або студента з необхідними правами доступу.
- Після успішної реєстрації користувач отримує унікальний логін і пароль для авторизації в системі.

14. Авторизація користувача в системі:
- Користувач (студент, викладач або адміністратор) може авторизуватися в системі, ввівши свій логін та пароль.
- Система перевіряє наявність облікового запису з таким логіном у базі даних і правильність введеного пароля.
- Якщо введені дані правильні, система надає доступ до функціоналу відповідно до ролі користувача (студент, викладач або адміністратор).
- У разі неправильної авторизації система повідомляє про помилку і надає можливість повторного введення даних.

Системні функції та REST API ендпоінти:

1. Додавання тем курсових проектів (адміністратор)
Метод: POST
URL: /api/topics
Параметри:
- name (назва теми, тип text)
- amount (кількість доступних місць, тип integer)
Відповідь: Підтвердження додавання нової теми курсового проекту.
Системна функція:
- Перевіряється унікальність теми в таблиці ProjectsTopics.
- Якщо унікальна, запис додається до бази даних.

2. Виставлення оцінок (викладач)
Метод: POST
URL: /api/grades
Параметри:
- student_id (ідентифікатор студента, тип integer)
- topic_id (ідентифікатор теми, тип integer)
- teacher_id (ідентифікатор викладача, тип integer)
- grade (оцінка, тип integer)
Відповідь: Підтвердження виставлення оцінки.
Системна функція:
- Оцінка додається до таблиці Grades, якщо вказані дані коректні.

3. Перегляд списку студентів (викладач)
Метод: GET
URL: /api/students
Параметри:
- group_id (фільтр за групою, необов'язковий, тип integer)
Відповідь: Повертається список студентів із бази даних, відфільтрований за group_id.
Системна функція:
- Витягуються всі студенти або фільтруються за групами з таблиці Students.

4. Перегляд списку предметів (викладач)
Метод: GET
URL: /api/teachers/{teacher_id}/subjects
Параметри:
- teacher_id (ідентифікатор викладача, тип integer)
Відповідь: Повертаються всі предмети викладача.
Системна функція:
- Витягуються предмети з таблиці Teachers, де teacher_id відповідає заданому.

5. Вибір теми курсового проекту (студент)
Метод: POST
URL: /api/students/{student_id}/choose-topic
Параметри:
- topic_id (ідентифікатор теми, тип integer)
Відповідь: Підтвердження вибору теми курсового проекту.
Системна функція:
- Обирається відповідна тема для студента і зберігається в таблиці Grades.

6. Перегляд оцінок (студент)
Метод: GET
URL: /api/students/{student_id}/grades
Параметри:
- student_id (ідентифікатор студента, тип integer)
Відповідь: Повертається список оцінок студента за курсові проекти.
Системна функція:
- Витягуються оцінки студента з таблиці Grades.

7. Додавання нових викладачів та предметів (адміністратор)
Метод: POST
URL: /api/teachers
Параметри:
- name (ім'я викладача, тип text)
- subject (назва предмету, тип text)
Відповідь: Підтвердження додавання викладача.
Системна функція:
- Додається новий викладач до таблиці Teachers.

8. Додавання нових студентів (адміністратор)
Метод: POST
URL: /api/students
Параметри:
- name (ім'я студента, тип text)
- group_id (ідентифікатор групи, тип integer)
Відповідь: Підтвердження додавання студента.
Системна функція:
- Студент додається до таблиці Students.

9. Додавання нових груп (адміністратор)
Метод: POST
URL: /api/groups
Параметри:
- name (назва групи, тип char)
Відповідь: Підтвердження додавання групи.
Системна функція:
- Додається нова група до таблиці Groups.

10. Оновлення інформації про студентів, викладачів та теми (адміністратор)
Метод: PUT
URL: /api/{entity}/{id}
Параметри:
- entity (тип даних: students, teachers, topics)
- id (ідентифікатор запису, тип integer)
Дані, що оновлюються.
Відповідь: Підтвердження оновлення даних.
Системна функція:
- Оновлюються відповідні дані у вказаній таблиці.

11. Видалення студентів, викладачів або тем (адміністратор)
Метод: DELETE
URL: /api/{entity}/{id}
Параметри:
- entity (тип даних: students, teachers, topics)
- id (ідентифікатор запису, тип integer)
Відповідь: Підтвердження видалення запису.
Системна функція:
- Запис видаляється з відповідної таблиці.

12. Реєстрація викладачів та студентів (адміністратор)
Метод: POST
URL: /api/register
Параметри:
- name (ім'я, тип text)
- role (роль: student або teacher, тип text)
- group_id (для студентів, тип integer)
- subject (для викладачів, тип text)
- password (пароль, тип text)
Відповідь: Підтвердження реєстрації користувача.
Системна функція:
- Дані додаються до відповідних таблиць Students, Teachers та Passwords.

13. Авторизація користувача (всі ролі)
Метод: POST
URL: /api/login
Параметри:
- user_id (ідентифікатор користувача, тип integer)
- password (пароль, тип text)
Відповідь: Токен для доступу до системи або помилка авторизації.
Системна функція:
- Пароль перевіряється в таблиці Passwords.
