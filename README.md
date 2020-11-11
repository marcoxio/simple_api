# Endpoints
Example Simple Api Guide In28Minutes

## List Question
`http://localhost:56564/surveys/Survey1/questions`

## GetQuestionById
`http://localhost:8080/surveys/Survey1/questions/Question1`

## Create Question
`http://localhost:8080/surveys/Survey1/questions`

{
    "description": "Second Most Populous Country in the World",
    "correctAnswer": "India",
    "options": [
        "India",
        "Russia",
        "United States",
        "China"
    ]
}
# Auth Basic

## Auth Admin
    * admin1
    * secret1

## Auth User
 * user1
 * secret1

# Users

## GetUsers
`http://localhost:8080/users`

## CreateUsers
`http://localhost:8080/users`
{
    "name": "Marco",
    "role": "Admin"
}

## GetUsersById
`http://localhost:8080/users/1`

## GetUserPagination
`http://localhost:8080/users/?size=4`

`http://localhost:8080/users/?sort=name,desc`

## GetUserRole
`http://localhost:8080/users/search/findByRole?role=Admin`