// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListUnionPubchannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 发起查询的账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 页码，不传默认为第一页
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小，不传默认为100，页大小上限为100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListUnionPubchannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnionPubchannelRequest self = new ListUnionPubchannelRequest();
        return TeaModel.build(map, self);
    }

    public ListUnionPubchannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUnionPubchannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUnionPubchannelRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public ListUnionPubchannelRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ListUnionPubchannelRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListUnionPubchannelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
