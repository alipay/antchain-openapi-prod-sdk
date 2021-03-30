// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargowaybillBillsettleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 账单code（账单唯一标识）
    @NameInMap("bill_code")
    @Validation(required = true)
    public String billCode;

    // 结算金额（2位小数）
    @NameInMap("settle_amount")
    @Validation(required = true)
    public String settleAmount;

    // 结算状态（只有2种状态：部分结算、已结清）
    @NameInMap("settle_status")
    @Validation(required = true)
    public String settleStatus;

    public static CreateCargowaybillBillsettleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCargowaybillBillsettleRequest self = new CreateCargowaybillBillsettleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCargowaybillBillsettleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCargowaybillBillsettleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCargowaybillBillsettleRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCargowaybillBillsettleRequest setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }
    public String getBillCode() {
        return this.billCode;
    }

    public CreateCargowaybillBillsettleRequest setSettleAmount(String settleAmount) {
        this.settleAmount = settleAmount;
        return this;
    }
    public String getSettleAmount() {
        return this.settleAmount;
    }

    public CreateCargowaybillBillsettleRequest setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

}
