// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ListAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权企业信用代码
    @NameInMap("enterprise_code")
    public String enterpriseCode;

    // 业务应用名称
    @NameInMap("auth_app_name")
    public String authAppName;

    // 产品code列表
    @NameInMap("product_code_list")
    public java.util.List<String> productCodeList;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigRequest self = new ListAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAuthConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAuthConfigRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public ListAuthConfigRequest setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public ListAuthConfigRequest setProductCodeList(java.util.List<String> productCodeList) {
        this.productCodeList = productCodeList;
        return this;
    }
    public java.util.List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public ListAuthConfigRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthConfigRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
