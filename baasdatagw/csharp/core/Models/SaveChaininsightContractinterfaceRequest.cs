// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class SaveChaininsightContractinterfaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 合约 / 存证账户地址
        [NameInMap("contract")]
        [Validation(Required=true)]
        public string Contract { get; set; }

        // 生效块高
        [NameInMap("ver")]
        [Validation(Required=false)]
        public string Ver { get; set; }

        // 接口类型，Function / Event
        [NameInMap("interface_type")]
        [Validation(Required=true)]
        public string InterfaceType { get; set; }

        // 接口列表
        [NameInMap("contract_interfaces")]
        [Validation(Required=true)]
        public List<ChainInsightContractInterface> ContractInterfaces { get; set; }

    }

}
