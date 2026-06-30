// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyRpgwUserSignresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方平台用户id
    @NameInMap("platform_user_identification")
    @Validation(required = true)
    public String platformUserIdentification;

    // 用户手机号
    @NameInMap("user_code")
    @Validation(required = true)
    public String userCode;

    // 签约结果，1成功，0失败
    @NameInMap("sign_result")
    @Validation(required = true)
    public String signResult;

    // 失败原因描述
    @NameInMap("result_desc")
    public String resultDesc;

    public static NotifyRpgwUserSignresultRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyRpgwUserSignresultRequest self = new NotifyRpgwUserSignresultRequest();
        return TeaModel.build(map, self);
    }

    public NotifyRpgwUserSignresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyRpgwUserSignresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyRpgwUserSignresultRequest setPlatformUserIdentification(String platformUserIdentification) {
        this.platformUserIdentification = platformUserIdentification;
        return this;
    }
    public String getPlatformUserIdentification() {
        return this.platformUserIdentification;
    }

    public NotifyRpgwUserSignresultRequest setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

    public NotifyRpgwUserSignresultRequest setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public NotifyRpgwUserSignresultRequest setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public String getResultDesc() {
        return this.resultDesc;
    }

}
