// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqAuditorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 起始时间
    @NameInMap("closed_start")
    public Long closedStart;

    // 结束时间戳
    @NameInMap("open_end")
    public Long openEnd;

    // 模糊资源名
    @NameInMap("resource")
    public String resource;

    public static ListSofamqAuditorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqAuditorRequest self = new ListSofamqAuditorRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqAuditorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqAuditorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqAuditorRequest setClosedStart(Long closedStart) {
        this.closedStart = closedStart;
        return this;
    }
    public Long getClosedStart() {
        return this.closedStart;
    }

    public ListSofamqAuditorRequest setOpenEnd(Long openEnd) {
        this.openEnd = openEnd;
        return this;
    }
    public Long getOpenEnd() {
        return this.openEnd;
    }

    public ListSofamqAuditorRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
