// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryIssuerProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目名称模糊查询条件
    @NameInMap("name")
    public String name;

    // 项目状态(ACTIVE：激活；PAUSED：暂停)
    @NameInMap("status")
    public String status;

    // 当前页码(默认为第一页)
    @NameInMap("page_num")
    public Long pageNum;

    // 页面显示条数(默认10，最小为5)
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 5)
    public Long pageSize;

    public static PagequeryIssuerProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIssuerProjectRequest self = new PagequeryIssuerProjectRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIssuerProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIssuerProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIssuerProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PagequeryIssuerProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryIssuerProjectRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryIssuerProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
