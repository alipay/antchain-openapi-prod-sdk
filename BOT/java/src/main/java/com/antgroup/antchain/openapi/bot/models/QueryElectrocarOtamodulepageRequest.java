// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtamodulepageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信物联唯一产品标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // 模块名称
    @NameInMap("module_name")
    public String moduleName;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryElectrocarOtamodulepageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtamodulepageRequest self = new QueryElectrocarOtamodulepageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtamodulepageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtamodulepageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtamodulepageRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarOtamodulepageRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public QueryElectrocarOtamodulepageRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryElectrocarOtamodulepageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
