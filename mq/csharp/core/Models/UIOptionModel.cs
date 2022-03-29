// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 前端控件中的选择框中每个选项，参见 UIControlModel
    public class UIOptionModel : TeaModel {
        // 选项展示的中文描述
        [NameInMap("display")]
        [Validation(Required=true)]
        public string Display { get; set; }

        // 选项的枚举值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
