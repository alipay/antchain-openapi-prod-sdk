// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 监管风险标签
    public class RtopRiskTag : TeaModel {
        // 标签ID
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 标签名称
        [NameInMap("tag_name")]
        [Validation(Required=true)]
        public string TagName { get; set; }

        // 标签类型
        [NameInMap("tag_type")]
        [Validation(Required=false)]
        public string TagType { get; set; }

        // 标签文本
        [NameInMap("tag_text")]
        [Validation(Required=false)]
        public string TagText { get; set; }

        // 线索概览
        [NameInMap("tag_clue")]
        [Validation(Required=false)]
        public string TagClue { get; set; }

        // 线索明细类型
        [NameInMap("clue_detail_type")]
        [Validation(Required=false)]
        public string ClueDetailType { get; set; }

        // 线索明细
        [NameInMap("tag_clue_detail")]
        [Validation(Required=false)]
        public string TagClueDetail { get; set; }

    }

}
