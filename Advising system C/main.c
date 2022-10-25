#include <stdio.h>
#include <stdlib.h>
struct signup{
   char FirstName[20];
   char SecondName[20];
   char studentid[20];
   char email[20];
   char password[10];
   char reenterpassword[10];
   }s[1];
int main()
{
    struct signup;
    int i,a,j;
    char x[20],y[20];
    for(i=0;i<1;i++)
    {
        printf("\t\t\t\t\tWelcome to the student portal !!\n");
        printf("Press 1 to sign up\nPress 2 to login\n");
        scanf("%d",&a);
        if(a==1)
        {
            printf("First Name:\n");
            scanf("%s",s[i].FirstName);
            printf("Second Name:\n");
            scanf("%s",s[i].SecondName);
            printf("Student ID:\n");
            scanf("%s",s[i].studentid);
            printf("Email Adress:\n");
            scanf("%s",s[i].email);
            printf("Password:\n");
            scanf("%s",s[i].password);
            while(strlen(s[i].password)<8)
            {
                printf("Your password is too short.\nPlease try again:\n");
                scanf("%s",s[i].password);
            }
            printf("Confirm password:\n");
            scanf("%s",s[i].reenterpassword);

            if(strcmp(s[i].password,s[i].reenterpassword)!=0)
            {
                printf("Passwords do not match.\nConfirm password again:\n");
                scanf("%s",s[i].reenterpassword);
            }
            printf("You have successfully signed up!\n\n");
            printf("LOGIN\n\n");
            printf("Enter Student ID:\n");
            scanf("%s",x);
            printf("Enter password:\n");
            scanf("%s",y);
            int g,h;
            g=strcmp(x,s[i].studentid);
            h=strcmp(y,s[i].password);
            if((g!=0)||(h!=0))
            {
                printf("Your username/password is wrong.\nPlease try again.\n");
                printf("Enter Student ID:\n");
                scanf("%s",x);
                printf("Enter password:\n");
                scanf("%s",y);

            }
            else
            {
                int t,v,n;
                FILE*StudentInfo;
                FILE*advisingslip;
                printf("\t\t\t\t\tWelcome %s\n",s[i].FirstName);
                printf("Enter the serial number of preferable option:\n1.Edit student information.\n2.Results(Option not available)\n3.Attendance(Option not available).\n4.Advising.\n5.Exit\n");
                scanf("%d",&t);
                switch(t)
                {
                    case 1:
                      //FILE*StudentInfo;
                      StudentInfo=fopen("Student Information.txt","r+");
                      fprintf(StudentInfo,"%s",s[i].FirstName);
                      fprintf(StudentInfo,"%s",s[i].email);
                      fprintf(StudentInfo,"%s",s[i].studentid);
                      break;

                    case 2:
                      printf("The option is currently unavailable.\nPlease choose some other option.\n");
                      break;

                     case 3:
                      printf("The option is currently unavailable.\nPlease choose some other option.\n");
                      break;
                    case 4:
                      //int v,n;
                     // FILE*advisingslip;
                      advisingslip=fopen("AdvisingSlip.txt","r+");
                      fprintf(advisingslip,"%s\n",s[i].FirstName);
                      fprintf(advisingslip,"%s\n",s[i].studentid);
                      fprintf(advisingslip,"COURSE NAME\t\tSLOT\t\tTIMING\n");
                      printf("Choose the serial number of preferable days for CSE115\n1.ST(Sunday and Tuesday)\n2.MW(Monday and Wednesday\n3.RA(Thursday and Saturday)\n");
                      scanf("%d",&v);
                      switch(v)
                      {
                          case 1:
                            printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\tST\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\tST\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\tST\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\tST\t\t2:40-4:10\n");
                                 break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\tST\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                        case 2:
                            printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t2:40-4:10\n");
                                  break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\tMW\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                        case 3:
                          printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t2:40-4:10\n");
                                  break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\tRA\t\t\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                     }
                switch(t==5)
                {
                    break;
                }
            }



          }
        }
        else
        {
          for(i=0;i<1;i++)
          {
            printf("LOGIN\n\n");
            printf("Enter Student ID:\n");
            scanf("%s",x);
            printf("Enter password:\n");
            scanf("%s",y);
            int g,h;
            g=strcmp(x,s[i].studentid);
            h=strcmp(y,s[i].password);
            if((g!=0)||(h!=0))
            {
                printf("Your username/password is wrong.\nPlease try again.\n");
                printf("Enter Student ID:\n");
                scanf("%s",x);
                printf("Enter password:\n");
                scanf("%s",y);

            }
            else
            {
                int t,v,n;
                FILE*StudentInfo;
                FILE*advisingslip;
                printf("\t\t\t\t\tWelcome %s\n",s[i].FirstName);
                printf("Enter the serial number of preferable option:\n1.Edit student information.\n2.Results(Option not available)\n3.Attendance(Option not available).\n4.Advising.\n5.Exit\n");
                scanf("%d",&t);
                switch(t)
                {
                    case 1:
                      //FILE*StudentInfo;
                      StudentInfo=fopen("Student Information.txt","r+");
                      fprintf(StudentInfo,"%s",s[i].FirstName);
                      fprintf(StudentInfo,"%s",s[i].email);
                      fprintf(StudentInfo,"%s",s[i].studentid);
                      break;

                    case 2:
                      printf("The option is currently unavailable.\nPlease choose some other option.\n");
                      break;

                     case 3:
                      printf("The option is currently unavailable.\nPlease choose some other option.\n");
                      break;
                    case 4:
                      //int v,n;
                     // FILE*advisingslip;
                      advisingslip=fopen("AdvisingSlip.txt","r+");
                      fprintf(advisingslip,"%s\n",s[i].FirstName);
                      fprintf(advisingslip,"%s\n",s[i].studentid);
                      fprintf(advisingslip,"COURSE NAME\t\tSLOT\t\tTIMING\n");
                      printf("Choose the serial number of preferable days for CSE115\n1.ST(Sunday and Tuesday)\n2.MW(Monday and Wednesday\n3.RA(Thursday and Saturday)\n");
                      scanf("%d",&v);
                      switch(v)
                      {
                          case 1:
                            printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t2:40-4:10\n");
                                  break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\t\tST\t\t\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                        case 2:
                            printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t2:40-4:10\n");
                                  break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\t\tMW\t\t\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                        case 3:
                          printf("Choose serial number of preferable timings for CSE115:\n1.8:00-9:30\n2.9:40-11:10\n3.11:20-12:50\n4.1:00-2:30\n5.2:40-4:10\n6.4:20-5:50\n");
                            scanf("%d",&n);
                            switch(n)
                            {
                                case 1:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t8:00-9:30\n");
                                  break;
                                case 2:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t9:40-11:10\n");
                                  break;
                                case 3:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t11:20-12:50\n");
                                  break;
                                case 4:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t1:00-2:30\n");
                                  break;
                                case 5:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t2:40-4:10\n");
                                  break;
                                case 6:
                                  fprintf(advisingslip,"CSE115\t\t\t\tRA\t\t\t\t4:20-5:50\n");
                                  break;
                            }
                            break;
                     }
                switch(t==5)
                {
                    break;
                }
            }



          }
        }
            }
        }

}





