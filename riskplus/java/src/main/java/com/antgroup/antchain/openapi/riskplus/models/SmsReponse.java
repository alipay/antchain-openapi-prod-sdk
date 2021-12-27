// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SmsReponse extends TeaModel {
    // 发送回执ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 请求状态码; OK表示成功, 其他表示失败
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 是否调用接口成功的描述
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 请求ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static SmsReponse build(java.util.Map<String, ?> map) throws Exception {
        SmsReponse self = new SmsReponse();
        return TeaModel.build(map, self);
    }

    public SmsReponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SmsReponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SmsReponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SmsReponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
