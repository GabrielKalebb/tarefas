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
        cout<<valor1;
    if (valor2>valor3>valor1){
        cout<<valor2;
    if (valor3>valor2>valor1){
        cout<<valor3;
    }
    return 0;
}
}