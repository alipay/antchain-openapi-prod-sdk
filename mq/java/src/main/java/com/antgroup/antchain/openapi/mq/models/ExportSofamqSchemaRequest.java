// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExportSofamqSchemaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sofamq instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // schema的唯一ID
    @NameInMap("schema_id")
    @Validation(required = true)
    public String schemaId;

    // 实例代码的变成语言类型，空缺时使用Java
    @NameInMap("language")
    public String language;

    public static ExportSofamqSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSofamqSchemaRequest self = new ExportSofamqSchemaRequest();
        return TeaModel.build(map, self);
    }

    public ExportSofamqSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportSofamqSchemaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportSofamqSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportSofamqSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public ExportSofamqSchemaRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
