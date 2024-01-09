// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_95f484639d924779ae4d8ba7a4555321.models;

import com.aliyun.tea.*;

public class QueryAntcloudDuankaDuankaEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 用户关联订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
    @NameInMap("model_list")
    @Validation(required = true)
    public String modelList;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型：
    // "ID_NO"： 身份证号,
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 加密类型(目前只支持SHA256):
    // "MD5"：MD5（32位小写）,
    // "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
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
    @Validation(required = true)
    public String requestTime;

    public static QueryAntcloudDuankaDuankaEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDuankaDuankaEvaluationRequest self = new QueryAntcloudDuankaDuankaEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setModelList(String modelList) {
        this.modelList = modelList;
        return this;
    }
    public String getModelList() {
        return this.modelList;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setAuthTemplateNo(String authTemplateNo) {
        this.authTemplateNo = authTemplateNo;
        return this;
    }
    public String getAuthTemplateNo() {
        return this.authTemplateNo;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setAuthNo(String authNo) {
        this.authNo = authNo;
        return this;
    }
    public String getAuthNo() {
        return this.authNo;
    }

    public QueryAntcloudDuankaDuankaEvaluationRequest setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

}
