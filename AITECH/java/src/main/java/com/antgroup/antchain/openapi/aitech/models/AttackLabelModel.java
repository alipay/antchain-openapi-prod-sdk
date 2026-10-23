// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AttackLabelModel extends TeaModel {
    // 提示词攻击手法一级标签
    /**
     * <strong>example:</strong>
     * <p>jailbreak_attack</p>
     */
    @NameInMap("attack_label")
    public String attackLabel;

    // 提示词攻击手法二级标签
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("attack_sub_labels")
    public java.util.List<AttackSubLabelModel> attackSubLabels;

    public static AttackLabelModel build(java.util.Map<String, ?> map) throws Exception {
        AttackLabelModel self = new AttackLabelModel();
        return TeaModel.build(map, self);
    }

    public AttackLabelModel setAttackLabel(String attackLabel) {
        this.attackLabel = attackLabel;
        return this;
    }
    public String getAttackLabel() {
        return this.attackLabel;
    }

    public AttackLabelModel setAttackSubLabels(java.util.List<AttackSubLabelModel> attackSubLabels) {
        this.attackSubLabels = attackSubLabels;
        return this;
    }
    public java.util.List<AttackSubLabelModel> getAttackSubLabels() {
        return this.attackSubLabels;
    }

}
