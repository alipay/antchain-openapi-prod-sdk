// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AttackLabel extends TeaModel {
    // 提示词攻击手法一级标签
    /**
     * <strong>example:</strong>
     * <p>jailbreak：越狱攻击</p>
     */
    @NameInMap("attack_label")
    public String attackLabel;

    // 提示词攻击手法二级标签列表
    @NameInMap("attack_sub_labels")
    public AttackSubLabel attackSubLabels;

    public static AttackLabel build(java.util.Map<String, ?> map) throws Exception {
        AttackLabel self = new AttackLabel();
        return TeaModel.build(map, self);
    }

    public AttackLabel setAttackLabel(String attackLabel) {
        this.attackLabel = attackLabel;
        return this;
    }
    public String getAttackLabel() {
        return this.attackLabel;
    }

    public AttackLabel setAttackSubLabels(AttackSubLabel attackSubLabels) {
        this.attackSubLabels = attackSubLabels;
        return this;
    }
    public AttackSubLabel getAttackSubLabels() {
        return this.attackSubLabels;
    }

}
