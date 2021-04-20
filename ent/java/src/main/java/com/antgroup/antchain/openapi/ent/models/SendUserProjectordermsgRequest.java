// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class SendUserProjectordermsgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 购买者
    @NameInMap("buyer")
    @Validation(required = true)
    public User buyer;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 订单详情
    @NameInMap("order")
    @Validation(required = true)
    public Order order;

    // 项目信息
    @NameInMap("project")
    @Validation(required = true)
    public Project project;

    // 分享者
    @NameInMap("sharer")
    @Validation(required = true)
    public User sharer;

    public static SendUserProjectordermsgRequest build(java.util.Map<String, ?> map) throws Exception {
        SendUserProjectordermsgRequest self = new SendUserProjectordermsgRequest();
        return TeaModel.build(map, self);
    }

    public SendUserProjectordermsgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendUserProjectordermsgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendUserProjectordermsgRequest setBuyer(User buyer) {
        this.buyer = buyer;
        return this;
    }
    public User getBuyer() {
        return this.buyer;
    }

    public SendUserProjectordermsgRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SendUserProjectordermsgRequest setOrder(Order order) {
        this.order = order;
        return this;
    }
    public Order getOrder() {
        return this.order;
    }

    public SendUserProjectordermsgRequest setProject(Project project) {
        this.project = project;
        return this;
    }
    public Project getProject() {
        return this.project;
    }

    public SendUserProjectordermsgRequest setSharer(User sharer) {
        this.sharer = sharer;
        return this;
    }
    public User getSharer() {
        return this.sharer;
    }

}
