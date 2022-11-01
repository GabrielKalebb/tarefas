#include <iostream>
using namespace std;
int main(){
    int valor1;
    int valor2;
    int valor3;
    cout<<"Digite o primeiro valor: ";
    cin>>valor1;
    cout<<"Digite o segundo valor: ";
    cin>>valor2;
    cout<<"Digite o tercerio valor: ";
    cin>>valor3;
    if (valor1>(valor2+valor3)){
        cout<<"Não é um triângulo";
    }else if(valor2>(valor1+valor3)){
        cout<<"Não é um triângulo";
    }else if(valor3>(valor1+valor2)){
       cout<<"Não é um triângulo";
    }else{
        cout<<"É um triângulo";
    }return 0;
}
