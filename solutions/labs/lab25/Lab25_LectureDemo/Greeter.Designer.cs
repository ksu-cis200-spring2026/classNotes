namespace Lab25_LectureDemo
{
    partial class Greeter
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            uxLabelName = new Label();
            uxName = new TextBox();
            uxGreet = new Button();
            uxCount = new Label();
            SuspendLayout();
            // 
            // uxLabelName
            // 
            uxLabelName.AutoSize = true;
            uxLabelName.Location = new Point(32, 30);
            uxLabelName.Margin = new Padding(4, 0, 4, 0);
            uxLabelName.Name = "uxLabelName";
            uxLabelName.Size = new Size(164, 38);
            uxLabelName.TabIndex = 0;
            uxLabelName.Text = "Enter name:";
            // 
            // uxName
            // 
            uxName.Location = new Point(214, 30);
            uxName.Margin = new Padding(4, 5, 4, 5);
            uxName.Name = "uxName";
            uxName.Size = new Size(223, 45);
            uxName.TabIndex = 1;
            // 
            // uxGreet
            // 
            uxGreet.Location = new Point(153, 131);
            uxGreet.Margin = new Padding(4, 5, 4, 5);
            uxGreet.Name = "uxGreet";
            uxGreet.Size = new Size(168, 52);
            uxGreet.TabIndex = 2;
            uxGreet.Text = "Greet Me!";
            uxGreet.UseVisualStyleBackColor = true;
            uxGreet.Click += uxGreet_Click;
            // 
            // uxCount
            // 
            uxCount.AutoSize = true;
            uxCount.Location = new Point(66, 233);
            uxCount.Margin = new Padding(4, 0, 4, 0);
            uxCount.Name = "uxCount";
            uxCount.Size = new Size(344, 38);
            uxCount.TabIndex = 3;
            uxCount.Text = "You have entered 0 names";
            // 
            // Greeter
            // 
            AutoScaleDimensions = new SizeF(15F, 38F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(474, 320);
            Controls.Add(uxCount);
            Controls.Add(uxGreet);
            Controls.Add(uxName);
            Controls.Add(uxLabelName);
            Font = new Font("Segoe UI", 14F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(4, 5, 4, 5);
            Name = "Greeter";
            Text = "Greeter";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label uxLabelName;
        private TextBox uxName;
        private Button uxGreet;
        private Label uxCount;
    }
}
