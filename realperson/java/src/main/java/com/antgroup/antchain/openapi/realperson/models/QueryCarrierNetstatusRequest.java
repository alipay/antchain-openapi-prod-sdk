// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarrierNetstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
    @NameInMap("carrier")
    public String carrier;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    @Validation(required = true)
    public String externParam;

    public static QueryCarrierNetstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarrierNetstatusRequest self = new QueryCarrierNetstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarrierNetstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarrierNetstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarrierNetstatusRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCarrierNetstatusRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryCarrierNetstatusRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryCarrierNetstatusRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
