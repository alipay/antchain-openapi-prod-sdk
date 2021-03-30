// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateReceivablebillStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账单id，客户生成的账单唯一编号
    @NameInMap("bill_id")
    @Validation(required = true)
    public String billId;

    // 收款方did，账单的收款方数字身份
    @NameInMap("bill_payee_did")
    @Validation(required = true)
    public String billPayeeDid;

    // 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
    // 
    // 
    @NameInMap("update_status")
    @Validation(required = true)
    public String updateStatus;

    // 更新状态时间，13位毫秒级时间戳
    @NameInMap("update_status_time")
    @Validation(required = true)
    public Long updateStatusTime;

    public static UpdateReceivablebillStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReceivablebillStatusRequest self = new UpdateReceivablebillStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReceivablebillStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateReceivablebillStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateReceivablebillStatusRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public UpdateReceivablebillStatusRequest setBillPayeeDid(String billPayeeDid) {
        this.billPayeeDid = billPayeeDid;
        return this;
    }
    public String getBillPayeeDid() {
        return this.billPayeeDid;
    }

    public UpdateReceivablebillStatusRequest setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public UpdateReceivablebillStatusRequest setUpdateStatusTime(Long updateStatusTime) {
        this.updateStatusTime = updateStatusTime;
        return this;
    }
    public Long getUpdateStatusTime() {
        return this.updateStatusTime;
    }

}
