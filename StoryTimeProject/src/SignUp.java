import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SignUp {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SignUp window = new SignUp();
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
		
		Label lblSignUp = new Label(shell, SWT.NONE);
		lblSignUp.setFont(SWTResourceManager.getFont(".SF NS Text", 17, SWT.NORMAL));
		lblSignUp.setBounds(188, 67, 70, 36);
		lblSignUp.setText("Sign Up:");
		
		Button btnAdmin = new Button(shell, SWT.NONE);
		btnAdmin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AdminClass.main(null);
			}
		});
		btnAdmin.setBounds(127, 126, 94, 28);
		btnAdmin.setText("Admin");
		
		Button btnMember = new Button(shell, SWT.NONE);
		btnMember.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				RegistrationClass.main(null);
			}
		});
		btnMember.setBounds(227, 126, 94, 28);
		btnMember.setText("Member");
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LoginClass.main(null);
			}
		});
		btnBack.setBounds(10, 240, 94, 28);
		btnBack.setText("Back");

	}

}
