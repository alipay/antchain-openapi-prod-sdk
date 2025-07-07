// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class EPIssueHisInfo extends TeaModel {
    // 版通发行日期时间戳
    /**
     * <strong>example:</strong>
     * <p>1560827725</p>
     */
    @NameInMap("issue_date")
    @Validation(required = true)
    public Long issueDate;

    // 版通线下发行量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("offline_issue_amount")
    @Validation(required = true)
    public Long offlineIssueAmount;

    // 版通线上发行量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("online_issue_amount")
    @Validation(required = true)
    public Long onlineIssueAmount;

    // 版通自持发行量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("self_issue_amount")
    @Validation(required = true)
    public Long selfIssueAmount;

    public static EPIssueHisInfo build(java.util.Map<String, ?> map) throws Exception {
        EPIssueHisInfo self = new EPIssueHisInfo();
        return TeaModel.build(map, self);
    }

    public EPIssueHisInfo setIssueDate(Long issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public Long getIssueDate() {
        return this.issueDate;
    }

    public EPIssueHisInfo setOfflineIssueAmount(Long offlineIssueAmount) {
        this.offlineIssueAmount = offlineIssueAmount;
        return this;
    }
    public Long getOfflineIssueAmount() {
        return this.offlineIssueAmount;
    }

    public EPIssueHisInfo setOnlineIssueAmount(Long onlineIssueAmount) {
        this.onlineIssueAmount = onlineIssueAmount;
        return this;
    }
    public Long getOnlineIssueAmount() {
        return this.onlineIssueAmount;
    }

    public EPIssueHisInfo setSelfIssueAmount(Long selfIssueAmount) {
        this.selfIssueAmount = selfIssueAmount;
        return this;
    }
    public Long getSelfIssueAmount() {
        return this.selfIssueAmount;
    }

}
