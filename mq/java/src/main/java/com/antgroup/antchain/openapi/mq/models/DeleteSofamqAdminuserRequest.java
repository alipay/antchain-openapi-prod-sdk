// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqAdminuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 管理员用户名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    public static DeleteSofamqAdminuserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqAdminuserRequest self = new DeleteSofamqAdminuserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqAdminuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqAdminuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqAdminuserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
