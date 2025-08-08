// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaasIssueApplyInfo extends TeaModel {
    // 货源订单
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("cargo_order")
    public String cargoOrder;

    // 合同号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("contract_id")
    public String contractId;

    // 全局唯一业务单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 支付单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("pay_order")
    @Validation(required = true)
    public String payOrder;

    // 运单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    // 司机did
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 发行费
    /**
     * <strong>example:</strong>
     * <p>1.12</p>
     */
    @NameInMap("freight")
    @Validation(required = true)
    public String freight;

    // 到期时间戳
    /**
     * <strong>example:</strong>
     * <p>1593504406597</p>
     */
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    public static SaasIssueApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        SaasIssueApplyInfo self = new SaasIssueApplyInfo();
        return TeaModel.build(map, self);
    }

    public SaasIssueApplyInfo setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public SaasIssueApplyInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public SaasIssueApplyInfo setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SaasIssueApplyInfo setPayOrder(String payOrder) {
        this.payOrder = payOrder;
        return this;
    }
    public String getPayOrder() {
        return this.payOrder;
    }

    public SaasIssueApplyInfo setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public SaasIssueApplyInfo setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public SaasIssueApplyInfo setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public SaasIssueApplyInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

}
