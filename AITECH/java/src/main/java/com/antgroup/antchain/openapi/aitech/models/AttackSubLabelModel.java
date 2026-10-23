// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AttackSubLabelModel extends TeaModel {
    // 提示词攻击手法二级标签
    /**
     * <strong>example:</strong>
     * <p>jailbreak_attack</p>
     */
    @NameInMap("attack_sub_label")
    public String attackSubLabel;

    public static AttackSubLabelModel build(java.util.Map<String, ?> map) throws Exception {
        AttackSubLabelModel self = new AttackSubLabelModel();
        return TeaModel.build(map, self);
    }

    public AttackSubLabelModel setAttackSubLabel(String attackSubLabel) {
        this.attackSubLabel = attackSubLabel;
        return this;
    }
    public String getAttackSubLabel() {
        return this.attackSubLabel;
    }

}
