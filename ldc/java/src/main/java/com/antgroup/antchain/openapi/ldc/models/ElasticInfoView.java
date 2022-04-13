// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ElasticInfoView extends TeaModel {
    // 全局弹性状态，有效值：NORMAL，ELASTIC
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 弹性值
    @NameInMap("elastic_values")
    public java.util.List<String> elasticValues;

    // 是否压测
    @NameInMap("press")
    public Boolean press;

    public static ElasticInfoView build(java.util.Map<String, ?> map) throws Exception {
        ElasticInfoView self = new ElasticInfoView();
        return TeaModel.build(map, self);
    }

    public ElasticInfoView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ElasticInfoView setElasticValues(java.util.List<String> elasticValues) {
        this.elasticValues = elasticValues;
        return this;
    }
    public java.util.List<String> getElasticValues() {
        return this.elasticValues;
    }

    public ElasticInfoView setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

}
