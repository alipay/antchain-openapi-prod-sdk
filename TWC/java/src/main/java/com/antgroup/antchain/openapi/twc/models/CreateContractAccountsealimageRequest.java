// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractAccountsealimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 印章别名
    @NameInMap("alias")
    public String alias;

    // 印章高度, 个人默认95px, 机构默认159px
    @NameInMap("height")
    public Long height;

    // 印章宽度, 个人默认95px, 机构默认159px
    @NameInMap("width")
    public Long width;

    // 印章数据类型，BASE64：base64格式
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 印章数据，base64格式字符串，不包含格式前缀
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
    @NameInMap("transparent_flag")
    public Boolean transparentFlag;

    public static CreateContractAccountsealimageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractAccountsealimageRequest self = new CreateContractAccountsealimageRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractAccountsealimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractAccountsealimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractAccountsealimageRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateContractAccountsealimageRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateContractAccountsealimageRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreateContractAccountsealimageRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public CreateContractAccountsealimageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateContractAccountsealimageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateContractAccountsealimageRequest setTransparentFlag(Boolean transparentFlag) {
        this.transparentFlag = transparentFlag;
        return this;
    }
    public Boolean getTransparentFlag() {
        return this.transparentFlag;
    }

}
