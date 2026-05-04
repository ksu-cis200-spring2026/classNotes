namespace lab25demo
{
    public partial class Form1 : Form
    {
        private int _count = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void uxGreet_Click(object sender, EventArgs e)
        {
            _count++;
            uxResult.Text = "You have entered " + _count + " names";

            string name = uxName.Text;
            MessageBox.Show("Hello, " + name);
        }
    }
}
