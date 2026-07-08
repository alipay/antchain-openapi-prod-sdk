// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaPhonereuseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 手机号「支持加密」
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 运营商类型
    @NameInMap("carrier")
    public String carrier;

    // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式 0：明文 1：MD5
    @NameInMap("encrypt_type")
    public String encryptType;

    // 扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static QueryThreemetaPhonereuseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaPhonereuseRequest self = new QueryThreemetaPhonereuseRequest();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaPhonereuseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThreemetaPhonereuseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThreemetaPhonereuseRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryThreemetaPhonereuseRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryThreemetaPhonereuseRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryThreemetaPhonereuseRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryThreemetaPhonereuseRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryThreemetaPhonereuseRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
