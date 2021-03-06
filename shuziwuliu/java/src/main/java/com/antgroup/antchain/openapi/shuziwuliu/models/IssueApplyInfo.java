// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class IssueApplyInfo extends TeaModel {
    // 货源订单
    @NameInMap("cargo_order")
    public String cargoOrder;

    // 合同号（预留）
    @NameInMap("contract_id")
    public String contractId;

    // 凭证到期时间
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 支付单运费，运费最多精确到小数点后2位
    @NameInMap("freight")
    @Validation(required = true)
    public String freight;

    // 全局唯一业务号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 支付订单
    @NameInMap("pay_order")
    @Validation(required = true)
    public String payOrder;

    // 运单id
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    // 司机did
    @NameInMap("driver_did")
    public String driverDid;

    public static IssueApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        IssueApplyInfo self = new IssueApplyInfo();
        return TeaModel.build(map, self);
    }

    public IssueApplyInfo setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public IssueApplyInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public IssueApplyInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public IssueApplyInfo setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public IssueApplyInfo setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public IssueApplyInfo setPayOrder(String payOrder) {
        this.payOrder = payOrder;
        return this;
    }
    public String getPayOrder() {
        return this.payOrder;
    }

    public IssueApplyInfo setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public IssueApplyInfo setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

}
