// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class WarehouseReceiptTraceInfo extends TeaModel {
    // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
    @NameInMap("operate_type")
    public String operateType;

    // 操作标识
    @NameInMap("operate_type_desc")
    public String operateTypeDesc;

    // 操作时间
    @NameInMap("operate_time")
    public Long operateTime;

    // 区块链信息
    @NameInMap("blockchain_info")
    public BlockchainInfo blockchainInfo;

    // 操作主体
    @NameInMap("operator_name")
    public String operatorName;

    // string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
    @NameInMap("action_type")
    public String actionType;

    // 动作描述
    @NameInMap("action_desc")
    public String actionDesc;

    // 操作对象
    @NameInMap("operate_object")
    public String operateObject;

    public static WarehouseReceiptTraceInfo build(java.util.Map<String, ?> map) throws Exception {
        WarehouseReceiptTraceInfo self = new WarehouseReceiptTraceInfo();
        return TeaModel.build(map, self);
    }

    public WarehouseReceiptTraceInfo setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public WarehouseReceiptTraceInfo setOperateTypeDesc(String operateTypeDesc) {
        this.operateTypeDesc = operateTypeDesc;
        return this;
    }
    public String getOperateTypeDesc() {
        return this.operateTypeDesc;
    }

    public WarehouseReceiptTraceInfo setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public WarehouseReceiptTraceInfo setBlockchainInfo(BlockchainInfo blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfo getBlockchainInfo() {
        return this.blockchainInfo;
    }

    public WarehouseReceiptTraceInfo setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public WarehouseReceiptTraceInfo setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public WarehouseReceiptTraceInfo setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
        return this;
    }
    public String getActionDesc() {
        return this.actionDesc;
    }

    public WarehouseReceiptTraceInfo setOperateObject(String operateObject) {
        this.operateObject = operateObject;
        return this;
    }
    public String getOperateObject() {
        return this.operateObject;
    }

}
