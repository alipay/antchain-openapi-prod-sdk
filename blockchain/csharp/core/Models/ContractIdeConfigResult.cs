// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约链配置信息结果，内部包含一个列表，列举多个合约链的配置信息
    public class ContractIdeConfigResult : TeaModel {
        // 合约链的配置信息，可包含多个合约链的配置
        [NameInMap("contract_ide_config_list")]
        [Validation(Required=true)]
        public List<ContractIdeConfig> ContractIdeConfigList { get; set; }

    }

}
