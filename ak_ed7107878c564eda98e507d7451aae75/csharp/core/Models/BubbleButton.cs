// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 行动点配置
    public class BubbleButton : TeaModel {
        // 按钮文案
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 行动点执行动作值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 行动点执行动作类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
