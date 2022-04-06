// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟服务器ID，PAAS ID非IAAS ID
    @NameInMap("v_computer_group_id")
    @Validation(required = true)
    public String vComputerGroupId;

    public static DeleteLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadbalanceVcomputergroupRequest self = new DeleteLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteLoadbalanceVcomputergroupRequest setVComputerGroupId(String vComputerGroupId) {
        this.vComputerGroupId = vComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.vComputerGroupId;
    }

}
