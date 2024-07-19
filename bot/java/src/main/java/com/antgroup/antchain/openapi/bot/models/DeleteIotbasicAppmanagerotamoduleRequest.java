// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotbasicAppmanagerotamoduleRequest extends TeaModel {
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

    public static DeleteIotbasicAppmanagerotamoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotbasicAppmanagerotamoduleRequest self = new DeleteIotbasicAppmanagerotamoduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIotbasicAppmanagerotamoduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIotbasicAppmanagerotamoduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIotbasicAppmanagerotamoduleRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public DeleteIotbasicAppmanagerotamoduleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
