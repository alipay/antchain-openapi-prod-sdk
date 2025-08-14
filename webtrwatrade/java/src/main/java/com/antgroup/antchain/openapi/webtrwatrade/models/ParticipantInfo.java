// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ParticipantInfo extends TeaModel {
    // 机构id
    /**
     * <strong>example:</strong>
     * <p>80aee17181634daa9f1c37d787f0ec02</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 二级机构类型
    /**
     * <strong>example:</strong>
     * <p>CHANNEL</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>代销机构</p>
     */
    @NameInMap("name")
    public String name;

    public static ParticipantInfo build(java.util.Map<String, ?> map) throws Exception {
        ParticipantInfo self = new ParticipantInfo();
        return TeaModel.build(map, self);
    }

    public ParticipantInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ParticipantInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ParticipantInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
