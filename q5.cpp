#include <iostream>
using namespace std;
int main(){
    int salario;
    int reajuste;
    int sf;
    int porcentagem;
    cout<<"Digite o seu salário: ";
    cin>>salario;
    cout<<"Digite o seu reajuste: ";
    cin>>reajuste;
    porcentagem=(salario*reajuste)/100;
    sf=salario+porcentagem;
    cout<<"o seu salario será de: "<<sf;
    return 0;
}