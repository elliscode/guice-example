package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactFactory {
    List<ContactInfo> contactList = new ArrayList<>();

    public List<ContactInfo> getList() {
        return Collections.unmodifiableList(contactList);
    }

    public ContactInfo create(String contactName, Integer contactNumber) {
        ContactInfo output = new ContactInfo(contactName, contactNumber);
        contactList.add(output);
        return output;
    }

    public class ContactInfo {
        private final String contactName;
        private final Integer contactNumber;

        private ContactInfo(String contactName, Integer contactNumber) {
            this.contactName = contactName;
            this.contactNumber = contactNumber;
        }

        public String getContactName() {
            return contactName;
        }

        public Integer getContactNumber() {
            return contactNumber;
        }
    }
}
