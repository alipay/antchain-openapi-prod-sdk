// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListLeagueApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    @NameInMap("apply_type")
    @Validation(required = true)
    public String applyType;

    // 当前页
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 入盟申请状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static ListLeagueApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLeagueApplyRequest self = new ListLeagueApplyRequest();
        return TeaModel.build(map, self);
    }

    public ListLeagueApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLeagueApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListLeagueApplyRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public ListLeagueApplyRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListLeagueApplyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLeagueApplyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
