// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarOffsetacquisitionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活动数据采集单号
    @NameInMap("acquisition_item_no")
    @Validation(required = true)
    public String acquisitionItemNo;

    // 碳普惠减碳项目编号
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    // 参与的碳账户DID
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    // 发生时间，格式为yyyy-MM-DD HH:MM:SS（到秒）或 yyyy-MM-DD（按日录入）
    @NameInMap("occurrent_time")
    @Validation(required = true)
    public String occurrentTime;

    // 发生场景，需要按照约定的场景编码提交
    @NameInMap("scenario_code")
    @Validation(required = true)
    public String scenarioCode;

    // 活动数据列表
    @NameInMap("active_data_list")
    @Validation(required = true)
    public java.util.List<AnyAmountItem> activeDataList;

    public static AddEcarOffsetacquisitionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEcarOffsetacquisitionRequest self = new AddEcarOffsetacquisitionRequest();
        return TeaModel.build(map, self);
    }

    public AddEcarOffsetacquisitionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddEcarOffsetacquisitionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddEcarOffsetacquisitionRequest setAcquisitionItemNo(String acquisitionItemNo) {
        this.acquisitionItemNo = acquisitionItemNo;
        return this;
    }
    public String getAcquisitionItemNo() {
        return this.acquisitionItemNo;
    }

    public AddEcarOffsetacquisitionRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public AddEcarOffsetacquisitionRequest setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public AddEcarOffsetacquisitionRequest setOccurrentTime(String occurrentTime) {
        this.occurrentTime = occurrentTime;
        return this;
    }
    public String getOccurrentTime() {
        return this.occurrentTime;
    }

    public AddEcarOffsetacquisitionRequest setScenarioCode(String scenarioCode) {
        this.scenarioCode = scenarioCode;
        return this;
    }
    public String getScenarioCode() {
        return this.scenarioCode;
    }

    public AddEcarOffsetacquisitionRequest setActiveDataList(java.util.List<AnyAmountItem> activeDataList) {
        this.activeDataList = activeDataList;
        return this;
    }
    public java.util.List<AnyAmountItem> getActiveDataList() {
        return this.activeDataList;
    }

}
