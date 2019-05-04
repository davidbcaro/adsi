/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.tidsplanjpa.model.jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 1349397
 */
@Entity
@Table(name = "working_day")
@NamedQueries({
    @NamedQuery(name = "WorkingDay.findAll", query = "SELECT w FROM WorkingDay w")
    , @NamedQuery(name = "WorkingDay.findByInitials", query = "SELECT w FROM WorkingDay w WHERE w.initials = :initials")
    , @NamedQuery(name = "WorkingDay.findByLikeInitials", query = "SELECT w FROM WorkingDay w WHERE w.initials like  :initials")
    , @NamedQuery(name = "WorkingDay.findByName", query = "SELECT w FROM WorkingDay w WHERE w.name = :name")
    , @NamedQuery(name = "WorkingDay.findByLikeName", query = "SELECT w FROM WorkingDay w WHERE w.name like :name")
    , @NamedQuery(name = "WorkingDay.findByDescription", query = "SELECT w FROM WorkingDay w WHERE w.description = :description")
    , @NamedQuery(name = "WorkingDay.findByLikeDescription", query = "SELECT w FROM WorkingDay w WHERE w.description like :description")
    , @NamedQuery(name = "WorkingDay.findByStatus", query = "SELECT w FROM WorkingDay w WHERE w.status = :status")
    , @NamedQuery(name = "WorkingDay.updatePrimaryKey", query = "UPDATE WorkingDay w SET w.initials = :newInitials WHERE w.initials = :oldInitials")})
public class WorkingDay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "initials", nullable = false, length = 10)
    private String initials;
    @Basic(optional = false)
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Lob
    @Column(name = "description", length = 65535)
    private String description;
    @Lob
    @Column(name = "image")
    private byte[] image;
    @Basic(optional = false)
    @Column(name = "status", nullable = false)
    private boolean status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workingDay")
    private Collection<Disponibility> disponibilityCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workingDay")
    private Collection<Trimester> trimesterCollection;

    public WorkingDay() {
    }

    public WorkingDay(String initials) {
        this.initials = initials;
    }

    public WorkingDay(String initials, String name, boolean status) {
        this.initials = initials;
        this.name = name;
        this.status = status;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Collection<Disponibility> getDisponibilityCollection() {
        return disponibilityCollection;
    }

    public void setDisponibilityCollection(Collection<Disponibility> disponibilityCollection) {
        this.disponibilityCollection = disponibilityCollection;
    }

    public Collection<Trimester> getTrimesterCollection() {
        return trimesterCollection;
    }

    public void setTrimesterCollection(Collection<Trimester> trimesterCollection) {
        this.trimesterCollection = trimesterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (initials != null ? initials.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkingDay)) {
            return false;
        }
        WorkingDay other = (WorkingDay) object;
        if ((this.initials == null && other.initials != null) || (this.initials != null && !this.initials.equals(other.initials))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.tidsplanjpa.model.jpa.entities.WorkingDay[ initials=" + initials + " ]";
    }

}