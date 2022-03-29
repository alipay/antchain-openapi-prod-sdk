// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportMeshApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 应用名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 服务端get队列
    @NameInMap("pub_get_queue")
    public String pubGetQueue;

    // 服务端put队列
    @NameInMap("pub_put_queue")
    public String pubPutQueue;

    // 服务端rpc开关
    @NameInMap("pub_rpc_status")
    public Long pubRpcStatus;

    // 客户端get队列
    @NameInMap("sub_get_queue")
    public String subGetQueue;

    // 客户端put队列
    @NameInMap("sub_put_queue")
    public String subPutQueue;

    // 客户端rpc分流比例
    @NameInMap("sub_rpc_scale")
    public Long subRpcScale;

    // 服务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 服务id列表
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ApplicationServiceDTO> list;

    public static ImportMeshApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMeshApplicationRequest self = new ImportMeshApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ImportMeshApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportMeshApplicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportMeshApplicationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ImportMeshApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportMeshApplicationRequest setPubGetQueue(String pubGetQueue) {
        this.pubGetQueue = pubGetQueue;
        return this;
    }
    public String getPubGetQueue() {
        return this.pubGetQueue;
    }

    public ImportMeshApplicationRequest setPubPutQueue(String pubPutQueue) {
        this.pubPutQueue = pubPutQueue;
        return this;
    }
    public String getPubPutQueue() {
        return this.pubPutQueue;
    }

    public ImportMeshApplicationRequest setPubRpcStatus(Long pubRpcStatus) {
        this.pubRpcStatus = pubRpcStatus;
        return this;
    }
    public Long getPubRpcStatus() {
        return this.pubRpcStatus;
    }

    public ImportMeshApplicationRequest setSubGetQueue(String subGetQueue) {
        this.subGetQueue = subGetQueue;
        return this;
    }
    public String getSubGetQueue() {
        return this.subGetQueue;
    }

    public ImportMeshApplicationRequest setSubPutQueue(String subPutQueue) {
        this.subPutQueue = subPutQueue;
        return this;
    }
    public String getSubPutQueue() {
        return this.subPutQueue;
    }

    public ImportMeshApplicationRequest setSubRpcScale(Long subRpcScale) {
        this.subRpcScale = subRpcScale;
        return this;
    }
    public Long getSubRpcScale() {
        return this.subRpcScale;
    }

    public ImportMeshApplicationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ImportMeshApplicationRequest setList(java.util.List<ApplicationServiceDTO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApplicationServiceDTO> getList() {
        return this.list;
    }

}
