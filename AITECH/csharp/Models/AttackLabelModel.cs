// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 提示词攻击手法
    public class AttackLabelModel : TeaModel {
        // 提示词攻击手法一级标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>jailbreak_attack</para>
        /// </summary>
        [NameInMap("attack_label")]
        [Validation(Required=false)]
        public string AttackLabel { get; set; }

        // 提示词攻击手法二级标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("attack_sub_labels")]
        [Validation(Required=false)]
        public List<AttackSubLabelModel> AttackSubLabels { get; set; }

    }

}
