// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarEnterprisememberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 会员注册开始时间
    @NameInMap("register_start_time")
    public String registerStartTime;

    // 会员注册结束时间
    @NameInMap("register_end_time")
    public String registerEndTime;

    // 当前查询页码，默认值为1
    @NameInMap("current")
    public Long current;

    // 每页记录条数，默认为20，取值范围为[10,200]
    @NameInMap("page_size")
    public Long pageSize;

    public static ListEcarEnterprisememberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcarEnterprisememberRequest self = new ListEcarEnterprisememberRequest();
        return TeaModel.build(map, self);
    }

    public ListEcarEnterprisememberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListEcarEnterprisememberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListEcarEnterprisememberRequest setRegisterStartTime(String registerStartTime) {
        this.registerStartTime = registerStartTime;
        return this;
    }
    public String getRegisterStartTime() {
        return this.registerStartTime;
    }

    public ListEcarEnterprisememberRequest setRegisterEndTime(String registerEndTime) {
        this.registerEndTime = registerEndTime;
        return this;
    }
    public String getRegisterEndTime() {
        return this.registerEndTime;
    }

    public ListEcarEnterprisememberRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListEcarEnterprisememberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
