// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubReportInformationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户id
    @NameInMap("uuid")
    public String uuid;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 平台code
    @NameInMap("platform_code")
    public String platformCode;

    // 产品码
    @NameInMap("product_code")
    public String productCode;

    // 报案号
    @NameInMap("report_no")
    public String reportNo;

    // 报告生成时间
    @NameInMap("report_time")
    public String reportTime;

    // 报案到期时间
    @NameInMap("report_end_time")
    public String reportEndTime;

    // 报告内容
    @NameInMap("report_content")
    public String reportContent;

    // 状态
    @NameInMap("status")
    public String status;

    // 用户姓名
    @NameInMap("name")
    public String name;

    // 身份证号
    @NameInMap("id_card")
    public String idCard;

    public static QueryBenefithubReportInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubReportInformationResponse self = new QueryBenefithubReportInformationResponse();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubReportInformationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBenefithubReportInformationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBenefithubReportInformationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBenefithubReportInformationResponse setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public QueryBenefithubReportInformationResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryBenefithubReportInformationResponse setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public QueryBenefithubReportInformationResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryBenefithubReportInformationResponse setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public QueryBenefithubReportInformationResponse setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public QueryBenefithubReportInformationResponse setReportEndTime(String reportEndTime) {
        this.reportEndTime = reportEndTime;
        return this;
    }
    public String getReportEndTime() {
        return this.reportEndTime;
    }

    public QueryBenefithubReportInformationResponse setReportContent(String reportContent) {
        this.reportContent = reportContent;
        return this;
    }
    public String getReportContent() {
        return this.reportContent;
    }

    public QueryBenefithubReportInformationResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBenefithubReportInformationResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryBenefithubReportInformationResponse setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

}
