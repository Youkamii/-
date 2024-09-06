#include <stdio.h>

int main(void)
{
    int a, b;
    
    scanf("%d", &a);
    scanf("%d", &b);
    printf("%.9lf", (double)a / b);
    return (0);
}