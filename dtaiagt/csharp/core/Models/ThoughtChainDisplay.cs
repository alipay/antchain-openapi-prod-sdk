// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 对话界面思维链显示标题结构
    public class ThoughtChainDisplay : TeaModel {
        // 思维链显示状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 思维链显示名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 思维链类型
        [NameInMap("sub_type")]
        [Validation(Required=true)]
        public string SubType { get; set; }

        // 思维链图标
        [NameInMap("icon")]
        [Validation(Required=true)]
        public string Icon { get; set; }

        // 思维链模块额外信息
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

    }

}
