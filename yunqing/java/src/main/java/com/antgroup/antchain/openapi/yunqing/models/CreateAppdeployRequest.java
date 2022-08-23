// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateAppdeployRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用码
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<String> apps;

    // 将要发布的单元id
    @NameInMap("cell_ids")
    @Validation(required = true)
    public java.util.List<String> cellIds;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 解决方案id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 是否强制重发
    @NameInMap("force")
    @Validation(required = true)
    public Boolean force;

    // 是否需要手动的确认
    @NameInMap("need_beta")
    public Boolean needBeta;

    // TWO_GROUP分两组ALL_ONE共分一组无灰生产禁用EACH_ONE每台一组SYSTEM_RECOMMENDATION系统推荐
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 操作人ID
    @NameInMap("submitter_id")
    public String submitterId;

    // 	
    // 操作人名称（花名或者真名）
    @NameInMap("submitter_name")
    public String submitterName;

    public static CreateAppdeployRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppdeployRequest self = new CreateAppdeployRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppdeployRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppdeployRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppdeployRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public CreateAppdeployRequest setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public CreateAppdeployRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateAppdeployRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public CreateAppdeployRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public CreateAppdeployRequest setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public CreateAppdeployRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public CreateAppdeployRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public CreateAppdeployRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
