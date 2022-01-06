// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncCluster extends TeaModel {
    // 集群id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // [{   //扩展参数，比如涉及到鉴权
    //                   "key": "user",
    //                   "value": "xx"
    //                 }, {
    //                   "key": "password",
    //                   "value": "xx"
    //                 }]
    @NameInMap("extra_params")
    @Validation(required = true)
    public java.util.List<KeyValueModel> extraParams;

    // 集群描述信息
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 集群类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 集群所有的机器列表，；隔开
    @NameInMap("vip")
    @Validation(required = true)
    public String vip;

    public static SyncCluster build(java.util.Map<String, ?> map) throws Exception {
        SyncCluster self = new SyncCluster();
        return TeaModel.build(map, self);
    }

    public SyncCluster setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SyncCluster setExtraParams(java.util.List<KeyValueModel> extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public java.util.List<KeyValueModel> getExtraParams() {
        return this.extraParams;
    }

    public SyncCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SyncCluster setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncCluster setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

}
