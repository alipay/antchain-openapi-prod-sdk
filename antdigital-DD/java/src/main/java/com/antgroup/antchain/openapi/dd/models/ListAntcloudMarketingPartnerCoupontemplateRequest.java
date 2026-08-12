// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ListAntcloudMarketingPartnerCoupontemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // start_time到end_time时间区间内可用命中的模版都可以查询出来
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // start_time到end_time时间区间内可用命中的模版都可以查询出来
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 分页查询的页码
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 分页查询每一页查询的记录数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListAntcloudMarketingPartnerCoupontemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntcloudMarketingPartnerCoupontemplateRequest self = new ListAntcloudMarketingPartnerCoupontemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListAntcloudMarketingPartnerCoupontemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntcloudMarketingPartnerCoupontemplateRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAntcloudMarketingPartnerCoupontemplateRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAntcloudMarketingPartnerCoupontemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAntcloudMarketingPartnerCoupontemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
