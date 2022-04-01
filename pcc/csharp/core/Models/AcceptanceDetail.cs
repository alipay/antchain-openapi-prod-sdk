// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 潜客接受度市场逻辑明细
    public class AcceptanceDetail : TeaModel {
        // 客户名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 客户价格
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

    }

}
