// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotlinkOtamoduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 要删除的OTA模块名称。
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    public static DeleteIotlinkOtamoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotlinkOtamoduleRequest self = new DeleteIotlinkOtamoduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIotlinkOtamoduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIotlinkOtamoduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIotlinkOtamoduleRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public DeleteIotlinkOtamoduleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
