// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceDisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("extend")
    public String extend;

    // 是否为他人代理申请分布式数字身份,缺省时为自己创建分布式数字身份
    @NameInMap("is_agent")
    public Boolean isAgent;

    // 用户（企业）名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CreateLogisticFinanceDisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceDisRequest self = new CreateLogisticFinanceDisRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceDisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceDisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceDisRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateLogisticFinanceDisRequest setIsAgent(Boolean isAgent) {
        this.isAgent = isAgent;
        return this;
    }
    public Boolean getIsAgent() {
        return this.isAgent;
    }

    public CreateLogisticFinanceDisRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
