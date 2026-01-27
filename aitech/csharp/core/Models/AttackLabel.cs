// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 提示词攻击手法一级标签
    public class AttackLabel : TeaModel {
        // 提示词攻击手法一级标签
        [NameInMap("attack_label")]
        [Validation(Required=false)]
        public string AttackLabel_ { get; set; }

        // 提示词攻击手法二级标签列表
        [NameInMap("attack_sub_labels")]
        [Validation(Required=false)]
        public AttackSubLabel AttackSubLabels { get; set; }

    }

}
