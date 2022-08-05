// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 数字权证项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限
    @NameInMap("amount")
    public Long amount;

    // 项目发行后权证数量是否可增发。
    // true:可增发
    // false:不可增发
    @NameInMap("limited_amount")
    public Boolean limitedAmount;

    // 项目权证是否可核销。false:不可核销；true:可核销
    @NameInMap("write_offable")
    public Boolean writeOffable;

    // 项目权证是否可销毁。false:不可销毁；true:可销毁
    @NameInMap("burnable")
    public Boolean burnable;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    @NameInMap("account_info")
    @Validation(required = true)
    public AccountInfo accountInfo;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateProjectRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateProjectRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UpdateProjectRequest setLimitedAmount(Boolean limitedAmount) {
        this.limitedAmount = limitedAmount;
        return this;
    }
    public Boolean getLimitedAmount() {
        return this.limitedAmount;
    }

    public UpdateProjectRequest setWriteOffable(Boolean writeOffable) {
        this.writeOffable = writeOffable;
        return this;
    }
    public Boolean getWriteOffable() {
        return this.writeOffable;
    }

    public UpdateProjectRequest setBurnable(Boolean burnable) {
        this.burnable = burnable;
        return this;
    }
    public Boolean getBurnable() {
        return this.burnable;
    }

    public UpdateProjectRequest setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

}
