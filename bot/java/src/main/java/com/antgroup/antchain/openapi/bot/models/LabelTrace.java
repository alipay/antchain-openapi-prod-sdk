// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LabelTrace extends TeaModel {
    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 标签id
    @NameInMap("label_id")
    @Validation(required = true)
    public String labelId;

    // 标签状态
    @NameInMap("label_status")
    @Validation(required = true)
    public String labelStatus;

    // 资产Id
    @NameInMap("asset_id")
    public String assetId;

    // 操作员
    @NameInMap("operator")
    public String operator;

    // 标签拥有者
    @NameInMap("owner")
    public String owner;

    // 标签所处流程
    @NameInMap("process")
    public String process;

    // 标签操作
    @NameInMap("action")
    public String action;

    // 操作时间 
    @NameInMap("operate_time")
    @Validation(required = true)
    public Long operateTime;

    // 操作设备
    @NameInMap("operate_device")
    public String operateDevice;

    // 操作内容
    @NameInMap("content")
    public String content;

    // 链上哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链时间
    @NameInMap("tx_time")
    public String txTime;

    // 区块链高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // 上链失败的错误码
    @NameInMap("error_code")
    public String errorCode;

    // 上链失败的错误信息
    @NameInMap("error_msg")
    public String errorMsg;

    // 是否上链成功
    @NameInMap("is_success")
    public Boolean isSuccess;

    public static LabelTrace build(java.util.Map<String, ?> map) throws Exception {
        LabelTrace self = new LabelTrace();
        return TeaModel.build(map, self);
    }

    public LabelTrace setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public LabelTrace setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public LabelTrace setLabelStatus(String labelStatus) {
        this.labelStatus = labelStatus;
        return this;
    }
    public String getLabelStatus() {
        return this.labelStatus;
    }

    public LabelTrace setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public LabelTrace setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public LabelTrace setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public LabelTrace setProcess(String process) {
        this.process = process;
        return this;
    }
    public String getProcess() {
        return this.process;
    }

    public LabelTrace setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public LabelTrace setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public LabelTrace setOperateDevice(String operateDevice) {
        this.operateDevice = operateDevice;
        return this;
    }
    public String getOperateDevice() {
        return this.operateDevice;
    }

    public LabelTrace setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public LabelTrace setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public LabelTrace setTxTime(String txTime) {
        this.txTime = txTime;
        return this;
    }
    public String getTxTime() {
        return this.txTime;
    }

    public LabelTrace setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public LabelTrace setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LabelTrace setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LabelTrace setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public LabelTrace setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
