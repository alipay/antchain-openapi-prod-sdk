// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgListbyroleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 不能为空，且必须属于当前企业
    @NameInMap("role_no")
    @Validation(required = true)
    public String roleNo;

    // 页码 默认1
    @NameInMap("current")
    public Long current;

    // 页数 默认20
    @NameInMap("page_size")
    public Long pageSize;

    // verifyToken中的企业编码
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    public static QueryEsgListbyroleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgListbyroleRequest self = new QueryEsgListbyroleRequest();
        return TeaModel.build(map, self);
    }

    public QueryEsgListbyroleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEsgListbyroleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEsgListbyroleRequest setRoleNo(String roleNo) {
        this.roleNo = roleNo;
        return this;
    }
    public String getRoleNo() {
        return this.roleNo;
    }

    public QueryEsgListbyroleRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryEsgListbyroleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEsgListbyroleRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

}
