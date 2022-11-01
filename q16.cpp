#include <iostream>
using namespace std;
int main(){
    int anos,horas,dh,dinheiro;
    cout<<"Digite o total de anos trabalhados:";
    cin>>anos;
    cout<<"Digite o total de horas trabalhadas:";
    cin>>horas;
    cout<<"Digite o quanto você ganha por hora:";
    cin>>dh;
    dinheiro=horas*dh;
    if (anos<=1){
        cout<<"O salário final é:"<<(1500+dinheiro);
    }else if ((anos>1)&&(anos<3)){
        cout<<"O salário final é:"<<(2000+dinheiro);
    }else{
        cout<<"O salário final é:"<<(3000+dinheiro);
    }
}


