# test-task-tau
Practical test application for company ADP Labs

rest test requests:

change number of coins:
  curl --request PUT 'http://localhost:8080/tau/coins/?coinsEnum=TEN_CENTS&newQuantiy=100'
  
get minimum coins:
  curl --request GET 'http://localhost:8080/tau/bills/?billsAmount=20'
