// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // card
    public class Card : TeaModel {
        // 名称（该页面的名称，可能做展示用）
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
        [NameInMap("tab_show_name")]
        [Validation(Required=true)]
        public string TabShowName { get; set; }

        // 当前模版所有需要填充元素
        [NameInMap("key_values")]
        [Validation(Required=true)]
        public Pair KeyValues { get; set; }

        // true：是，false：不是
        // 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
        [NameInMap("is_selected")]
        [Validation(Required=true)]
        public string IsSelected { get; set; }

        // 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/
        [NameInMap("return_value_key")]
        [Validation(Required=true)]
        public List<string> ReturnValueKey { get; set; }

    }

}
