// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AttackSubLabel extends TeaModel {
    // 提示词攻击手法二级标签
    /**
     * <strong>example:</strong>
     * <p>role_play：角色扮演</p>
     */
    @NameInMap("attack_sub_label")
    public String attackSubLabel;

    public static AttackSubLabel build(java.util.Map<String, ?> map) throws Exception {
        AttackSubLabel self = new AttackSubLabel();
        return TeaModel.build(map, self);
    }

    public AttackSubLabel setAttackSubLabel(String attackSubLabel) {
        this.attackSubLabel = attackSubLabel;
        return this;
    }
    public String getAttackSubLabel() {
        return this.attackSubLabel;
    }

}
