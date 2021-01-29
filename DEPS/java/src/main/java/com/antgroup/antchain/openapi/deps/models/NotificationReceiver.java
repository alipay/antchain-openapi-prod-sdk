// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class NotificationReceiver extends TeaModel {
    // config id
    @NameInMap("config_id")
    @Validation(required = true)
    public String configId;

    // receiver
    @NameInMap("receiver")
    @Validation(required = true)
    public String receiver;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static NotificationReceiver build(java.util.Map<String, ?> map) throws Exception {
        NotificationReceiver self = new NotificationReceiver();
        return TeaModel.build(map, self);
    }

    public NotificationReceiver setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public NotificationReceiver setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public NotificationReceiver setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotificationReceiver setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
