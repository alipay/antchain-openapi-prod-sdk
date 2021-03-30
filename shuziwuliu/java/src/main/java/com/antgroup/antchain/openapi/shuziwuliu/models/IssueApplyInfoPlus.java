// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class IssueApplyInfoPlus extends TeaModel {
    // 订单中的BookingNo，以英文逗号分割
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 船公司did
    @NameInMap("carrier_did")
    @Validation(required = true)
    public String carrierDid;

    // BookingNo中的箱号，以英文逗号分割
    @NameInMap("container_no")
    @Validation(required = true)
    public String containerNo;

    // 到期时间戳
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 发行金额，精确到小数点后2位
    @NameInMap("issue_amt")
    @Validation(required = true)
    public String issueAmt;

    // 全局唯一业务号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 支付单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 运单订单id
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    public static IssueApplyInfoPlus build(java.util.Map<String, ?> map) throws Exception {
        IssueApplyInfoPlus self = new IssueApplyInfoPlus();
        return TeaModel.build(map, self);
    }

    public IssueApplyInfoPlus setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public IssueApplyInfoPlus setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public IssueApplyInfoPlus setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public IssueApplyInfoPlus setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public IssueApplyInfoPlus setIssueAmt(String issueAmt) {
        this.issueAmt = issueAmt;
        return this;
    }
    public String getIssueAmt() {
        return this.issueAmt;
    }

    public IssueApplyInfoPlus setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public IssueApplyInfoPlus setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public IssueApplyInfoPlus setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
