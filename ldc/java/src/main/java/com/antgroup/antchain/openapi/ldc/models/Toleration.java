// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Toleration extends TeaModel {
    // 取值：NoExecute、PreferNoSchedule、NoSchedule
    @NameInMap("effect")
    @Validation(required = true)
    public String effect;

    // Key is the taint key that the toleration applies to.
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 取值：Equal、Exists
    @NameInMap("operator")
    public String operator;

    // TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. 
    @NameInMap("toleration_seconds")
    public Long tolerationSeconds;

    // Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    @NameInMap("value")
    public String value;

    public static Toleration build(java.util.Map<String, ?> map) throws Exception {
        Toleration self = new Toleration();
        return TeaModel.build(map, self);
    }

    public Toleration setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public Toleration setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Toleration setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Toleration setTolerationSeconds(Long tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }
    public Long getTolerationSeconds() {
        return this.tolerationSeconds;
    }

    public Toleration setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
