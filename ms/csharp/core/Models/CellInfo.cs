// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 单元信息
    public class CellInfo : TeaModel {
        // 单元
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 是否特别推送
        [NameInMap("special_push")]
        [Validation(Required=false)]
        public bool? SpecialPush { get; set; }

        // 推送值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
