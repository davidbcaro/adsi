/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.htmlwariosoft.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 1349397
 */
@Embeddable
public class LearningOutcomePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "learning_Outcome_Code", nullable = false, length = 100)
    private String learningOutcomeCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "competition_Code", nullable = false, length = 100)
    private String competitionCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "program_Code", nullable = false, length = 100)
    private String programCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "version", nullable = false, length = 20)
    private String version;

    public LearningOutcomePK() {
    }

    public LearningOutcomePK(String learningOutcomeCode, String competitionCode, String programCode, String version) {
        this.learningOutcomeCode = learningOutcomeCode;
        this.competitionCode = competitionCode;
        this.programCode = programCode;
        this.version = version;
    }

    public String getLearningOutcomeCode() {
        return learningOutcomeCode;
    }

    public void setLearningOutcomeCode(String learningOutcomeCode) {
        this.learningOutcomeCode = learningOutcomeCode;
    }

    public String getCompetitionCode() {
        return competitionCode;
    }

    public void setCompetitionCode(String competitionCode) {
        this.competitionCode = competitionCode;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (learningOutcomeCode != null ? learningOutcomeCode.hashCode() : 0);
        hash += (competitionCode != null ? competitionCode.hashCode() : 0);
        hash += (programCode != null ? programCode.hashCode() : 0);
        hash += (version != null ? version.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LearningOutcomePK)) {
            return false;
        }
        LearningOutcomePK other = (LearningOutcomePK) object;
        if ((this.learningOutcomeCode == null && other.learningOutcomeCode != null) || (this.learningOutcomeCode != null && !this.learningOutcomeCode.equals(other.learningOutcomeCode))) {
            return false;
        }
        if ((this.competitionCode == null && other.competitionCode != null) || (this.competitionCode != null && !this.competitionCode.equals(other.competitionCode))) {
            return false;
        }
        if ((this.programCode == null && other.programCode != null) || (this.programCode != null && !this.programCode.equals(other.programCode))) {
            return false;
        }
        if ((this.version == null && other.version != null) || (this.version != null && !this.version.equals(other.version))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.htmlwariosoft.model.entities.LearningOutcomePK[ learningOutcomeCode=" + learningOutcomeCode + ", competitionCode=" + competitionCode + ", programCode=" + programCode + ", version=" + version + " ]";
    }
    
}