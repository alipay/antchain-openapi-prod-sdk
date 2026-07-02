// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerOrdermsgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 消息类型
    @NameInMap("msg_publish_type")
    public String msgPublishType;

    // 消息创建时间起始
    @NameInMap("msg_create_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String msgCreateTimeFrom;

    // 消息创建时间结束
    @NameInMap("msg_create_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String msgCreateTimeTo;

    // SANDBOX 沙箱 ；PROD 生产
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 分页查询对象
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerOrdermsgRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerOrdermsgRequest self = new PagequeryInnerOrdermsgRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerOrdermsgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerOrdermsgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerOrdermsgRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerOrdermsgRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryInnerOrdermsgRequest setMsgPublishType(String msgPublishType) {
        this.msgPublishType = msgPublishType;
        return this;
    }
    public String getMsgPublishType() {
        return this.msgPublishType;
    }

    public PagequeryInnerOrdermsgRequest setMsgCreateTimeFrom(String msgCreateTimeFrom) {
        this.msgCreateTimeFrom = msgCreateTimeFrom;
        return this;
    }
    public String getMsgCreateTimeFrom() {
        return this.msgCreateTimeFrom;
    }

    public PagequeryInnerOrdermsgRequest setMsgCreateTimeTo(String msgCreateTimeTo) {
        this.msgCreateTimeTo = msgCreateTimeTo;
        return this;
    }
    public String getMsgCreateTimeTo() {
        return this.msgCreateTimeTo;
    }

    public PagequeryInnerOrdermsgRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PagequeryInnerOrdermsgRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
