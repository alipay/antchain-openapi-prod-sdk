// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgListrolesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前默认为1的页码
    @NameInMap("current")
    public Long current;

    // 页数 默认为20
    @NameInMap("page_size")
    public Long pageSize;

    // 角色名称搜索条件
    @NameInMap("name")
    public String name;

    // verifyToken中的企业编码
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    public static QueryEsgListrolesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgListrolesRequest self = new QueryEsgListrolesRequest();
        return TeaModel.build(map, self);
    }

    public QueryEsgListrolesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEsgListrolesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEsgListrolesRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryEsgListrolesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEsgListrolesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryEsgListrolesRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

}
