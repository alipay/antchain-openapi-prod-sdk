// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRisklabelRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // mct_one_id  -- search after使用
    @NameInMap("mct_one_id")
    public String mctOneId;

    // pageNo
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // pageSize
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // scroll_id
    @NameInMap("scroll_id")
    public String scrollId;

    // tag_id  -- search after使用
    @NameInMap("tag_id")
    public String tagId;

    // 数据更新日期
    @NameInMap("update_date")
    @Validation(required = true)
    public String updateDate;

    public static QueryRtopRisklabelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRisklabelRequest self = new QueryRtopRisklabelRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopRisklabelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopRisklabelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopRisklabelRequest setMctOneId(String mctOneId) {
        this.mctOneId = mctOneId;
        return this;
    }
    public String getMctOneId() {
        return this.mctOneId;
    }

    public QueryRtopRisklabelRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopRisklabelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopRisklabelRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public QueryRtopRisklabelRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public QueryRtopRisklabelRequest setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }
    public String getUpdateDate() {
        return this.updateDate;
    }

}
