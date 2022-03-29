// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ApplicationDTO extends TeaModel {
    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreated;

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

    // 服务端开关
    @NameInMap("pub_rpc_status")
    public Long pubRpcStatus;

    // 客户端get队列
    @NameInMap("sub_get_queue")
    public String subGetQueue;

    // 客户端put队列
    @NameInMap("sub_put_queue")
    public String subPutQueue;

    // rpc分流比例
    @NameInMap("sub_rpc_scale")
    public Long subRpcScale;

    // 服务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ApplicationDTO build(java.util.Map<String, ?> map) throws Exception {
        ApplicationDTO self = new ApplicationDTO();
        return TeaModel.build(map, self);
    }

    public ApplicationDTO setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public ApplicationDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ApplicationDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationDTO setPubGetQueue(String pubGetQueue) {
        this.pubGetQueue = pubGetQueue;
        return this;
    }
    public String getPubGetQueue() {
        return this.pubGetQueue;
    }

    public ApplicationDTO setPubPutQueue(String pubPutQueue) {
        this.pubPutQueue = pubPutQueue;
        return this;
    }
    public String getPubPutQueue() {
        return this.pubPutQueue;
    }

    public ApplicationDTO setPubRpcStatus(Long pubRpcStatus) {
        this.pubRpcStatus = pubRpcStatus;
        return this;
    }
    public Long getPubRpcStatus() {
        return this.pubRpcStatus;
    }

    public ApplicationDTO setSubGetQueue(String subGetQueue) {
        this.subGetQueue = subGetQueue;
        return this;
    }
    public String getSubGetQueue() {
        return this.subGetQueue;
    }

    public ApplicationDTO setSubPutQueue(String subPutQueue) {
        this.subPutQueue = subPutQueue;
        return this;
    }
    public String getSubPutQueue() {
        return this.subPutQueue;
    }

    public ApplicationDTO setSubRpcScale(Long subRpcScale) {
        this.subRpcScale = subRpcScale;
        return this;
    }
    public Long getSubRpcScale() {
        return this.subRpcScale;
    }

    public ApplicationDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
