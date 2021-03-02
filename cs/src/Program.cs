using System;

namespace cs
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var foo = GiveFunc("Overlord");
            var result = foo("Nathan", 12);
            Console.WriteLine(result);

            TakeFunc((number, shouldNegate) =>
            {
                var output = shouldNegate ? -number : number;
                Console.WriteLine(output);
            });
        }

        private static Func<string, int, string> GiveFunc(string title)
        {
            return (name, age) => $"{title} {name}: {age} years old";
        }

        private static void TakeFunc(Action<double, bool> action)
        {
            action(12.5, true);
        }
    }
}
