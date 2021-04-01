// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetExchangeEpinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版通锚定物
    @NameInMap("ep_anchor")
    public String epAnchor;

    // 版通代码
    @NameInMap("ep_code")
    public String epCode;

    // 版通首发量
    @NameInMap("ep_first_amount")
    public Long epFirstAmount;

    // 版通发行方账户
    @NameInMap("ep_issue_account")
    public String epIssueAccount;

    // 版通发行日时间戳
    @NameInMap("ep_issue_date")
    public Long epIssueDate;

    // 版通历史发行记录
    @NameInMap("ep_issue_history")
    public java.util.List<EPIssueHisInfo> epIssueHistory;

    // 版通名称
    @NameInMap("ep_name")
    public String epName;

    // 版通线下发行量
    @NameInMap("ep_offline_issue_amount")
    public Long epOfflineIssueAmount;

    // 版通线下日解限量
    @NameInMap("ep_offline_unfreeze")
    public Long epOfflineUnfreeze;

    // 版通线上发行量
    @NameInMap("ep_online_issue_amount")
    public Long epOnlineIssueAmount;

    // 版通发行方自持量
    @NameInMap("ep_self_amount")
    public Long epSelfAmount;

    // 版通自持日解限量
    @NameInMap("ep_self_unfreeze")
    public Long epSelfUnfreeze;

    // 版通状态 0:正常 1:锁定
    @NameInMap("ep_status")
    public Long epStatus;

    // 版通总发行量
    @NameInMap("ep_total_amount")
    public Long epTotalAmount;

    // 版通类型
    @NameInMap("ep_type")
    public String epType;

    // 扩展字段
    @NameInMap("extend")
    public String extend;

    public static QueryDigitalassetExchangeEpinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetExchangeEpinfoResponse self = new QueryDigitalassetExchangeEpinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetExchangeEpinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalassetExchangeEpinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalassetExchangeEpinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpAnchor(String epAnchor) {
        this.epAnchor = epAnchor;
        return this;
    }
    public String getEpAnchor() {
        return this.epAnchor;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpFirstAmount(Long epFirstAmount) {
        this.epFirstAmount = epFirstAmount;
        return this;
    }
    public Long getEpFirstAmount() {
        return this.epFirstAmount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpIssueAccount(String epIssueAccount) {
        this.epIssueAccount = epIssueAccount;
        return this;
    }
    public String getEpIssueAccount() {
        return this.epIssueAccount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpIssueDate(Long epIssueDate) {
        this.epIssueDate = epIssueDate;
        return this;
    }
    public Long getEpIssueDate() {
        return this.epIssueDate;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpIssueHistory(java.util.List<EPIssueHisInfo> epIssueHistory) {
        this.epIssueHistory = epIssueHistory;
        return this;
    }
    public java.util.List<EPIssueHisInfo> getEpIssueHistory() {
        return this.epIssueHistory;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpOfflineIssueAmount(Long epOfflineIssueAmount) {
        this.epOfflineIssueAmount = epOfflineIssueAmount;
        return this;
    }
    public Long getEpOfflineIssueAmount() {
        return this.epOfflineIssueAmount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpOfflineUnfreeze(Long epOfflineUnfreeze) {
        this.epOfflineUnfreeze = epOfflineUnfreeze;
        return this;
    }
    public Long getEpOfflineUnfreeze() {
        return this.epOfflineUnfreeze;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpOnlineIssueAmount(Long epOnlineIssueAmount) {
        this.epOnlineIssueAmount = epOnlineIssueAmount;
        return this;
    }
    public Long getEpOnlineIssueAmount() {
        return this.epOnlineIssueAmount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpSelfAmount(Long epSelfAmount) {
        this.epSelfAmount = epSelfAmount;
        return this;
    }
    public Long getEpSelfAmount() {
        return this.epSelfAmount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpSelfUnfreeze(Long epSelfUnfreeze) {
        this.epSelfUnfreeze = epSelfUnfreeze;
        return this;
    }
    public Long getEpSelfUnfreeze() {
        return this.epSelfUnfreeze;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpStatus(Long epStatus) {
        this.epStatus = epStatus;
        return this;
    }
    public Long getEpStatus() {
        return this.epStatus;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpTotalAmount(Long epTotalAmount) {
        this.epTotalAmount = epTotalAmount;
        return this;
    }
    public Long getEpTotalAmount() {
        return this.epTotalAmount;
    }

    public QueryDigitalassetExchangeEpinfoResponse setEpType(String epType) {
        this.epType = epType;
        return this;
    }
    public String getEpType() {
        return this.epType;
    }

    public QueryDigitalassetExchangeEpinfoResponse setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
