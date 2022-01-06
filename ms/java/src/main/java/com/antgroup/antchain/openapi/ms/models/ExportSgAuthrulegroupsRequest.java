// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ExportSgAuthrulegroupsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 鉴权规则id集合，多个用逗号隔开，当is_export_all为false时此参数必填
    @NameInMap("auth_rule_ids")
    public String authRuleIds;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否导出所有规则
    @NameInMap("is_export_all")
    @Validation(required = true)
    public Boolean isExportAll;

    public static ExportSgAuthrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSgAuthrulegroupsRequest self = new ExportSgAuthrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public ExportSgAuthrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportSgAuthrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportSgAuthrulegroupsRequest setAuthRuleIds(String authRuleIds) {
        this.authRuleIds = authRuleIds;
        return this;
    }
    public String getAuthRuleIds() {
        return this.authRuleIds;
    }

    public ExportSgAuthrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportSgAuthrulegroupsRequest setIsExportAll(Boolean isExportAll) {
        this.isExportAll = isExportAll;
        return this;
    }
    public Boolean getIsExportAll() {
        return this.isExportAll;
    }

}
