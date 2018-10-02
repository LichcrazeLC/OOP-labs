

#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>

using namespace std;
string stack1;
int index1 = 0;

void push(char parant);
void pop();
int isEmpty();

int main()
{

    string data;
    ifstream infile;
    infile.open("expresie_matem.txt");

    cout << "Reading from the file" << endl;

    while (!infile.eof())
    {
        infile >> data;
        cout << data;
    }

    infile.close();



    for (int i = 0; i < data.length(); i++)
    {

        if (data[i] == '(')
        {
            push(data[i]);
        }
        else if (data[i] == ')')
        {

            if (isEmpty() == 1)
            {
                cout << " \n invalid expression";

                break;
            }
            else
            {
                pop();

            }
        }
    }

    if (!isEmpty())
    {
        cout << " \n invalid expression";
    }


    return 0;
}

void push(char parant)
{
    stack1.insert(stack1.end(), parant);
    index1++;
}

void pop()
{

    stack1.erase(index1 - 1);
    index1--;
}

int isEmpty()
{
    if (stack1.length() == 0){
        return 1;
    } else return 0;
}
