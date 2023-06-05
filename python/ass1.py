def calculate_simple_interest(principal, time, gender, age):
    if gender == 'Female' and age >= 60:
        rate = 0.08
    elif gender == 'Female' and age < 60:
        rate = 0.06
    elif gender == 'Male' and age >= 60:
        rate = 0.07
    elif gender == 'Male' and age < 60:
        rate = 0.05
    else:
        return 'Invalid gender or age input.'

    interest = principal * rate * time
    return interest

principal_amount=int(input())
time_period=int(input())
customer_gender=int(input())
customer_age=int(input())
simple_interest = calculate_simple_interest(principal_amount, time_period, customer_gender, customer_age)
print("Simple Interest:", simple_interest)
