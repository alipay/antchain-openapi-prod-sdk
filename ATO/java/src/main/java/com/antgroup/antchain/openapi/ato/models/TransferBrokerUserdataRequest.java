// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TransferBrokerUserdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据的唯一id，支持数字、大小写字母或下划线
    @NameInMap("data_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String dataId;

    // 枚举，数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 数据内容,使用JSONArray结构
    @NameInMap("data_content")
    @Validation(required = true)
    public String dataContent;

    // DIRECT直推;ROUND_ROBIN轮询;BROADCAST广播
    @NameInMap("push_mode")
    public String pushMode;

    public static TransferBrokerUserdataRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferBrokerUserdataRequest self = new TransferBrokerUserdataRequest();
        return TeaModel.build(map, self);
    }

    public TransferBrokerUserdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferBrokerUserdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferBrokerUserdataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public TransferBrokerUserdataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public TransferBrokerUserdataRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

    public TransferBrokerUserdataRequest setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

}
