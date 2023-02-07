// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcVswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // vpc paas id
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // vswitch iaas id
    @NameInMap("vswitch_id")
    public String vswitchId;

    // 起始页，1为起点
    @NameInMap("page_number")
    public Long pageNumber;

    // 最大50，默认值50
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryVpcVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcVswitchRequest self = new QueryVpcVswitchRequest();
        return TeaModel.build(map, self);
    }

    public QueryVpcVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVpcVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QueryVpcVswitchRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public QueryVpcVswitchRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryVpcVswitchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
