// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyCreditmodeIssueclearRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 业务平台方分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 主动清分方分布式数字身份
    @NameInMap("clear_did")
    @Validation(required = true)
    public String clearDid;

    // 凭证id
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 全局业务号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 支付单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 清分金额
    @NameInMap("clear_amt")
    public String clearAmt;

    // 模式  B:b模式
    @NameInMap("mode_type")
    @Validation(required = true)
    public String modeType;

    // 申请日期
    @NameInMap("apply_date")
    public String applyDate;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static ApplyCreditmodeIssueclearRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCreditmodeIssueclearRequest self = new ApplyCreditmodeIssueclearRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCreditmodeIssueclearRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCreditmodeIssueclearRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCreditmodeIssueclearRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ApplyCreditmodeIssueclearRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public ApplyCreditmodeIssueclearRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public ApplyCreditmodeIssueclearRequest setClearDid(String clearDid) {
        this.clearDid = clearDid;
        return this;
    }
    public String getClearDid() {
        return this.clearDid;
    }

    public ApplyCreditmodeIssueclearRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public ApplyCreditmodeIssueclearRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ApplyCreditmodeIssueclearRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public ApplyCreditmodeIssueclearRequest setClearAmt(String clearAmt) {
        this.clearAmt = clearAmt;
        return this;
    }
    public String getClearAmt() {
        return this.clearAmt;
    }

    public ApplyCreditmodeIssueclearRequest setModeType(String modeType) {
        this.modeType = modeType;
        return this;
    }
    public String getModeType() {
        return this.modeType;
    }

    public ApplyCreditmodeIssueclearRequest setApplyDate(String applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public String getApplyDate() {
        return this.applyDate;
    }

    public ApplyCreditmodeIssueclearRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
