// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarProductcustomerpageRequest extends TeaModel {
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

    // 产品名称
    @NameInMap("product_name")
    public String productName;

    // 产品key
    @NameInMap("product_key")
    public String productKey;

    // 行业id
    @NameInMap("industry_id")
    public String industryId;

    // 品类id
    @NameInMap("category_id")
    public String categoryId;

    // 联网方式：0-WIFI、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
    @NameInMap("net_type")
    public Long netType;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    public static QueryElectrocarProductcustomerpageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarProductcustomerpageRequest self = new QueryElectrocarProductcustomerpageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarProductcustomerpageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarProductcustomerpageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarProductcustomerpageRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryElectrocarProductcustomerpageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarProductcustomerpageRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryElectrocarProductcustomerpageRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryElectrocarProductcustomerpageRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public QueryElectrocarProductcustomerpageRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public QueryElectrocarProductcustomerpageRequest setNetType(Long netType) {
        this.netType = netType;
        return this;
    }
    public Long getNetType() {
        return this.netType;
    }

    public QueryElectrocarProductcustomerpageRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
