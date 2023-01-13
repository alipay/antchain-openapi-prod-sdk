// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察合约接口
    public class ChainInsightContractInterface : TeaModel {
        // 展示的函数名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 接口中使用的函数名称标识符
        [NameInMap("name_sig")]
        [Validation(Required=true)]
        public string NameSig { get; set; }

        // 接口的类型，枚举：function, event, deposit
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
