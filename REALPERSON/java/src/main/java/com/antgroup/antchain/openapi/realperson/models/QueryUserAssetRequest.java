// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryUserAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 入参加密模式：
    // NONE：不加密；
    // MD5：身份证号字段以MD5加密后的字符串传输
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // map结果的json数据格式，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryUserAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAssetRequest self = new QueryUserAssetRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserAssetRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryUserAssetRequest setReqEncType(String reqEncType) {
        this.reqEncType = reqEncType;
        return this;
    }
    public String getReqEncType() {
        return this.reqEncType;
    }

    public QueryUserAssetRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryUserAssetRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
