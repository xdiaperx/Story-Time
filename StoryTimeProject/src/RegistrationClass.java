import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class RegistrationClass {

	protected Shell shell;
	private Text txtFName;
	private Text txtLName;
	private Text txtUsername;
	private Text txtPassword;
	private Text txtPassConf;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RegistrationClass window = new RegistrationClass();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label lblRegister = new Label(shell, SWT.NONE);
		lblRegister.setFont(SWTResourceManager.getFont(".SF NS Text", 17, SWT.NORMAL));
		lblRegister.setBounds(23, 10, 81, 34);
		lblRegister.setText("Register");
		
		Label lblFirstName = new Label(shell, SWT.NONE);
		lblFirstName.setBounds(67, 50, 70, 14);
		lblFirstName.setText("First Name:");
		
		Label lblLastName = new Label(shell, SWT.NONE);
		lblLastName.setBounds(67, 83, 70, 14);
		lblLastName.setText("Last Name:");
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(67, 113, 59, 14);
		lblUsername.setText("Username:");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(67, 147, 59, 14);
		lblPassword.setText("Password:");
		
		Label lblPasswordConfirmation = new Label(shell, SWT.NONE);
		lblPasswordConfirmation.setBounds(67, 174, 130, 14);
		lblPasswordConfirmation.setText("Password Confirmation:");
		
		txtFName = new Text(shell, SWT.BORDER);
		txtFName.setBounds(132, 47, 231, 19);
		
		txtLName = new Text(shell, SWT.BORDER);
		txtLName.setBounds(132, 80, 231, 19);
		
		txtUsername = new Text(shell, SWT.BORDER);
		txtUsername.setBounds(132, 110, 231, 19);
		
		txtPassword = new Text(shell, SWT.BORDER);
		txtPassword.setBounds(132, 144, 231, 19);
		
		txtPassConf = new Text(shell, SWT.BORDER);
		txtPassConf.setBounds(197, 171, 166, 19);
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LoginClass.main(null);
			}
		});
		btnExit.setBounds(122, 206, 94, 28);
		btnExit.setText("Exit");
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.setBounds(222, 206, 94, 28);
		btnLogin.setText("Login");
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SignUp.main(null);
			}
		});
		btnBack.setBounds(10, 240, 94, 28);
		btnBack.setText("Back");

	}

}