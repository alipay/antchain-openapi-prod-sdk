// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 简历技能信息
    public class ResumeSkillInfo : TeaModel {
        // 技能标签名字
        [NameInMap("skill_name")]
        [Validation(Required=false, MaxLength=128)]
        public string SkillName { get; set; }

    }

}
