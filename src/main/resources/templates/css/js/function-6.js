// Функция выполняется после загрузки страницы
window.addEventListener('DOMContentLoaded', function() {
    // Массив с данными о машинах
    var cars = [
        { number: 'A123BC', brand: 'Toyota', color: 'Синий', available: true },
        { number: 'B456DE', brand: 'Honda', color: 'Красный', available: false },
        { number: 'C789FG', brand: 'BMW', color: 'Черный', available: true }
    ];

    // Функция для отображения списка машин
    function displayCarList() {
        var carList = document.getElementById('car-list');
        carList.innerHTML = ''; // Очищаем список перед обновлением

        cars.forEach(function(car) {
            var li = document.createElement('li');
            li.innerHTML = `<strong>Номер:</strong> ${car.number}, <strong>Марка:</strong> ${car.brand}, <strong>Цвет:</strong> ${car.color}, <strong>Доступна:</strong> ${car.available ? 'Да' : 'Нет'}`;
            carList.appendChild(li);
        });
    }

    // Обработчик события для кнопки сортировки
    var sortButton = document.getElementById('sort-button');
    sortButton.addEventListener('click', function() {
        var sortByNameCheckbox = document.getElementById('sort-by-name');
        if (sortByNameCheckbox.checked) {
            cars.sort(function(a, b) {
                return a.brand.localeCompare(b.brand);
            });
        }
        displayCarList();
    });

    // Обработчик события для кнопки фильтрации
    var filterButton = document.getElementById('filter-button');
    filterButton.addEventListener('click', function() {
        var filterAvailableCheckbox = document.getElementById('filter-available');
        var filteredCars = cars.filter(function(car) {
            return car.available === filterAvailableCheckbox.checked;
        });
        cars = filteredCars;
        displayCarList();
    });

    // Обработчик события для кнопки добавления машины
    var addCarButton = document.getElementById('add-car-button');
    addCarButton.addEventListener('click', function() {
        var carNumberInput = document.getElementById('car-number');
        var carBrandInput = document.getElementById('car-brand');
        var carColorInput = document.getElementById('car-color');

        var newCar = {
            number: carNumberInput.value,
            brand: carBrandInput.value,
            color: carColorInput.value,
            available: true
        };

        cars.push(newCar);
        displayCarList();

        // Очищаем поля ввода
        carNumberInput.value = '';
        carBrandInput.value = '';
        carColorInput.value = '';
    });

    // Инициализация списка машин
    displayCarList();
});