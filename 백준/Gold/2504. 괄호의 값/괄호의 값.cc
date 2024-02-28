#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int tmp, res, len, flag, set;
    char arr[31];
    stack<int> st;

    set = 0; // 괄호가 열릴 경우만 계산하게 하는 스위치
    res = 0; // 총 합
    tmp = 1; // 괄호 누적에 따라 res에 더해지는 임시 누적값
    flag = 0; // 잘못된 입력값을 걸러내는 플래그
    cin >> arr;
    len = strlen(arr);
    for (int i = 0; i < len; i++)
        {
            if (arr[i] == '(')
            {
                tmp *= 2;
                st.push('(');
                set = 1; // 괄호 열려있음을 의미
            }
            else if (arr[i] == '[')
            {
                tmp *= 3;
                st.push('[');
                set = 1;
            }
            else if (arr[i] == ')')
            {
                if (st.empty() == 1 || st.top() == '[')
                {
                    flag = 1;
                    break;
                }
                else if (set == 1) // res에 tmp값을 누적해주는 경우는 괄호가 열려있을때만
                {
                    res += tmp;
                    set = 0; // 괄호를 닫아줌
                }
                tmp /= 2;
                st.pop();
            }
            else if (arr[i] == ']')
            {
                if (st.empty() == 1 || st.top() == '(')
                {
                    flag = 1;
                    break;
                }
                else if (set == 1)
                {
                    res += tmp;
                    set = 0;
                }
                tmp /= 3;
                st.pop();
            }
        }
    if (flag == 1 || st.empty() == 0)
        cout << "0";
    else
        cout << res;
}