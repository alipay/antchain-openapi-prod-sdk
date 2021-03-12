// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryBusinessContractencryptmethodRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约链所在地址
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

        // 用户的did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 输入参数
        [NameInMap("input_data")]
        [Validation(Required=true)]
        public string InputData { get; set; }

        // 查询方法名接口
        [NameInMap("method_signature")]
        [Validation(Required=true)]
        public string MethodSignature { get; set; }

    }

}
