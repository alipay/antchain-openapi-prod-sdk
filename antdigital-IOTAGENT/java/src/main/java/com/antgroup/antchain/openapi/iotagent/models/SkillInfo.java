// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class SkillInfo extends TeaModel {
    // skill名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("skill_name")
    @Validation(required = true)
    public String skillName;

    // 版本
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // oss地址
    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static SkillInfo build(java.util.Map<String, ?> map) throws Exception {
        SkillInfo self = new SkillInfo();
        return TeaModel.build(map, self);
    }

    public SkillInfo setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public SkillInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SkillInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
