// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链路由字段，如：copyright、judicatory、contract
        [NameInMap("chain")]
        [Validation(Required=true)]
        public string Chain { get; set; }

        // 是否跨链，目前仅支持跨链：true
        [NameInMap("cross_chain")]
        [Validation(Required=true)]
        public bool? CrossChain { get; set; }

        // 业务合约id，当crossChain为false时，该字段必填
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 业务合约方法名称，当crossChain为false时，该字段必填
        [NameInMap("contract_method")]
        [Validation(Required=false)]
        public string ContractMethod { get; set; }

        // 业务合约方法入参，当crossChain为false时，该字段必填
        [NameInMap("contract_param")]
        [Validation(Required=false)]
        public string ContractParam { get; set; }

        // 业务合约方法的返回值类型
        [NameInMap("contract_out_types")]
        [Validation(Required=false)]
        public string ContractOutTypes { get; set; }

        // 跨链的业务合约的contractId，contractMethod，contractParam，contractOutTypes的JSON组合。当crossChain为true时，该字段必填。
        [NameInMap("cross_param")]
        [Validation(Required=false)]
        public string CrossParam { get; set; }

        // 是否本地执行
        [NameInMap("local")]
        [Validation(Required=false)]
        public bool? Local { get; set; }

        // 链上账户名称
        [NameInMap("contract_account")]
        [Validation(Required=false)]
        public string ContractAccount { get; set; }

        // 业务订单id
        [NameInMap("biz_order_id")]
        [Validation(Required=true)]
        public string BizOrderId { get; set; }

    }

}
