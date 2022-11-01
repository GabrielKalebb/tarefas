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
    if (valor1>valor2>valor3){
        cout<<valor1+valor2;
    }else if (valor3>valor1>valor2){
        cout<<valor3+valor1;
    }else if(valor2>valor3>valor1){
        cout<<valor2+valor3;
    }
    return 0;
}

