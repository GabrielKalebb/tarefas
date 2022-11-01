anos=int(input("Digite o total de anos trabalhados:"))
horas=int(input("Digite o total de horas trabalhadas:"))
DH=int(input("Digite quanto recebe por hora;"))
dinheiro=horas*DH
if anos<=1:
  print(1500+dinheiro)
if anos>1&anos<3:
  print(2000+dinheiro)
if anos>3:
  print (3000+dinheiro)
