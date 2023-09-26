// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察合约接口参数信息
    public class ChainInsightContractInterfaceArgument : TeaModel {
        // 参数名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参数类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 参数位置，枚举：input，output，deposit
        [NameInMap("location")]
        [Validation(Required=true)]
        public string Location { get; set; }

        // 参数的业务名称
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
        [NameInMap("standard_erc_name")]
        [Validation(Required=false)]
        public string StandardErcName { get; set; }

    }

}
