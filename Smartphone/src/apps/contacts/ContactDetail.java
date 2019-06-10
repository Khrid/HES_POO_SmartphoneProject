package apps.contacts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class ContactDetail extends ContactBase {
    protected Contact contact;

    protected void InitializeFields(){
        textNom.setEditable(false);
        textPrenom.setEditable(false);
        textFixe.setEditable(false);
        textMobile.setEditable(false);
        textEmail.setEditable(false);
    }

    public ContactDetail(ContactsMain parent, ContactsController controller) {
        super(parent,controller);
        buttonCancel.addActionListener(new BackContactsList());

        InitializeFields();
    }

    public void SetContact(Contact contact){
        this.contact=contact;
        textNom.setText(contact.getNom());
        textPrenom.setText(contact.getPrenom());
        textFixe.setText(contact.getFixe());
        textMobile.setText(contact.getMobile());
        textEmail.setText(contact.getEmail());
    }

    // LISTENERS
    class BackContactsList implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            parent.ShowContactsMain();
        }
    }
}
