// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SendAntsaasStaffingcInsureRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部业务号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 企业名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 统一社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 退保订单号列表
    @NameInMap("order_no_list")
    @Validation(required = true)
    public java.util.List<Long> orderNoList;

    public static SendAntsaasStaffingcInsureRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAntsaasStaffingcInsureRefundRequest self = new SendAntsaasStaffingcInsureRefundRequest();
        return TeaModel.build(map, self);
    }

    public SendAntsaasStaffingcInsureRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendAntsaasStaffingcInsureRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendAntsaasStaffingcInsureRefundRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SendAntsaasStaffingcInsureRefundRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public SendAntsaasStaffingcInsureRefundRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public SendAntsaasStaffingcInsureRefundRequest setOrderNoList(java.util.List<Long> orderNoList) {
        this.orderNoList = orderNoList;
        return this;
    }
    public java.util.List<Long> getOrderNoList() {
        return this.orderNoList;
    }

}
