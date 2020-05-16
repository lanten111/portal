package com.student.portal.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "documents")
public class Documents {

    @Id
    @GeneratedValue(generator = "claimSequenceGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "claimSequenceGenerator", sequenceName = "claimSequence")
    private Long id;

    @Column(name = "document_name")
    private String documentName;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "attached_documents")
    private byte[] attachedDocuments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public byte[] getAttachedDocuments() {
        return attachedDocuments;
    }

    public void setAttachedDocuments(byte[] attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }
}
