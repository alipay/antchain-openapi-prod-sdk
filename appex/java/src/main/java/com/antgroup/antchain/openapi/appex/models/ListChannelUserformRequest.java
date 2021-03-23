// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListChannelUserformRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起方的账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 页码，默认1
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小，默认100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListChannelUserformRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChannelUserformRequest self = new ListChannelUserformRequest();
        return TeaModel.build(map, self);
    }

    public ListChannelUserformRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListChannelUserformRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListChannelUserformRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public ListChannelUserformRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public ListChannelUserformRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ListChannelUserformRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListChannelUserformRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
