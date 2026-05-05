namespace Lab25Demo
{
    partial class Form1
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
            uxResult = new Label();
            SuspendLayout();
            // 
            // uxLabelName
            // 
            uxLabelName.AutoSize = true;
            uxLabelName.Location = new Point(25, 34);
            uxLabelName.Name = "uxLabelName";
            uxLabelName.Size = new Size(105, 25);
            uxLabelName.TabIndex = 0;
            uxLabelName.Text = "Enter name:";
            // 
            // uxName
            // 
            uxName.Location = new Point(164, 34);
            uxName.Name = "uxName";
            uxName.Size = new Size(150, 31);
            uxName.TabIndex = 1;
            // 
            // uxGreet
            // 
            uxGreet.Location = new Point(98, 97);
            uxGreet.Name = "uxGreet";
            uxGreet.Size = new Size(112, 34);
            uxGreet.TabIndex = 2;
            uxGreet.Text = "Greet Me!";
            uxGreet.UseVisualStyleBackColor = true;
            uxGreet.Click += uxGreet_Click;
            // 
            // uxResult
            // 
            uxResult.AutoSize = true;
            uxResult.Location = new Point(55, 167);
            uxResult.Name = "uxResult";
            uxResult.Size = new Size(224, 25);
            uxResult.TabIndex = 3;
            uxResult.Text = "You have entered 0 names.";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(10F, 25F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(360, 263);
            Controls.Add(uxResult);
            Controls.Add(uxGreet);
            Controls.Add(uxName);
            Controls.Add(uxLabelName);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label uxLabelName;
        private TextBox uxName;
        private Button uxGreet;
        private Label uxResult;
    }
}
