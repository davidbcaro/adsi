/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.htmlwariosoft.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 1349397
 */
@Entity
@Table(name = "phase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phase.findAll", query = "SELECT p FROM Phase p")
    , @NamedQuery(name = "Phase.findByNamePhase", query = "SELECT p FROM Phase p WHERE p.phasePK.namePhase = :namePhase")
    , @NamedQuery(name = "Phase.findByState", query = "SELECT p FROM Phase p WHERE p.state = :state")
    , @NamedQuery(name = "Phase.findByProjectCode", query = "SELECT p FROM Phase p WHERE p.phasePK.projectCode = :projectCode")})
public class Phase implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PhasePK phasePK;
    @Column(name = "state")
    private Boolean state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phase", fetch = FetchType.LAZY)
    private Collection<Activity> activityCollection;
    @JoinColumn(name = "project_Code", referencedColumnName = "project_Code", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Project project;

    public Phase() {
    }

    public Phase(PhasePK phasePK) {
        this.phasePK = phasePK;
    }

    public Phase(String namePhase, String projectCode) {
        this.phasePK = new PhasePK(namePhase, projectCode);
    }

    public PhasePK getPhasePK() {
        return phasePK;
    }

    public void setPhasePK(PhasePK phasePK) {
        this.phasePK = phasePK;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @XmlTransient
    public Collection<Activity> getActivityCollection() {
        return activityCollection;
    }

    public void setActivityCollection(Collection<Activity> activityCollection) {
        this.activityCollection = activityCollection;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phasePK != null ? phasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phase)) {
            return false;
        }
        Phase other = (Phase) object;
        if ((this.phasePK == null && other.phasePK != null) || (this.phasePK != null && !this.phasePK.equals(other.phasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + phasePK + "";
    }
    
}
