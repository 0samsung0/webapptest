// Функция выполняется после загрузки страницы
window.addEventListener('DOMContentLoaded', function() {
    // Обработчик события для кнопки сортировки
    document.getElementById('sort-button').addEventListener('click', function() {
        var sortAlphabetically = document.getElementById('sort-alphabetically').checked;
        var sortByDate = document.getElementById('sort-by-date').checked;


    });

    document.getElementById('get-users-button').addEventListener('click', function() {


        var userList = document.getElementById('user-list');
        userList.innerHTML = ''; // Очищаем список перед добавлением пользователей


//         users.forEach(function(user) {
//             var li = document.createElement('li');
//             li.textContent = user.Файл database.json, который хранит данные о поездках, пользователях и задачах. Пример содержимого файла:
//
// // JSON
// //             {
// //                 "trips": [
// //                 {
// //                     "id": 1,
// //                     "start_time": "2023-11-01T09:00:00",
// //                     "end_time": "2023-11-01T18:00:00",
// //                     "name": "Поездка в город А",
// //                     "departure": "Москва",
// //                     "destination": "Город А",
// //                     "task": "Провести встречу с партнерами"
// //                 },
// //                 {
// //                     "id": 2,
// //                     "start_time": "2023-11-05T14:00:00",
// //                     "end_time": "2023-11-07T12:00:00",
// //                     "name": "Поездка в город Б",
// //                     "departure": "Москва",
// //                     "destination": "Город Б",
// //                     "task": "Провести тренинг для сотрудников"
// //                 },
// //                 {
// //                     "id": 3,
// //                     "start_time": "2023-11-10T10:00:00",
// //                     "end_time": "2023-11-10T16:00:00",
// //                     "name": "Поездка в город В",
// //                     "departure": "Москва",
// //                     "destination": "Город В",
// //                     "task": "Провести презентацию нового продукта"
// //                 }
// //             ],
// //                 "users": [
// //                 {
// //                     "id": 1,
// //                     "name": "Иванов",
// //                     "email": "ivanov@example.com"
// //                 },
// //                 {
// //                     "id": 2,
// //                     "name": "Петров",
// //                     "email": "petrov@example.com"
// //                 },
// //                 {
// //                     "id": 3,
// //                     "name": "Сидоров",
// //                     "email": "sidorov@example.com"
// //                 }
// //             ],
// //                 "tasks": [
// //                 {
// //                     "id": 1,
// //                     "name": "Встреча с партнерами",
// //                     "trip_id": 1
// //                 },
// //                 {
// //                     "id": 2,
// //                     "name": "Тренинг для сотрудников",
// //                     "trip_id": 2
// //                 },
// //                 {
// //                     "id": 3,
// //                     "name": "Презентация нового продукта",
// //                     "trip_id": 3
// //                 }
// //             ]
// //             }
// // Функция для получения данных из файла database.json
            async function fetchData() {
                const response = await fetch('database.json');
                const data = await response.json();
                return data;
            }

// Функция для сортировки поездок
            function sortTrips(trips, sortByAlphabet, sortByDate) {
                if (sortByAlphabet) {
                    trips.sort((a, b) => a.name.localeCompare(b.name));
                }

                if (sortByDate) {
                    trips.sort((a, b) => new Date(a.start_time) - new Date(b.start_time));
                }

                return trips;
            }

// Функция для получения списка пользователей
            function getUsers(users) {
                return users.map(user => user.name);
            }

// Функция для фильтрации поездок по дате отъезда
            function filterTripsByDate(trips, date) {
                return trips.filter(trip => new Date(trip.start_time).toDateString() === new Date(date).toDateString());
            }

// Функция для получения списка задач и их связи с поездками
            function getTasks(tasks, trips) {
                return tasks.map(task => {
                    const trip = trips.find(trip => trip.id === task.trip_id);
                    return {
                        name: task.name,
                        trip: trip ? trip.name : 'Неизвестная поездка'
                    };
                });
            }

// Функция для обновления пользовательского интерфейса
            function updateUI(trips, users, tasks) {
                // Обновление списка поездок
                const tripList = document.getElementById('trip-list');
                tripList.innerHTML = ''; // Очищаем список перед обновлением

                trips.forEach(trip => {
                    const li = document.createElement('li');
                    li.textContent = `${trip.name} - ${trip.start_time} to ${trip.end_time}`;
                    tripList.appendChild(li);
                });}