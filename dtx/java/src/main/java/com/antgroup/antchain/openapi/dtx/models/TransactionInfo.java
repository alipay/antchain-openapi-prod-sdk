// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionInfo extends TeaModel {
    // Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
    @NameInMap("action_mode")
    public Long actionMode;

    // 业务码
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务id
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 发起方ip
    @NameInMap("initiator_ip")
    @Validation(required = true)
    public String initiatorIp;

    // 发起方名称
    @NameInMap("initiator_name")
    @Validation(required = true)
    public String initiatorName;

    // 最近修改时间
    @NameInMap("modify_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifyTime;

    // 参与者id列表
    @NameInMap("participator_ids")
    @Validation(required = true)
    public java.util.List<String> participatorIds;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 事务状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 事务id
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    public static TransactionInfo build(java.util.Map<String, ?> map) throws Exception {
        TransactionInfo self = new TransactionInfo();
        return TeaModel.build(map, self);
    }

    public TransactionInfo setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public TransactionInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TransactionInfo setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public TransactionInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TransactionInfo setInitiatorIp(String initiatorIp) {
        this.initiatorIp = initiatorIp;
        return this;
    }
    public String getInitiatorIp() {
        return this.initiatorIp;
    }

    public TransactionInfo setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }
    public String getInitiatorName() {
        return this.initiatorName;
    }

    public TransactionInfo setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public TransactionInfo setParticipatorIds(java.util.List<String> participatorIds) {
        this.participatorIds = participatorIds;
        return this;
    }
    public java.util.List<String> getParticipatorIds() {
        return this.participatorIds;
    }

    public TransactionInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TransactionInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TransactionInfo setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
