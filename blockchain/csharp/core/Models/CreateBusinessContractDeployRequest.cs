// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessContractDeployRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链对应的bizId
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 合约代码
        [NameInMap("contract_code")]
        [Validation(Required=true)]
        public string ContractCode { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合约类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public long? ContractType { get; set; }

        // 合约部署者did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 构造函数传入参数
        [NameInMap("input_data")]
        [Validation(Required=false)]
        public string InputData { get; set; }

    }

}
