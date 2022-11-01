nota1=float(input("Digite a primeira nota do aluno: "))
nota2=float(input("Digite a segunda nota do aluno: "))
media=(nota1+nota2)/2
if media>=6:
    print("Aluno aprovado", media)
else:
    print("Aluno reprovado", media)