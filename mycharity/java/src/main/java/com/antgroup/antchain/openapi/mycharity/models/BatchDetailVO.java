// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchDetailVO extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 实施内容id
    @NameInMap("combination_id")
    @Validation(required = true)
    public String combinationId;

    // 批次名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 备注
    @NameInMap("remarks")
    @Validation(required = true)
    public String remarks;

    // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
    @NameInMap("issue_way")
    @Validation(required = true)
    public Long issueWay;

    // 确认接收人 0发前确认 1发后确认
    @NameInMap("affirmance_receivers")
    @Validation(required = true)
    public Long affirmanceReceivers;

    // 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
    @NameInMap("receive_check_way")
    @Validation(required = true)
    public Long receiveCheckWay;

    // 发放数量
    @NameInMap("issue_amount")
    @Validation(required = true)
    public Long issueAmount;

    public static BatchDetailVO build(java.util.Map<String, ?> map) throws Exception {
        BatchDetailVO self = new BatchDetailVO();
        return TeaModel.build(map, self);
    }

    public BatchDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BatchDetailVO setCombinationId(String combinationId) {
        this.combinationId = combinationId;
        return this;
    }
    public String getCombinationId() {
        return this.combinationId;
    }

    public BatchDetailVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BatchDetailVO setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public BatchDetailVO setIssueWay(Long issueWay) {
        this.issueWay = issueWay;
        return this;
    }
    public Long getIssueWay() {
        return this.issueWay;
    }

    public BatchDetailVO setAffirmanceReceivers(Long affirmanceReceivers) {
        this.affirmanceReceivers = affirmanceReceivers;
        return this;
    }
    public Long getAffirmanceReceivers() {
        return this.affirmanceReceivers;
    }

    public BatchDetailVO setReceiveCheckWay(Long receiveCheckWay) {
        this.receiveCheckWay = receiveCheckWay;
        return this;
    }
    public Long getReceiveCheckWay() {
        return this.receiveCheckWay;
    }

    public BatchDetailVO setIssueAmount(Long issueAmount) {
        this.issueAmount = issueAmount;
        return this;
    }
    public Long getIssueAmount() {
        return this.issueAmount;
    }

}
