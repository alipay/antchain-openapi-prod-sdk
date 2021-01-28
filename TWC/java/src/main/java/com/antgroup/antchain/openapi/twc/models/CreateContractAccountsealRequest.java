// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractAccountsealRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 印章别名
    @NameInMap("alias")
    public String alias;

    // 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
    @NameInMap("color")
    @Validation(required = true)
    public String color;

    // 印章高度, 默认95px
    @NameInMap("height")
    public Long height;

    // 印章宽度, 默认95px
    @NameInMap("width")
    public Long width;

    // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CreateContractAccountsealRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractAccountsealRequest self = new CreateContractAccountsealRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractAccountsealRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractAccountsealRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractAccountsealRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateContractAccountsealRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateContractAccountsealRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateContractAccountsealRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreateContractAccountsealRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public CreateContractAccountsealRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
