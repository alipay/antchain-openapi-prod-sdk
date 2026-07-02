// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerNoticeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 通知id
    @NameInMap("notice_id")
    @Validation(required = true)
    public Long noticeId;

    // 是否未读
    @NameInMap("unread")
    @Validation(required = true)
    public Boolean unread;

    public static DetailInnerNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerNoticeRequest self = new DetailInnerNoticeRequest();
        return TeaModel.build(map, self);
    }

    public DetailInnerNoticeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailInnerNoticeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailInnerNoticeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DetailInnerNoticeRequest setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
        return this;
    }
    public Long getNoticeId() {
        return this.noticeId;
    }

    public DetailInnerNoticeRequest setUnread(Boolean unread) {
        this.unread = unread;
        return this;
    }
    public Boolean getUnread() {
        return this.unread;
    }

}
