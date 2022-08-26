// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class ALiYunContractProjects extends TeaModel {
    // contract_projects
    @NameInMap("contract_projects")
    public java.util.List<ALiYunContractProject> contractProjects;

    // pagination
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    public static ALiYunContractProjects build(java.util.Map<String, ?> map) throws Exception {
        ALiYunContractProjects self = new ALiYunContractProjects();
        return TeaModel.build(map, self);
    }

    public ALiYunContractProjects setContractProjects(java.util.List<ALiYunContractProject> contractProjects) {
        this.contractProjects = contractProjects;
        return this;
    }
    public java.util.List<ALiYunContractProject> getContractProjects() {
        return this.contractProjects;
    }

    public ALiYunContractProjects setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

}
