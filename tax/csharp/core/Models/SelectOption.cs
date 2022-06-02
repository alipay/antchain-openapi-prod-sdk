// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 选择组件
    public class SelectOption : TeaModel {
        // 选项名称
        [NameInMap("lable")]
        [Validation(Required=true)]
        public string Lable { get; set; }

        // 选项的值，一般是 id 之类的唯一标识符，给后端传这个
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
