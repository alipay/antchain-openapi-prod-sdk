// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class CheckConfigPreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 配置字符串
    @NameInMap("new_fee_config")
    @Validation(required = true)
    public FeeConfEntityVO newFeeConfig;

    // 请求单号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static CheckConfigPreRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigPreRequest self = new CheckConfigPreRequest();
        return TeaModel.build(map, self);
    }

    public CheckConfigPreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckConfigPreRequest setNewFeeConfig(FeeConfEntityVO newFeeConfig) {
        this.newFeeConfig = newFeeConfig;
        return this;
    }
    public FeeConfEntityVO getNewFeeConfig() {
        return this.newFeeConfig;
    }

    public CheckConfigPreRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
