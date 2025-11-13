// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchLoanResultData extends TeaModel {
    // 流水号
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("biz_no")
    public String bizNo;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("status")
    public String status;

    // FUND_BATCH_LOAN: 批量放款
    /**
     * <strong>example:</strong>
     * <p>FUND_BATCH_LOAN</p>
     */
    @NameInMap("type")
    public String type;

    // 任务创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59</p>
     */
    @NameInMap("create_time")
    public String createTime;

    //  同意放款数据
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("agree_loan_count")
    public Long agreeLoanCount;

    // 拒绝放款数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("reject_loan_count")
    public Long rejectLoanCount;

    // 放款失败数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("loan_fail_count")
    public Long loanFailCount;

    // 放款失败结果文件
    /**
     * <strong>example:</strong>
     * <p><a href="http://123456.com">http://123456.com</a></p>
     */
    @NameInMap("file_url")
    public String fileUrl;

    public static BatchLoanResultData build(java.util.Map<String, ?> map) throws Exception {
        BatchLoanResultData self = new BatchLoanResultData();
        return TeaModel.build(map, self);
    }

    public BatchLoanResultData setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public BatchLoanResultData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BatchLoanResultData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BatchLoanResultData setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BatchLoanResultData setAgreeLoanCount(Long agreeLoanCount) {
        this.agreeLoanCount = agreeLoanCount;
        return this;
    }
    public Long getAgreeLoanCount() {
        return this.agreeLoanCount;
    }

    public BatchLoanResultData setRejectLoanCount(Long rejectLoanCount) {
        this.rejectLoanCount = rejectLoanCount;
        return this;
    }
    public Long getRejectLoanCount() {
        return this.rejectLoanCount;
    }

    public BatchLoanResultData setLoanFailCount(Long loanFailCount) {
        this.loanFailCount = loanFailCount;
        return this;
    }
    public Long getLoanFailCount() {
        return this.loanFailCount;
    }

    public BatchLoanResultData setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
