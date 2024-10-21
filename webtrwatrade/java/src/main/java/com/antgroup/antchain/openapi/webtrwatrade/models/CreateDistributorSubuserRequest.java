// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CreateDistributorSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 钱包地址
    @NameInMap("wallet_address")
    @Validation(required = true)
    public String walletAddress;

    // 项目名称
    @NameInMap("project_name")
    public String projectName;

    // 项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 用户资产配额
    @NameInMap("user_target")
    @Validation(required = true)
    public String userTarget;

    public static CreateDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributorSubuserRequest self = new CreateDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributorSubuserRequest setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
        return this;
    }
    public String getWalletAddress() {
        return this.walletAddress;
    }

    public CreateDistributorSubuserRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDistributorSubuserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDistributorSubuserRequest setUserTarget(String userTarget) {
        this.userTarget = userTarget;
        return this;
    }
    public String getUserTarget() {
        return this.userTarget;
    }

}
