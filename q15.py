valor1=int(input("Digite o primerio valor"))
valor2=int(input("Digite o segundo valor"))
valor3=int(input("Digite o terceiro valor"))
if valor1>(valor2+valor3):
   print("Não é um triângulo")
elif valor2>(valor1+valor3):
    print("Não é um triângulo")
elif valor3>(valor1+valor2):
    print("Não é um triângulo")
else:
    print("É um triângulo")


