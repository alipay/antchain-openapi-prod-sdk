// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSchemaAdmindetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ的实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // schema 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 页面编号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListSchemaAdmindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchemaAdmindetailRequest self = new ListSchemaAdmindetailRequest();
        return TeaModel.build(map, self);
    }

    public ListSchemaAdmindetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSchemaAdmindetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSchemaAdmindetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSchemaAdmindetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSchemaAdmindetailRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSchemaAdmindetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
