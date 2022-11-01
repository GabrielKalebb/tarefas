valor1=int(input("Digite o primerio valor"))
valor2=int(input("Digite o segundo valor"))
valor3=int(input("Digite o terceiro valor"))

if valor1>valor2&valor1>valor3:
    maior=valor1
    if valor2>valor3:
        maior2=valor2
    else:
        maior2=valor3

elif valor2>valor1&valor2>valor3:
    maior=valor2
    if valor1>valor3:
        maior2=valor1
    else:
        maior2=valor3
elif valor3>valor2&valor3>valor1:
    maior=valor3
    if valor1>valor2:
        maior2=valor1
    else:
        maior2=valor2
else:
    ("Os valores são iguais")
print(maior)  
print(maior2)  
print(maior+maior2)    