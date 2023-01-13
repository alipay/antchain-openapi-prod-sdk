// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class UpdateChaininsightContractinterfaceRequest : TeaModel {
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

        // 链上地址
        [NameInMap("hex_address")]
        [Validation(Required=true)]
        public string HexAddress { get; set; }

        // 版本信息
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

        // 接口信息
        [NameInMap("contract_interface")]
        [Validation(Required=true)]
        public ChainInsightContractInterface ContractInterface { get; set; }

        // 新的接口参数信息
        [NameInMap("interface_argument")]
        [Validation(Required=true)]
        public ChainInsightContractInterfaceArgument InterfaceArgument { get; set; }

    }

}
