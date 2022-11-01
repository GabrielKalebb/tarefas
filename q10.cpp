#include <iostream>
using namespace std;
int main(){
    float nota1;
    float nota2;
    float media;
    cout<<"Digite a nota primeira nota do aluno: ";
    cin>>nota1;
    cout<<"Digite a segunda nota do aluno: ";
    cin>>nota2;
    media=(nota1+nota2)/2;
if (media>=7){
    cout<<"Aluno aprovado"<<media<<endl;
}
return 0;
}