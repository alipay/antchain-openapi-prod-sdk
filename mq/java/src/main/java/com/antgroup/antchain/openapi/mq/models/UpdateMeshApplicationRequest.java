// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 服务id
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ApplicationServiceDTO> list;

    // 应用名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 服务度get队列
    @NameInMap("pub_get_queue")
    public String pubGetQueue;

    // 服务端put队列
    @NameInMap("pub_put_queue")
    public String pubPutQueue;

    // 服务端开关
    @NameInMap("pub_rpc_status")
    public Long pubRpcStatus;

    // 客户端get队列
    @NameInMap("sub_get_queue")
    public String subGetQueue;

    // 客户端put队列
    @NameInMap("sub_put_queue")
    public String subPutQueue;

    // 客户端rpc比例
    @NameInMap("sub_rpc_scale")
    public Long subRpcScale;

    // 服务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UpdateMeshApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshApplicationRequest self = new UpdateMeshApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshApplicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshApplicationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshApplicationRequest setList(java.util.List<ApplicationServiceDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApplicationServiceDTO> getList() {
        return this.list;
    }

    public UpdateMeshApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMeshApplicationRequest setPubGetQueue(String pubGetQueue) {
        this.pubGetQueue = pubGetQueue;
        return this;
    }
    public String getPubGetQueue() {
        return this.pubGetQueue;
    }

    public UpdateMeshApplicationRequest setPubPutQueue(String pubPutQueue) {
        this.pubPutQueue = pubPutQueue;
        return this;
    }
    public String getPubPutQueue() {
        return this.pubPutQueue;
    }

    public UpdateMeshApplicationRequest setPubRpcStatus(Long pubRpcStatus) {
        this.pubRpcStatus = pubRpcStatus;
        return this;
    }
    public Long getPubRpcStatus() {
        return this.pubRpcStatus;
    }

    public UpdateMeshApplicationRequest setSubGetQueue(String subGetQueue) {
        this.subGetQueue = subGetQueue;
        return this;
    }
    public String getSubGetQueue() {
        return this.subGetQueue;
    }

    public UpdateMeshApplicationRequest setSubPutQueue(String subPutQueue) {
        this.subPutQueue = subPutQueue;
        return this;
    }
    public String getSubPutQueue() {
        return this.subPutQueue;
    }

    public UpdateMeshApplicationRequest setSubRpcScale(Long subRpcScale) {
        this.subRpcScale = subRpcScale;
        return this;
    }
    public Long getSubRpcScale() {
        return this.subRpcScale;
    }

    public UpdateMeshApplicationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
