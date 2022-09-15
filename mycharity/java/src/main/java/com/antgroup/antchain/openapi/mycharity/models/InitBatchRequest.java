// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class InitBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 实施内容id
    @NameInMap("combination_id")
    @Validation(required = true, maxLength = 50)
    public String combinationId;

    // 批次名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 100)
    public String name;

    // 发放备注
    @NameInMap("remarks")
    @Validation(required = true, maxLength = 200)
    public String remarks;

    // 确认接收人 0发前确认 1发后确认
    @NameInMap("affirmance_receivers")
    @Validation(required = true)
    public Long affirmanceReceivers;

    // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式，6：现场组织】
    @NameInMap("issue_way")
    @Validation(required = true)
    public Long issueWay;

    // 接收验证方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3快递签收验证，4登录确认，5直接导入）
    @NameInMap("receive_check_way")
    @Validation(required = true)
    public Long receiveCheckWay;

    // 分期ID
    @NameInMap("stages_id")
    @Validation(required = true, maxLength = 50)
    public String stagesId;

    // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
    @NameInMap("issue_amount")
    public Long issueAmount;

    public static InitBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        InitBatchRequest self = new InitBatchRequest();
        return TeaModel.build(map, self);
    }

    public InitBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitBatchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InitBatchRequest setCombinationId(String combinationId) {
        this.combinationId = combinationId;
        return this;
    }
    public String getCombinationId() {
        return this.combinationId;
    }

    public InitBatchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InitBatchRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public InitBatchRequest setAffirmanceReceivers(Long affirmanceReceivers) {
        this.affirmanceReceivers = affirmanceReceivers;
        return this;
    }
    public Long getAffirmanceReceivers() {
        return this.affirmanceReceivers;
    }

    public InitBatchRequest setIssueWay(Long issueWay) {
        this.issueWay = issueWay;
        return this;
    }
    public Long getIssueWay() {
        return this.issueWay;
    }

    public InitBatchRequest setReceiveCheckWay(Long receiveCheckWay) {
        this.receiveCheckWay = receiveCheckWay;
        return this;
    }
    public Long getReceiveCheckWay() {
        return this.receiveCheckWay;
    }

    public InitBatchRequest setStagesId(String stagesId) {
        this.stagesId = stagesId;
        return this;
    }
    public String getStagesId() {
        return this.stagesId;
    }

    public InitBatchRequest setIssueAmount(Long issueAmount) {
        this.issueAmount = issueAmount;
        return this;
    }
    public Long getIssueAmount() {
        return this.issueAmount;
    }

}
