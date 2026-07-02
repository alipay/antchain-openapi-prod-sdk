// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateIotlinkOtamoduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // OTA模块名称，产品下唯一且不可修改。仅支持英文字母、数字、英文句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。 英文字母不区分大小写，例如“scanner”和“Scanner”被认为是相同的模块名称，不可重复使用
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    // OTA模块别名。支持中文、英文字母、数字、英文句号（.）、短划线（-）和下划线（_），长度限制为1~64个字符。
    @NameInMap("alias_name")
    public String aliasName;

    // OTA模块的描述信息，支持最多100个字符。
    @NameInMap("desc")
    public String desc;

    public static UpdateIotlinkOtamoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIotlinkOtamoduleRequest self = new UpdateIotlinkOtamoduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIotlinkOtamoduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIotlinkOtamoduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIotlinkOtamoduleRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public UpdateIotlinkOtamoduleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public UpdateIotlinkOtamoduleRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateIotlinkOtamoduleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
