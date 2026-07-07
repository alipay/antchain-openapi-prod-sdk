// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarActivityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活动主办方名称
    @NameInMap("sponsor")
    public String sponsor;

    // 大型活动名称
    @NameInMap("activity_name")
    public String activityName;

    // 当前开展的活动主体名称
    @NameInMap("enterprise_name")
    public String enterpriseName;

    // 当前活动主体编码
    @NameInMap("enterprise_no")
    public String enterpriseNo;

    // 当前主体活动开始日期
    @NameInMap("enterprise_start_date")
    public String enterpriseStartDate;

    // 当前主体活动结束日期
    @NameInMap("enterprise_end_date")
    public String enterpriseEndDate;

    // 当前活动是否已经经过碳排放认证
    @NameInMap("authed")
    public Boolean authed;

    public static DescribeAcarActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarActivityResponse self = new DescribeAcarActivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcarActivityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeAcarActivityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAcarActivityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeAcarActivityResponse setSponsor(String sponsor) {
        this.sponsor = sponsor;
        return this;
    }
    public String getSponsor() {
        return this.sponsor;
    }

    public DescribeAcarActivityResponse setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public DescribeAcarActivityResponse setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public DescribeAcarActivityResponse setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public DescribeAcarActivityResponse setEnterpriseStartDate(String enterpriseStartDate) {
        this.enterpriseStartDate = enterpriseStartDate;
        return this;
    }
    public String getEnterpriseStartDate() {
        return this.enterpriseStartDate;
    }

    public DescribeAcarActivityResponse setEnterpriseEndDate(String enterpriseEndDate) {
        this.enterpriseEndDate = enterpriseEndDate;
        return this;
    }
    public String getEnterpriseEndDate() {
        return this.enterpriseEndDate;
    }

    public DescribeAcarActivityResponse setAuthed(Boolean authed) {
        this.authed = authed;
        return this;
    }
    public Boolean getAuthed() {
        return this.authed;
    }

}
