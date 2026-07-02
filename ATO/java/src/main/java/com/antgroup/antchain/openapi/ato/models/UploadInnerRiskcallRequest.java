// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadInnerRiskcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等id
    @NameInMap("idempotent_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String idempotentId;

    // 商户的支付宝唯一id
    @NameInMap("pid")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String pid;

    // 计量值
    @NameInMap("service_amount")
    @Validation(required = true, minimum = 1)
    public Long serviceAmount;

    // 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("start_time")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String startTime;

    // 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("end_time")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String endTime;

    // 支付宝开放平台购买的实例 id
    @NameInMap("alipay_instance_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String alipayInstanceId;

    // 扩展参数
    // jsonString
    @NameInMap("ext_info")
    public String extInfo;

    public static UploadInnerRiskcallRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadInnerRiskcallRequest self = new UploadInnerRiskcallRequest();
        return TeaModel.build(map, self);
    }

    public UploadInnerRiskcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadInnerRiskcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadInnerRiskcallRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public UploadInnerRiskcallRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public UploadInnerRiskcallRequest setServiceAmount(Long serviceAmount) {
        this.serviceAmount = serviceAmount;
        return this;
    }
    public Long getServiceAmount() {
        return this.serviceAmount;
    }

    public UploadInnerRiskcallRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UploadInnerRiskcallRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UploadInnerRiskcallRequest setAlipayInstanceId(String alipayInstanceId) {
        this.alipayInstanceId = alipayInstanceId;
        return this;
    }
    public String getAlipayInstanceId() {
        return this.alipayInstanceId;
    }

    public UploadInnerRiskcallRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
