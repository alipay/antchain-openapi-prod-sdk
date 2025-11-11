// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class ResumeSkillInfo extends TeaModel {
    // 技能标签名字
    /**
     * <strong>example:</strong>
     * <p>技能标签名字</p>
     */
    @NameInMap("skill_name")
    @Validation(maxLength = 128)
    public String skillName;

    public static ResumeSkillInfo build(java.util.Map<String, ?> map) throws Exception {
        ResumeSkillInfo self = new ResumeSkillInfo();
        return TeaModel.build(map, self);
    }

    public ResumeSkillInfo setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
