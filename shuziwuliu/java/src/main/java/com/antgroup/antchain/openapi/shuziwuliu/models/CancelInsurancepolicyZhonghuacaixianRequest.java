// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CancelInsurancepolicyZhonghuacaixianRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保单号，投保成功后返回的
    @NameInMap("pol_no")
    @Validation(required = true, maxLength = 60)
    public String polNo;

    // 含税保费，精确到小数点后两位
    @NameInMap("pre_mium")
    @Validation(required = true)
    public String preMium;

    // 全局唯一交易流水号
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 32, minLength = 32)
    public String tradeNo;

    public static CancelInsurancepolicyZhonghuacaixianRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInsurancepolicyZhonghuacaixianRequest self = new CancelInsurancepolicyZhonghuacaixianRequest();
        return TeaModel.build(map, self);
    }

    public CancelInsurancepolicyZhonghuacaixianRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelInsurancepolicyZhonghuacaixianRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelInsurancepolicyZhonghuacaixianRequest setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public CancelInsurancepolicyZhonghuacaixianRequest setPreMium(String preMium) {
        this.preMium = preMium;
        return this;
    }
    public String getPreMium() {
        return this.preMium;
    }

    public CancelInsurancepolicyZhonghuacaixianRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
