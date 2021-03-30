// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RegisterWhReceiptHeader extends TeaModel {
    // 注册申请单ID
    @NameInMap("register_wh_receipt_id")
    public String registerWhReceiptId;

    // 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
    @NameInMap("status")
    public String status;

    // 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
    @NameInMap("in_storing_status")
    public String inStoringStatus;

    // 更新时间
    @NameInMap("update_time")
    public Long updateTime;

    public static RegisterWhReceiptHeader build(java.util.Map<String, ?> map) throws Exception {
        RegisterWhReceiptHeader self = new RegisterWhReceiptHeader();
        return TeaModel.build(map, self);
    }

    public RegisterWhReceiptHeader setRegisterWhReceiptId(String registerWhReceiptId) {
        this.registerWhReceiptId = registerWhReceiptId;
        return this;
    }
    public String getRegisterWhReceiptId() {
        return this.registerWhReceiptId;
    }

    public RegisterWhReceiptHeader setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RegisterWhReceiptHeader setInStoringStatus(String inStoringStatus) {
        this.inStoringStatus = inStoringStatus;
        return this;
    }
    public String getInStoringStatus() {
        return this.inStoringStatus;
    }

    public RegisterWhReceiptHeader setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
