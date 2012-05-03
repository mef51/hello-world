#include <iostream>
using namespace std;

class Greeter {
	char* message;
public:
	void greet();
};

void Greeter::greet(){
    cout << "Hello World!\n";
}

int main(){

    Greeter greeter;
    greeter.greet();
	return 0;
}
