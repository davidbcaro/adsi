/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.htmlwariosoft.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 1349397
 */
@Entity
@Table(name = "learning_outcome")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LearningOutcome.findAll", query = "SELECT l FROM LearningOutcome l")
    , @NamedQuery(name = "LearningOutcome.findByLearningOutcomeCode", query = "SELECT l FROM LearningOutcome l WHERE l.learningOutcomePK.learningOutcomeCode = :learningOutcomeCode")
    , @NamedQuery(name = "LearningOutcome.findByDescription", query = "SELECT l FROM LearningOutcome l WHERE l.description = :description")
    , @NamedQuery(name = "LearningOutcome.findByCompetitionCode", query = "SELECT l FROM LearningOutcome l WHERE l.learningOutcomePK.competitionCode = :competitionCode")
    , @NamedQuery(name = "LearningOutcome.findByProgramCode", query = "SELECT l FROM LearningOutcome l WHERE l.learningOutcomePK.programCode = :programCode")
    , @NamedQuery(name = "LearningOutcome.findByVersion", query = "SELECT l FROM LearningOutcome l WHERE l.learningOutcomePK.version = :version")})
public class LearningOutcome implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LearningOutcomePK learningOutcomePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "description", nullable = false, length = 350)
    private String description;
    @JoinTable(name = "results_viewed", joinColumns = {
        @JoinColumn(name = "learning_Outcome_Code", referencedColumnName = "learning_Outcome_Code", nullable = false)
        , @JoinColumn(name = "competition_Code", referencedColumnName = "competition_Code", nullable = false)
        , @JoinColumn(name = "program_Code", referencedColumnName = "program_Code", nullable = false)
        , @JoinColumn(name = "version", referencedColumnName = "version", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "number_Group", referencedColumnName = "number_Group", nullable = false)
        , @JoinColumn(name = "name_Trimester", referencedColumnName = "name_Trimester", nullable = false)
        , @JoinColumn(name = "initials_Working_Day", referencedColumnName = "initials_Working_Day", nullable = false)
        , @JoinColumn(name = "training_Level", referencedColumnName = "training_Level", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<NumberGroupHasTrimester> numberGroupHasTrimesterCollection;
    @ManyToMany(mappedBy = "learningOutcomeCollection", fetch = FetchType.LAZY)
    private Collection<Activity> activityCollection;
    @JoinTable(name = "learning_outcome_has_trimester", joinColumns = {
        @JoinColumn(name = "learning_Outcome_Code", referencedColumnName = "learning_Outcome_Code", nullable = false)
        , @JoinColumn(name = "competition_Code", referencedColumnName = "competition_Code", nullable = false)
        , @JoinColumn(name = "program_Code", referencedColumnName = "program_Code", nullable = false)
        , @JoinColumn(name = "version", referencedColumnName = "version", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "name_Trimester", referencedColumnName = "name_Trimester", nullable = false)
        , @JoinColumn(name = "initials_Working_Day", referencedColumnName = "initials_Working_Day", nullable = false)
        , @JoinColumn(name = "training_Level", referencedColumnName = "training_Level", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Trimester> trimesterCollection;
    @JoinColumns({
        @JoinColumn(name = "competition_Code", referencedColumnName = "competition_Code", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "program_Code", referencedColumnName = "program_Code", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "version", referencedColumnName = "version", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Competition competition;

    public LearningOutcome() {
    }

    public LearningOutcome(LearningOutcomePK learningOutcomePK) {
        this.learningOutcomePK = learningOutcomePK;
    }

    public LearningOutcome(LearningOutcomePK learningOutcomePK, String description) {
        this.learningOutcomePK = learningOutcomePK;
        this.description = description;
    }

    public LearningOutcome(String learningOutcomeCode, String competitionCode, String programCode, String version) {
        this.learningOutcomePK = new LearningOutcomePK(learningOutcomeCode, competitionCode, programCode, version);
    }

    public LearningOutcomePK getLearningOutcomePK() {
        return learningOutcomePK;
    }

    public void setLearningOutcomePK(LearningOutcomePK learningOutcomePK) {
        this.learningOutcomePK = learningOutcomePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<NumberGroupHasTrimester> getNumberGroupHasTrimesterCollection() {
        return numberGroupHasTrimesterCollection;
    }

    public void setNumberGroupHasTrimesterCollection(Collection<NumberGroupHasTrimester> numberGroupHasTrimesterCollection) {
        this.numberGroupHasTrimesterCollection = numberGroupHasTrimesterCollection;
    }

    @XmlTransient
    public Collection<Activity> getActivityCollection() {
        return activityCollection;
    }

    public void setActivityCollection(Collection<Activity> activityCollection) {
        this.activityCollection = activityCollection;
    }

    @XmlTransient
    public Collection<Trimester> getTrimesterCollection() {
        return trimesterCollection;
    }

    public void setTrimesterCollection(Collection<Trimester> trimesterCollection) {
        this.trimesterCollection = trimesterCollection;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (learningOutcomePK != null ? learningOutcomePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LearningOutcome)) {
            return false;
        }
        LearningOutcome other = (LearningOutcome) object;
        if ((this.learningOutcomePK == null && other.learningOutcomePK != null) || (this.learningOutcomePK != null && !this.learningOutcomePK.equals(other.learningOutcomePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.htmlwariosoft.model.entities.LearningOutcome[ learningOutcomePK=" + learningOutcomePK + " ]";
    }
    
}
