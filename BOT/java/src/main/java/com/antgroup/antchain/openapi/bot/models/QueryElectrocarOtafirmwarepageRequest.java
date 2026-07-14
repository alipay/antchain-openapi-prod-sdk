// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtafirmwarepageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 可信物联唯一产品标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // OTA升级包版本号
    @NameInMap("dest_version")
    public String destVersion;

    // 模块名称
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    public static QueryElectrocarOtafirmwarepageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtafirmwarepageRequest self = new QueryElectrocarOtafirmwarepageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtafirmwarepageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtafirmwarepageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtafirmwarepageRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryElectrocarOtafirmwarepageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarOtafirmwarepageRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarOtafirmwarepageRequest setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public QueryElectrocarOtafirmwarepageRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
