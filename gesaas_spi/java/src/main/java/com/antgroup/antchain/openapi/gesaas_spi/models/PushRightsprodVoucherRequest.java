// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class PushRightsprodVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益编码
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 权益凭证编码/券码
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 业务类型
    // GRANT：发放 
    // VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
    // UNFREEZE：解冻  
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // GRANT_SUCCESS：发放成功
    // GRANT_FAIL：发放失败 
    // VERIFY_FAIL：核销失败 
    // VERIFY_SUCCESS：核销成功 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 外部订单号
    @NameInMap("out_trade_order_no")
    public String outTradeOrderNo;

    // 失败信息
    @NameInMap("fail_msg")
    public String failMsg;

    // 外部发放调用时传入信息
    @NameInMap("grant_info")
    public String grantInfo;

    public static PushRightsprodVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRightsprodVoucherRequest self = new PushRightsprodVoucherRequest();
        return TeaModel.build(map, self);
    }

    public PushRightsprodVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRightsprodVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRightsprodVoucherRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public PushRightsprodVoucherRequest setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public PushRightsprodVoucherRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PushRightsprodVoucherRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushRightsprodVoucherRequest setOutTradeOrderNo(String outTradeOrderNo) {
        this.outTradeOrderNo = outTradeOrderNo;
        return this;
    }
    public String getOutTradeOrderNo() {
        return this.outTradeOrderNo;
    }

    public PushRightsprodVoucherRequest setFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }
    public String getFailMsg() {
        return this.failMsg;
    }

    public PushRightsprodVoucherRequest setGrantInfo(String grantInfo) {
        this.grantInfo = grantInfo;
        return this;
    }
    public String getGrantInfo() {
        return this.grantInfo;
    }

}
