// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SearchMsDssTaskRequest extends TeaModel {
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

    public static SearchMsDssTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMsDssTaskRequest self = new SearchMsDssTaskRequest();
        return TeaModel.build(map, self);
    }

    public SearchMsDssTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SearchMsDssTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SearchMsDssTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchMsDssTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchMsDssTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMsDssTaskRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchMsDssTaskRequest setSystem(String system) {
        this.system = system;
        return this;
    }
    public String getSystem() {
        return this.system;
    }

}
