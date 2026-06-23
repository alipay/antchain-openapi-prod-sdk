// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CheckAntcloudBillingConfigPreRequest extends TeaModel {
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

    public static CheckAntcloudBillingConfigPreRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAntcloudBillingConfigPreRequest self = new CheckAntcloudBillingConfigPreRequest();
        return TeaModel.build(map, self);
    }

    public CheckAntcloudBillingConfigPreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAntcloudBillingConfigPreRequest setNewFeeConfig(FeeConfEntityVO newFeeConfig) {
        this.newFeeConfig = newFeeConfig;
        return this;
    }
    public FeeConfEntityVO getNewFeeConfig() {
        return this.newFeeConfig;
    }

    public CheckAntcloudBillingConfigPreRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
