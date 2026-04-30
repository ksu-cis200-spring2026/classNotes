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
            //"length width"
            string[] pieces = line.Split(' ');

            int len = Convert.ToInt32(pieces[0]);
            int wid = Convert.ToInt32(pieces[1]);

            list.Add(new Rectangle(){Length=len, Width=wid});

            //process line
        }
    }
}
catch (IOException) {
    Console.WriteLine("error reading file");
}

//how to print all rectangles?
foreach(Rectangle r in list) {
    Console.WriteLine(r);
}
