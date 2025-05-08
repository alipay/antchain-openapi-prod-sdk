// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryShorturlParseresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 短链批次号
    @NameInMap("cust_batch_id")
    @Validation(required = true)
    public String custBatchId;

    // 短链地址
    @NameInMap("aim_url")
    @Validation(required = true)
    public String aimUrl;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryShorturlParseresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShorturlParseresultRequest self = new QueryShorturlParseresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryShorturlParseresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryShorturlParseresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryShorturlParseresultRequest setCustBatchId(String custBatchId) {
        this.custBatchId = custBatchId;
        return this;
    }
    public String getCustBatchId() {
        return this.custBatchId;
    }

    public QueryShorturlParseresultRequest setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }
    public String getAimUrl() {
        return this.aimUrl;
    }

    public QueryShorturlParseresultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryShorturlParseresultRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
