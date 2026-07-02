// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotlinkThingmodeltslRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 您编辑的物模型（TSL）。JSON格式的字符串。产品的物模型（TSL）包含属性、服务和事件的定义。
    @NameInMap("tsl_str")
    @Validation(required = true)
    public String tslStr;

    public static ImportIotlinkThingmodeltslRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotlinkThingmodeltslRequest self = new ImportIotlinkThingmodeltslRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotlinkThingmodeltslRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotlinkThingmodeltslRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotlinkThingmodeltslRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public ImportIotlinkThingmodeltslRequest setTslStr(String tslStr) {
        this.tslStr = tslStr;
        return this;
    }
    public String getTslStr() {
        return this.tslStr;
    }

}
