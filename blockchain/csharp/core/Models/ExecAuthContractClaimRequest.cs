// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecAuthContractClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务流水唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合约方法名称
        [NameInMap("function_name")]
        [Validation(Required=true)]
        public string FunctionName { get; set; }

        // 合约入参类型，和 arguments对应， 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT； 默认为String
        [NameInMap("arguments")]
        [Validation(Required=false)]
        public List<string> Arguments { get; set; }

        // 保留参数，选填，目前暂未用到，合约入参类型，和 arguments对应 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT；
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

    }

}
