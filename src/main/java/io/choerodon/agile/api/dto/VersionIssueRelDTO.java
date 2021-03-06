package io.choerodon.agile.api.dto;


import io.choerodon.agile.infra.common.utils.StringUtil;

import java.io.Serializable;

/**
 * @author dinghuang123@gmail.com
 * @since 2018-05-15 16:21:18
 */
public class VersionIssueRelDTO implements Serializable {

    private Long versionId;

    private Long issueId;

    private String name;

    private Long projectId;

    private String relationType;

    private String statusCode;

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return StringUtil.getToString(this);
    }

}