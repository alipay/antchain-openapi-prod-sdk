// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationParticipantPageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信用代码编号
    @NameInMap("credit_number")
    public String creditNumber;

    // 参与方名字
    @NameInMap("name")
    public String name;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 角色
    @NameInMap("role")
    public String role;

    // 空间ID
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 账户名称
    @NameInMap("account")
    public String account;

    public static ListDataauthorizationParticipantPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationParticipantPageRequest self = new ListDataauthorizationParticipantPageRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationParticipantPageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationParticipantPageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationParticipantPageRequest setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        return this;
    }
    public String getCreditNumber() {
        return this.creditNumber;
    }

    public ListDataauthorizationParticipantPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataauthorizationParticipantPageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationParticipantPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationParticipantPageRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListDataauthorizationParticipantPageRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ListDataauthorizationParticipantPageRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
