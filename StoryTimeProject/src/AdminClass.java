import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AdminClass {

	protected Shell shell;
	private Text txtAuthCode;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AdminClass window = new AdminClass();
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
		
		txtAuthCode = new Text(shell, SWT.BORDER);
		txtAuthCode.setBounds(210, 119, 152, 19);
		
		Label lblAuthorizationCode = new Label(shell, SWT.NONE);
		lblAuthorizationCode.setFont(SWTResourceManager.getFont(".SF NS Text", 13, SWT.NORMAL));
		lblAuthorizationCode.setBounds(86, 120, 129, 27);
		lblAuthorizationCode.setText("Authorization Code:");
		
		Button btnContinue = new Button(shell, SWT.NONE);
		btnContinue.setBounds(177, 153, 94, 28);
		btnContinue.setText("Continue");
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LoginClass.main(null);
			}
		});
		btnBack.setBounds(10, 240, 94, 28);
		btnBack.setText("Back");
		
		Label lblAdminSignUp = new Label(shell, SWT.NONE);
		lblAdminSignUp.setFont(SWTResourceManager.getFont(".SF NS Text", 17, SWT.NORMAL));
		lblAdminSignUp.setBounds(161, 49, 136, 27);
		lblAdminSignUp.setText("Admin Sign Up:");

	}

}