// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SearchDssTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("name")
    public String name;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("start")
    public Integer start;

    @NameInMap("system")
    public String system;

    public static SearchDssTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDssTaskRequest self = new SearchDssTaskRequest();
        return TeaModel.build(map, self);
    }

    public SearchDssTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SearchDssTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SearchDssTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchDssTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchDssTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDssTaskRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchDssTaskRequest setSystem(String system) {
        this.system = system;
        return this;
    }
    public String getSystem() {
        return this.system;
    }

}
