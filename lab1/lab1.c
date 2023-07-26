// #include <stdio.h>
// double circleArea1(int r);
// double circleArea2(double r);
// int main()
// {
//     printf("area = %f\n", circleArea1(3 + 2));
//     printf("area = %f\n", circleArea2(3.5 + 2));
// }
// double circleArea1(int r)
// {
//     return 3.14 * r * r;
// }
// double circleArea2(double r)
// {
//     return 3.14 * r * r;
// }

//implement with preprocessor
#include <stdio.h>
#define PI 3.14159
#define circleArea(r) PI * (r) * (r)
int main()
{
    printf("area = %f\n", circleArea(3 + 2));
    printf("area = %f\n", circleArea(3.5 + 2));
}
