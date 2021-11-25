// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 企业奖项
    public class Award : TeaModel {
        // 奖项名称
        // 
        // 
        [NameInMap("award_name")]
        [Validation(Required=true)]
        public string AwardName { get; set; }

        // 奖项级别（参见附录十四）
        // 
        // 
        [NameInMap("award_level")]
        [Validation(Required=true)]
        public string AwardLevel { get; set; }

        // 颁发日期（yyyy）
        // 
        // 
        [NameInMap("issue_date")]
        [Validation(Required=true)]
        public string IssueDate { get; set; }

        // 有效开始日期（yyyy-MM-dd）
        // 
        // 
        [NameInMap("effect_start_date")]
        [Validation(Required=true)]
        public string EffectStartDate { get; set; }

        // 有效结束日期（yyyy-MM-dd）
        // 
        // 
        [NameInMap("effect_end_date")]
        [Validation(Required=true)]
        public string EffectEndDate { get; set; }

        // 文件信息，支持上传多个文件
        // 
        // 
        [NameInMap("file_defines")]
        [Validation(Required=true)]
        public List<FileDefine> FileDefines { get; set; }

        // key
        [NameInMap("award_id")]
        [Validation(Required=true)]
        public string AwardId { get; set; }

    }

}
