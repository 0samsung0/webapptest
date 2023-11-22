// Функция 1: Добавить задачу
document.getElementById('add-task-btn').addEventListener('click', function() {
    var input = document.getElementById('add-task-input');
    var value = input.value;

    // Логика для добавления задачи
    console.log('Добавлена задача: ' + value);

    input.value = '';
});

// Функция 2: Удалить задачу
document.getElementById('delete-task-btn').addEventListener('click', function() {
    var select = document.getElementById('delete-task-select');
    var selectedOption = select.options[select.selectedIndex];

    if (selectedOption.value !== '') {
        var value = selectedOption.text;

        // Логика для удаления задачи
        console.log('Удалена задача: ' + value);

        select.removeChild(selectedOption);
        select.value = '';
    }
});

// Функция 3: Изменить задачу
document.getElementById('change-task-btn').addEventListener('click', function() {
    var select = document.getElementById('change-task-select');
    var selectedOption = select.options[select.selectedIndex];
    var input = document.getElementById('change-task-input');
    var newValue = input.value;

    if (selectedOption.value !== '') {
        var oldValue = selectedOption.text;

        // Логика для изменения задачи
        console.log('Задача "' + oldValue + '" изменена на "' + newValue + '"');

        selectedOption.text = newValue;
        input.value = '';
    }
});

// Функция 4: Поиск задачи
document.getElementById('search-task-btn').addEventListener('click', function() {
    var input = document.getElementById('search-task-input');
    var value = input.value;

    // Логика для поиска задачи
    console.log('Поиск задачи: ' + value);

    input.value = '';
});

// Функция 5: Очистить список задач
document.getElementById('clear-task-list-btn').addEventListener('click', function() {
    // Логика для очистки списка задач
    console.log('Список задач очищен');
});