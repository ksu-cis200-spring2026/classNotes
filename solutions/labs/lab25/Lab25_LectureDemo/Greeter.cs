namespace Lab25_LectureDemo
{
    public partial class Greeter : Form
    {
        private int _count = 0;
        public Greeter()
        {
            InitializeComponent();
        }

        private void uxGreet_Click(object sender, EventArgs e)
        {
            _count++;
            uxCount.Text = $"You have entered {_count} names";
            MessageBox.Show("Hello, " + uxName.Text);
        }
    }
}
