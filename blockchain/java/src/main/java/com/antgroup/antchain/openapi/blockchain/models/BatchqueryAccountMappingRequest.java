// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchqueryAccountMappingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要映射的链对应的唯一id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 查询页数
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true, minimum = 1)
    public Long pageSize;

    public static BatchqueryAccountMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryAccountMappingRequest self = new BatchqueryAccountMappingRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryAccountMappingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryAccountMappingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryAccountMappingRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public BatchqueryAccountMappingRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryAccountMappingRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
