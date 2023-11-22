// Функция 1: Добавить элемент
document.getElementById('add-item-btn').addEventListener('click', function() {
    var input = document.getElementById('add-item-input');
    var value = input.value;

    // Логика для добавления элемента
    console.log('Добавлен элемент: ' + value);

    input.value = '';
});

// Функция 2: Удалить элемент
document.getElementById('delete-item-btn').addEventListener('click', function() {
    var select = document.getElementById('delete-item-select');
    var selectedOption = select.options[select.selectedIndex];

    if (selectedOption.value !== '') {
        var value = selectedOption.text;

        // Логика для удаления элемента
        console.log('Удален элемент: ' + value);

        select.removeChild(selectedOption);
    }
});

// Функция 3: Изменить элемент
document.getElementById('change-item-btn').addEventListener('click', function() {
    var select = document.getElementById('change-iteminput');
    var selectedOption = select.options[select.selectedIndex];
    var input = document.getElementById('change-item-input');
    var newValue = input.value;

    if (selectedOption.value !== '') {
        var oldValue = selectedOption.text;

        // Логика для изменения элемента
        console.log('Изменен элемент: ' + oldValue + ' -> ' + newValue);

        selectedOption.text = newValue;
        input.value = '';
    }
});

// Функция 4: Поиск элемента
document.getElementById('search-item-btn').addEventListener('click', function() {
    var input = document.getElementById('search-item-input');
    var value = input.value;

    // Логика для поиска элемента
    console.log('Поиск элемента: ' + value);

    input.value = '';
});

// Функция 5: Очистить список
document.getElementById('clear-list-btn').addEventListener('click', function() {
    // Логика для очистки списка
    console.log('Список очищен');
});