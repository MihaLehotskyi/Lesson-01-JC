// Task 1
var user = {};
user.name = 'ПИЛИП';
user.surname = 'ШЕВЧЕНКО';
user.name = 'СЕРГІЙ';
delete user.name;

// Task 2
var employeeSalaries = {
    salary : 100,
    salary1 : 200,
    salary2 : 300
}
function add(){
    count = 0;
    for(var key in employeeSalaries){
        count++;
    }
    if(count>0){
        return (employeeSalaries.salary + 
        employeeSalaries.salary1 +employeeSalaries.salary2);
    }else return 0;
}
console.log(add());

