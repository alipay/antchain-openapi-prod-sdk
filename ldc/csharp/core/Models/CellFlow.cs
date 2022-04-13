// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署单元对应的流量规则
    public class CellFlow : TeaModel {
        // 部署单元名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 蓝绿着色。
        // BLUE：蓝
        // GREEN：绿
        // 非着色单元为 null
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 部署单元所占单元组的流量比。
        [NameInMap("percent")]
        [Validation(Required=true)]
        public long? Percent { get; set; }

    }

}
