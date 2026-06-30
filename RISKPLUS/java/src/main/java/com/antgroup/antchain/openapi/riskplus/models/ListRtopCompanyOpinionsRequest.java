// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopCompanyOpinionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地区类型
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 一页的数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListRtopCompanyOpinionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtopCompanyOpinionsRequest self = new ListRtopCompanyOpinionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRtopCompanyOpinionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRtopCompanyOpinionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListRtopCompanyOpinionsRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public ListRtopCompanyOpinionsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListRtopCompanyOpinionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
