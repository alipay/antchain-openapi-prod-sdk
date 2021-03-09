// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class JoinedSecurityGroupVO extends TeaModel {
    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // name
    @NameInMap("name")
    public String name;

    // workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    // workspace name
    @NameInMap("workspace_name")
    public String workspaceName;

    public static JoinedSecurityGroupVO build(java.util.Map<String, ?> map) throws Exception {
        JoinedSecurityGroupVO self = new JoinedSecurityGroupVO();
        return TeaModel.build(map, self);
    }

    public JoinedSecurityGroupVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public JoinedSecurityGroupVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public JoinedSecurityGroupVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public JoinedSecurityGroupVO setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
