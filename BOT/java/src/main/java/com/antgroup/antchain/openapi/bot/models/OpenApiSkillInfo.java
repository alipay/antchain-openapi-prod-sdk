// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OpenApiSkillInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static OpenApiSkillInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiSkillInfo self = new OpenApiSkillInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiSkillInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiSkillInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
