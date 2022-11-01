#include <iostream>
using namespace std;
int main(){
    float fruta;
    float pagamento;
    float custo;
    cout<<"Digite a quantidade de frutas compradas: ";
    cin>>fruta;
    if (fruta>=12){
        custo=fruta*1.9;
        cout<<custo;
    }else{
        pagamento=fruta*2.5;
        cout<<pagamento;
    }
    return 0;
    }
