// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessContractencryptcallRequest : TeaModel {
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

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合约类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public long? ContractType { get; set; }

        // 具体数据的定义，加密在服务端，需传入原始值、类型及key等相关信息
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ContractEncryptKeyItem> Data { get; set; }

        // 调用合约者用户身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 合约方法名
        [NameInMap("method_signature")]
        [Validation(Required=true)]
        public string MethodSignature { get; set; }

        // 返回值类型
        [NameInMap("output_type")]
        [Validation(Required=true)]
        public string OutputType { get; set; }

    }

}
