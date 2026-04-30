using System;
using System.IO;
using System.Collections.Generic;

//create a list of rectangles
List<Rectangle> list = new List<Rectangle>();

//read from input file
try {
    using (StreamReader r = new StreamReader("dim.txt")) {
        while (!r.EndOfStream) {
            string line = r.ReadLine();
            //line is like "3 4"

            //process line
            string[] pieces = line.Split(' ');
            int len = Convert.ToInt32(pieces[0]);
            int wid = Convert.ToInt32(pieces[1]);

            Rectangle rect = new Rectangle(){Length = len, Width = wid};
            list.Add(rect);
        }
    }
}
catch (IOException) {
    //handle problems
}

//how to print all rectangles?
foreach(Rectangle cur in list) {
    Console.WriteLine(cur);
}
