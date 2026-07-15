// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryPanoraindexPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 根据标题模糊搜搜
    @NameInMap("title")
    public String title;

    // 根据标题或地区模糊搜索
    @NameInMap("titleorregionlike")
    public String titleorregionlike;

    // 一页数据量，最大100
    @NameInMap("pagesize")
    public Long pagesize;

    // 排序字段
    @NameInMap("orderby")
    public String orderby;

    // 排序方向（ASC/DESC，默认为DESC）
    @NameInMap("orderdirection")
    public String orderdirection;

    // 最小id，用于游标翻页
    @NameInMap("minid")
    public Long minid;

    // 页号
    @NameInMap("pagenum")
    public Long pagenum;

    // 来源网站code码，可批量查询最多填15个
    @NameInMap("websitecode")
    public java.util.List<String> websitecode;

    public static QueryPanoraindexPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPanoraindexPolicyRequest self = new QueryPanoraindexPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryPanoraindexPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPanoraindexPolicyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryPanoraindexPolicyRequest setTitleorregionlike(String titleorregionlike) {
        this.titleorregionlike = titleorregionlike;
        return this;
    }
    public String getTitleorregionlike() {
        return this.titleorregionlike;
    }

    public QueryPanoraindexPolicyRequest setPagesize(Long pagesize) {
        this.pagesize = pagesize;
        return this;
    }
    public Long getPagesize() {
        return this.pagesize;
    }

    public QueryPanoraindexPolicyRequest setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }
    public String getOrderby() {
        return this.orderby;
    }

    public QueryPanoraindexPolicyRequest setOrderdirection(String orderdirection) {
        this.orderdirection = orderdirection;
        return this;
    }
    public String getOrderdirection() {
        return this.orderdirection;
    }

    public QueryPanoraindexPolicyRequest setMinid(Long minid) {
        this.minid = minid;
        return this;
    }
    public Long getMinid() {
        return this.minid;
    }

    public QueryPanoraindexPolicyRequest setPagenum(Long pagenum) {
        this.pagenum = pagenum;
        return this;
    }
    public Long getPagenum() {
        return this.pagenum;
    }

    public QueryPanoraindexPolicyRequest setWebsitecode(java.util.List<String> websitecode) {
        this.websitecode = websitecode;
        return this;
    }
    public java.util.List<String> getWebsitecode() {
        return this.websitecode;
    }

}
