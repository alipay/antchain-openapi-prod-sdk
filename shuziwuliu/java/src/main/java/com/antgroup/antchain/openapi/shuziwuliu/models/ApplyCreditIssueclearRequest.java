// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyCreditIssueclearRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请日期，不输入则是当前时间
    @NameInMap("apply_date")
    public Long applyDate;

    // 清分金额，当前只支持全额清分，不填就是默认全额清分
    @NameInMap("clear_amt")
    public String clearAmt;

    // 主动清分方分布式数字身份
    @NameInMap("clear_did")
    @Validation(required = true)
    public String clearDid;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 凭证id
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 全局唯一业务流水号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 外部订单号，此为支付单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 业务发起方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static ApplyCreditIssueclearRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCreditIssueclearRequest self = new ApplyCreditIssueclearRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCreditIssueclearRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCreditIssueclearRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCreditIssueclearRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public ApplyCreditIssueclearRequest setClearAmt(String clearAmt) {
        this.clearAmt = clearAmt;
        return this;
    }
    public String getClearAmt() {
        return this.clearAmt;
    }

    public ApplyCreditIssueclearRequest setClearDid(String clearDid) {
        this.clearDid = clearDid;
        return this;
    }
    public String getClearDid() {
        return this.clearDid;
    }

    public ApplyCreditIssueclearRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ApplyCreditIssueclearRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public ApplyCreditIssueclearRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public ApplyCreditIssueclearRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ApplyCreditIssueclearRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public ApplyCreditIssueclearRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public ApplyCreditIssueclearRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
