// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAmlcloudCheckcaseresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，业务的唯一标识，用于追踪业务。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 客户的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 任务来源。取值如下：
    // ● REALTIME：来源于扫描信息接口。
    // ● BATCH：来源于数据仓库。
    // ● ALL：包含以上所有的任务来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 任务类型。取值如下：
    // ● PEP：政治高风险人物。
    // ● SANCTION：制裁名单。
    // ● NEGATIVE_NEWS：负面新闻。
    // ● INTERNAL_LIST：自定义名单。
    // ● EDD：加强尽职调查。
    // ● ALL：包含以上所有的任务类型。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static SubmitAmlcloudCheckcaseresultRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAmlcloudCheckcaseresultRequest self = new SubmitAmlcloudCheckcaseresultRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAmlcloudCheckcaseresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAmlcloudCheckcaseresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAmlcloudCheckcaseresultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAmlcloudCheckcaseresultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitAmlcloudCheckcaseresultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitAmlcloudCheckcaseresultRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
