// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckIdcardFourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 开始时间，yyyyMMdd格式的注册日期。
    @NameInMap("begin_date")
    @Validation(required = true)
    public String beginDate;

    // 失效时间，yyyyMMdd格式的注册日期。(长期有效
    // 身份证填 8 个 0))
    @NameInMap("expiry_date")
    @Validation(required = true)
    public String expiryDate;

    // map结果的json数据格式，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static CheckIdcardFourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIdcardFourmetaRequest self = new CheckIdcardFourmetaRequest();
        return TeaModel.build(map, self);
    }

    public CheckIdcardFourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIdcardFourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIdcardFourmetaRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckIdcardFourmetaRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckIdcardFourmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckIdcardFourmetaRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public CheckIdcardFourmetaRequest setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }
    public String getExpiryDate() {
        return this.expiryDate;
    }

    public CheckIdcardFourmetaRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
