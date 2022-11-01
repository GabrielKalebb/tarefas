#include <iostream>
using namespace std;
int main(){
	int nota1;
	int nota2;
	int nota3;
	int  media;
	cout<<"Digite a primeria nota do aluno:";
	cin>>nota1;
	cout<<"Digite a segunda nota do aluno:";
	cin>>nota2;
	cout<<"Digite a terceira nota do aluno:";
	cin>>nota3;
	media=((nota1*2)+(nota2*3)+(nota3*5))/10;
	cout<<"A média do aluno é:"<<media<<endl;
}

