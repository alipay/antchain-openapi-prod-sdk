// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // key
    @NameInMap("property")
    public String property;

    // target name
    @NameInMap("target_name")
    public String targetName;

    // cluster or broker type
    @NameInMap("target_type")
    public Long targetType;

    public static ListSofamqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqConfigRequest self = new ListSofamqConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqConfigRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSofamqConfigRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSofamqConfigRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public ListSofamqConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListSofamqConfigRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

}
