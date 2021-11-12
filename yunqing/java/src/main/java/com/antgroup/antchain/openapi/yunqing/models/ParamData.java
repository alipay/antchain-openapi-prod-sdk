// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ParamData extends TeaModel {
    // 参数key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 参数值
    @NameInMap("value")
    public String value;

    // 类型, 对应Data的paramGroup
    @NameInMap("type")
    public String type;

    // 安全级别，脱敏用
    @NameInMap("security_level")
    public String securityLevel;

    public static ParamData build(java.util.Map<String, ?> map) throws Exception {
        ParamData self = new ParamData();
        return TeaModel.build(map, self);
    }

    public ParamData setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ParamData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ParamData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ParamData setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

}
