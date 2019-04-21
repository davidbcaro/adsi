/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.model.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 1349397
 */
@Entity
@Table(name = "email_server")
@NamedQueries({
    @NamedQuery(name = "EmailServer.findAll", query = "SELECT e FROM EmailServer e")
    , @NamedQuery(name = "EmailServer.findByEmail", query = "SELECT e FROM EmailServer e WHERE e.email = :email")
    , @NamedQuery(name = "EmailServer.findByLikeEmail", query = "SELECT e FROM EmailServer e WHERE e.email LIKE :email")
    , @NamedQuery(name = "EmailServer.findByPassword", query = "SELECT e FROM EmailServer e WHERE e.password = :password")
    , @NamedQuery(name = "EmailServer.findByLikePassword", query = "SELECT e FROM EmailServer e WHERE e.password LIKE :password")
    , @NamedQuery(name = "EmailServer.findBySmtpHost", query = "SELECT e FROM EmailServer e WHERE e.smtpHost = :smtpHost")
    , @NamedQuery(name = "EmailServer.findByLikeSmtpHost", query = "SELECT e FROM EmailServer e WHERE e.smtpHost LIKE :smtpHost")
    , @NamedQuery(name = "EmailServer.findBySmtpPort", query = "SELECT e FROM EmailServer e WHERE e.smtpPort = :smtpPort")
    , @NamedQuery(name = "EmailServer.findByLikeSmtpPort", query = "SELECT e FROM EmailServer e WHERE e.smtpPort LIKE :smtpPort")
    , @NamedQuery(name = "EmailServer.findBySmtpStartTlsEnable", query = "SELECT e FROM EmailServer e WHERE e.smtpStartTlsEnable = :smtpStartTlsEnable")
    , @NamedQuery(name = "EmailServer.findByLikeSmtpStartTlsEnable", query = "SELECT e FROM EmailServer e WHERE e.smtpStartTlsEnable LIKE :smtpStartTlsEnable")
    , @NamedQuery(name = "EmailServer.findBySmtpAuth", query = "SELECT e FROM EmailServer e WHERE e.smtpAuth = :smtpAuth")
    , @NamedQuery(name = "EmailServer.findByLikeSmtpAuth", query = "SELECT e FROM EmailServer e WHERE e.smtpAuth LIKE :smtpAuth")
    , @NamedQuery(name = "EmailServer.findByRecoveryOrder", query = "SELECT e FROM EmailServer e WHERE e.recoveryOrder = :recoveryOrder")
    , @NamedQuery(name = "EmailServer.findByLikeRecoveryOrder", query = "SELECT e FROM EmailServer e WHERE e.recoveryOrder LIKE :recoveryOrder")
    , @NamedQuery(name = "EmailServer.findByRecoveryMessage", query = "SELECT e FROM EmailServer e WHERE e.recoveryMessage = :recoveryMessage")
    , @NamedQuery(name = "EmailServer.findByLikeRecoveryMessage", query = "SELECT e FROM EmailServer e WHERE e.recoveryMessage LIKE :recoveryMessage")
    , @NamedQuery(name = "EmailServer.updatePrimaryKey", query = "UPDATE EmailServer e SET e.email = :emailNew WHERE e.email = :emailOld")
})
public class EmailServer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "password", length = 45)
    private String password;
    @Column(name = "smtp_host", length = 45)
    private String smtpHost;
    @Column(name = "smtp_port")
    private Integer smtpPort;
    @Column(name = "smtp_start_tls_enable")
    private Boolean smtpStartTlsEnable;
    @Column(name = "smtp_auth")
    private Boolean smtpAuth;
    @Column(name = "recovery_order", length = 45)
    private String recoveryOrder;
    @Column(name = "recovery_message", length = 45)
    private String recoveryMessage;

    public EmailServer() {
    }

    public EmailServer(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Boolean getSmtpStartTlsEnable() {
        return smtpStartTlsEnable;
    }

    public void setSmtpStartTlsEnable(Boolean smtpStartTlsEnable) {
        this.smtpStartTlsEnable = smtpStartTlsEnable;
    }

    public Boolean getSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(Boolean smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public String getRecoveryOrder() {
        return recoveryOrder;
    }

    public void setRecoveryOrder(String recoveryOrder) {
        this.recoveryOrder = recoveryOrder;
    }

    public String getRecoveryMessage() {
        return recoveryMessage;
    }

    public void setRecoveryMessage(String recoveryMessage) {
        this.recoveryMessage = recoveryMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailServer)) {
            return false;
        }
        EmailServer other = (EmailServer) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.model.jpa.entities.EmailServer[ email=" + email + " ]";
    }
    
}