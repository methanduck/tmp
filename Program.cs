using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication11
{
    class Program
    {
        interface IBorder
        {
            void WriteBorder();
        };
        
        class Monitor
        {
            private IBorder ibord;
            public Monitor(IBorder input)
            {
                this.ibord = input;
            }
           public void start()
            {
                ibord.WriteBorder();
            }
        };
        class monitorStar:IBorder
        {
            string border;
            public monitorStar(string input)
            {
                this.border = input;
            }

            public void WriteBorder()
            {
                for (int i = 0; i < 14; i++)
                    Console.Write("{0}", this.border); //첫줄
                Console.WriteLine(); Console.Write("{0}", this.border);
                Console.Write("hello world!"); Console.Write("{0}", this.border);
                Console.WriteLine();
                for (int i = 0; i < 14; i++)
                    Console.Write("{0}", this.border);
                Console.WriteLine();
               
            }
        }
        class monitorSlash:IBorder
            {
                string border;
                public monitorSlash(string input)
                {
                    this.border = input;
                }

                public void WriteBorder()
                {
                    for (int i = 0; i < 14; i++)
                        Console.Write("{0}", this.border); //첫줄
                    Console.WriteLine(); Console.Write("{0}", this.border);
                    Console.Write("hello world!"); Console.Write("{0}", this.border);
                    Console.WriteLine();
                    for (int i = 0; i < 14; i++)
                        Console.Write("{0}", this.border);
                    Console.WriteLine();
                }
            }
        class monitorWave:IBorder
                {
                    string border;
                    public monitorWave(string input)
                    {
                        this.border = input;
                    }

                    public void WriteBorder()
                    {
                        for (int i = 0; i < 14; i++)
                            Console.Write("{0}", this.border); //첫줄
                        Console.WriteLine(); Console.Write("{0}", this.border);
                        Console.Write("hello world!"); Console.Write("{0}", this.border);
                        Console.WriteLine();
                        for (int i = 0; i < 14; i++)
                            Console.Write("{0}", this.border);
                        Console.WriteLine();
                    }
                }

        

        static void Main(string[] args)
        {
            Monitor star = new Monitor(new monitorStar("*"));
            Monitor slash = new Monitor(new monitorSlash("/"));
            Monitor wave = new Monitor(new monitorWave("~"));

            star.start();
            slash.start();
            wave.start();
        }
    }
}
