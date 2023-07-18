// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_743ccb6d20f546bcb851af6ce09cd478.models;

import com.aliyun.tea.*;

public class QueryIdentityTagScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 模型类型列表
    @NameInMap("model_id_list")
    @Validation(required = true)
    public java.util.List<String> modelIdList;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型：
    // "ID_NO"： 身份证号,
    // "MOBILE_NO"：手机号
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 加密类型:
    // "MD5"：MD5（32位小写）
    // "SHA256" ： SHA256（密文小写）
    // "SM3"： SM3（密文大写
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 用户授权模版编号
    @NameInMap("auth_template_no")
    @Validation(required = true)
    public String authTemplateNo;

    // 用户授权编码
    @NameInMap("auth_no")
    @Validation(required = true)
    public String authNo;

    // 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
    @NameInMap("request_time")
    public String requestTime;

    public static QueryIdentityTagScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentityTagScoreRequest self = new QueryIdentityTagScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentityTagScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentityTagScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentityTagScoreRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIdentityTagScoreRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryIdentityTagScoreRequest setModelIdList(java.util.List<String> modelIdList) {
        this.modelIdList = modelIdList;
        return this;
    }
    public java.util.List<String> getModelIdList() {
        return this.modelIdList;
    }

    public QueryIdentityTagScoreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIdentityTagScoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryIdentityTagScoreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryIdentityTagScoreRequest setAuthTemplateNo(String authTemplateNo) {
        this.authTemplateNo = authTemplateNo;
        return this;
    }
    public String getAuthTemplateNo() {
        return this.authTemplateNo;
    }

    public QueryIdentityTagScoreRequest setAuthNo(String authNo) {
        this.authNo = authNo;
        return this;
    }
    public String getAuthNo() {
        return this.authNo;
    }

    public QueryIdentityTagScoreRequest setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

}
