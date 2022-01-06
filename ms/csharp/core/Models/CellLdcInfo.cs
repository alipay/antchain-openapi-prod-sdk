// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // LDC类型单元信息
    public class CellLdcInfo : TeaModel {
        // 单元名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 单元类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
