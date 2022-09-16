// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 分期ID
    @NameInMap("stages_id")
    @Validation(required = true)
    public String stagesId;

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

    // 接收验证方式（0扫脸验证、2扫二维码验证, 3快递签收验证，4登录确认）
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

    // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
    @NameInMap("issue_amount")
    @Validation(required = true)
    public Long issueAmount;

    public static CreateBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchRequest self = new CreateBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBatchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBatchRequest setStagesId(String stagesId) {
        this.stagesId = stagesId;
        return this;
    }
    public String getStagesId() {
        return this.stagesId;
    }

    public CreateBatchRequest setCombinationId(String combinationId) {
        this.combinationId = combinationId;
        return this;
    }
    public String getCombinationId() {
        return this.combinationId;
    }

    public CreateBatchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBatchRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateBatchRequest setIssueWay(Long issueWay) {
        this.issueWay = issueWay;
        return this;
    }
    public Long getIssueWay() {
        return this.issueWay;
    }

    public CreateBatchRequest setAffirmanceReceivers(Long affirmanceReceivers) {
        this.affirmanceReceivers = affirmanceReceivers;
        return this;
    }
    public Long getAffirmanceReceivers() {
        return this.affirmanceReceivers;
    }

    public CreateBatchRequest setReceiveCheckWay(Long receiveCheckWay) {
        this.receiveCheckWay = receiveCheckWay;
        return this;
    }
    public Long getReceiveCheckWay() {
        return this.receiveCheckWay;
    }

    public CreateBatchRequest setIssueAmount(Long issueAmount) {
        this.issueAmount = issueAmount;
        return this;
    }
    public Long getIssueAmount() {
        return this.issueAmount;
    }

}
