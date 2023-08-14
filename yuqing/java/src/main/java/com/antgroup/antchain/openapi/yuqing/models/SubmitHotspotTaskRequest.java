// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SubmitHotspotTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 媒体类型
    @NameInMap("media_sub_types")
    @Validation(required = true)
    public java.util.List<String> mediaSubTypes;

    // 任务过期时间,单位秒
    @NameInMap("expired_time")
    @Validation(required = true)
    public Long expiredTime;

    // 排序方式： 正序(+)、倒序(-)
    @NameInMap("sort_by_direction")
    public String sortByDirection;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 爬取开始时间过滤
    @NameInMap("crawler_time_start_filter")
    public Long crawlerTimeStartFilter;

    // 爬取结束时间过滤
    @NameInMap("crawler_time_end_filter")
    public Long crawlerTimeEndFilter;

    public static SubmitHotspotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotspotTaskRequest self = new SubmitHotspotTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotspotTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitHotspotTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitHotspotTaskRequest setMediaSubTypes(java.util.List<String> mediaSubTypes) {
        this.mediaSubTypes = mediaSubTypes;
        return this;
    }
    public java.util.List<String> getMediaSubTypes() {
        return this.mediaSubTypes;
    }

    public SubmitHotspotTaskRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public SubmitHotspotTaskRequest setSortByDirection(String sortByDirection) {
        this.sortByDirection = sortByDirection;
        return this;
    }
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    public SubmitHotspotTaskRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SubmitHotspotTaskRequest setCrawlerTimeStartFilter(Long crawlerTimeStartFilter) {
        this.crawlerTimeStartFilter = crawlerTimeStartFilter;
        return this;
    }
    public Long getCrawlerTimeStartFilter() {
        return this.crawlerTimeStartFilter;
    }

    public SubmitHotspotTaskRequest setCrawlerTimeEndFilter(Long crawlerTimeEndFilter) {
        this.crawlerTimeEndFilter = crawlerTimeEndFilter;
        return this;
    }
    public Long getCrawlerTimeEndFilter() {
        return this.crawlerTimeEndFilter;
    }

}
