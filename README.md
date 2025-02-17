# AI-Помічник для сайту (Java)

## 📌 Опис
Цей додаток на **Spring Boot** підключається до **OpenAI API** та працює як **AI-помічник**, який відповідає на запити.

## 🚀 Функції
- Чат-бот у реальному часі.
- Використання штучного інтелекту OpenAI.
- API для інтеграції в сайти.

## 📥 Використання
1. Отримайте **API-ключ** на [OpenAI](https://openai.com/).
2. Вставте його у `src/main/resources/application.properties`.
3. Запустіть програму командою:
   ```sh
   mvn spring-boot:run
   ```
4. Відправте запит:
   ```sh
   curl -X POST http://localhost:8080/api/chat -H "Content-Type: application/json" -d '"Привіт, що ти можеш?"'
   ```

## 🔧 Додаткові можливості
- Додавання підтримки багатомовності.
- Розширення можливостей з AI-моделями.
- Інтеграція з Telegram API.

Ліцензія: MIT License
