// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CancelOpsplanServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单下应用服务对应的发布id
    @NameInMap("id")
    public String id;

    // 取消原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    // [huanyu场景使用]huanyu变更单唯一id
    @NameInMap("huanyu_exec_no")
    public String huanyuExecNo;

    public static CancelOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOpsplanServiceRequest self = new CancelOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public CancelOpsplanServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelOpsplanServiceRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CancelOpsplanServiceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CancelOpsplanServiceRequest setHuanyuExecNo(String huanyuExecNo) {
        this.huanyuExecNo = huanyuExecNo;
        return this;
    }
    public String getHuanyuExecNo() {
        return this.huanyuExecNo;
    }

}
