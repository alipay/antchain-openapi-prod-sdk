// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryZolozmetaThreemetamobilereuseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 运营商类型
    @NameInMap("carrier")
    @Validation(required = true)
    public String carrier;

    // 扩展参数
    @NameInMap("extern_param")
    @Validation(required = true)
    public String externParam;

    public static QueryZolozmetaThreemetamobilereuseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryZolozmetaThreemetamobilereuseRequest self = new QueryZolozmetaThreemetamobilereuseRequest();
        return TeaModel.build(map, self);
    }

    public QueryZolozmetaThreemetamobilereuseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryZolozmetaThreemetamobilereuseRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
