// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequerySdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页数，默认1
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码大小，默认10，最大100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // sdk版本号
    @NameInMap("sdk_version_str")
    public String sdkVersionStr;

    // 公司名称
    @NameInMap("corp_name")
    public String corpName;

    public static PagequerySdkRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequerySdkRequest self = new PagequerySdkRequest();
        return TeaModel.build(map, self);
    }

    public PagequerySdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequerySdkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequerySdkRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequerySdkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequerySdkRequest setSdkVersionStr(String sdkVersionStr) {
        this.sdkVersionStr = sdkVersionStr;
        return this;
    }
    public String getSdkVersionStr() {
        return this.sdkVersionStr;
    }

    public PagequerySdkRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
