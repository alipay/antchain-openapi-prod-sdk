// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListUserChannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 发起账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 操作权限类型读、写，入参为WRITE, READ
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 页码，从1开始，不传默认查询第一页
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小，不传的话默认100，页大小上限100
    @NameInMap("page_size")
    public Long pageSize;

    public static ListUserChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserChannelRequest self = new ListUserChannelRequest();
        return TeaModel.build(map, self);
    }

    public ListUserChannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUserChannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUserChannelRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public ListUserChannelRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ListUserChannelRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public ListUserChannelRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListUserChannelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
