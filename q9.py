fruta=float(input("digite o numero de frutas compradas: "))
custo=(fruta*1,90)
pagamento=(fruta*2,50)
if fruta>=12:
    custo=(fruta*1)
    print(custo)
else:
    pagamento=(fruta*1.3)
    print(pagamento)
