// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryIotlinkAppmanagerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("apk_name")
    public String apkName;

    // 应用版本号
    @NameInMap("apk_version")
    public String apkVersion;

    // 当前页
    // 默认第一页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页数量
    // 默认20条，最大100条
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 品类code
    @NameInMap("category_code")
    public String categoryCode;

    // 应用模块名称，由查询应用类型列表获取
    @NameInMap("module_name")
    public String moduleName;

    public static PagequeryIotlinkAppmanagerRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIotlinkAppmanagerRequest self = new PagequeryIotlinkAppmanagerRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIotlinkAppmanagerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIotlinkAppmanagerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIotlinkAppmanagerRequest setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public PagequeryIotlinkAppmanagerRequest setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public PagequeryIotlinkAppmanagerRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryIotlinkAppmanagerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIotlinkAppmanagerRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public PagequeryIotlinkAppmanagerRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
