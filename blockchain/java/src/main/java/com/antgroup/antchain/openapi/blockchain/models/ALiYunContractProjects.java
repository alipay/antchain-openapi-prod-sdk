// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunContractProjects extends TeaModel {
    // pagination
    /**
     * <strong>example:</strong>
     * <p>pagination</p>
     */
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // contract_projects
    /**
     * <strong>example:</strong>
     * <p>contract_projects</p>
     */
    @NameInMap("contract_projects")
    public java.util.List<ALiYunContractProject> contractProjects;

    public static ALiYunContractProjects build(java.util.Map<String, ?> map) throws Exception {
        ALiYunContractProjects self = new ALiYunContractProjects();
        return TeaModel.build(map, self);
    }

    public ALiYunContractProjects setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

    public ALiYunContractProjects setContractProjects(java.util.List<ALiYunContractProject> contractProjects) {
        this.contractProjects = contractProjects;
        return this;
    }
    public java.util.List<ALiYunContractProject> getContractProjects() {
        return this.contractProjects;
    }

}
