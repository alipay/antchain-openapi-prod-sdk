// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class ImportAntchainAioOutboundPhoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_code")
    @Validation(required = true)
    public String taskCode;

    // 收单手机号
    @NameInMap("user_phone")
    @Validation(required = true)
    public String userPhone;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 幂等控制参数，可以为空。为空时不进行幂等控
    @NameInMap("idempotence_id")
    public String idempotenceId;

    // 业务系统在外呼时传入额外参数,json格式
    @NameInMap("biz_ext_info")
    public String bizExtInfo;

    // 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
    @NameInMap("outcall_timestamp")
    public Long outcallTimestamp;

    // 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
    @NameInMap("expiration_timestamp")
    @Validation(required = true)
    public Long expirationTimestamp;

    public static ImportAntchainAioOutboundPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAntchainAioOutboundPhoneRequest self = new ImportAntchainAioOutboundPhoneRequest();
        return TeaModel.build(map, self);
    }

    public ImportAntchainAioOutboundPhoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAntchainAioOutboundPhoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAntchainAioOutboundPhoneRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public ImportAntchainAioOutboundPhoneRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public ImportAntchainAioOutboundPhoneRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ImportAntchainAioOutboundPhoneRequest setIdempotenceId(String idempotenceId) {
        this.idempotenceId = idempotenceId;
        return this;
    }
    public String getIdempotenceId() {
        return this.idempotenceId;
    }

    public ImportAntchainAioOutboundPhoneRequest setBizExtInfo(String bizExtInfo) {
        this.bizExtInfo = bizExtInfo;
        return this;
    }
    public String getBizExtInfo() {
        return this.bizExtInfo;
    }

    public ImportAntchainAioOutboundPhoneRequest setOutcallTimestamp(Long outcallTimestamp) {
        this.outcallTimestamp = outcallTimestamp;
        return this;
    }
    public Long getOutcallTimestamp() {
        return this.outcallTimestamp;
    }

    public ImportAntchainAioOutboundPhoneRequest setExpirationTimestamp(Long expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }
    public Long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

}
