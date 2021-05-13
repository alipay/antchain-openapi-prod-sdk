// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class ExecContractServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用did
        [NameInMap("app_did")]
        [Validation(Required=true, MaxLength=128)]
        public string AppDid { get; set; }

        // 合约方法名
        [NameInMap("contract_method")]
        [Validation(Required=true, MaxLength=128)]
        public string ContractMethod { get; set; }

        // 合约名称，当一个应用有多个合约时需要传入
        [NameInMap("contract_name")]
        [Validation(Required=false, MaxLength=128)]
        public string ContractName { get; set; }

        // 1.同步交易，2.异步交易，3.Local
        // 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
        [NameInMap("exec_type")]
        [Validation(Required=false)]
        public long? ExecType { get; set; }

        // 合约入参（格式为json）
        [NameInMap("request_body")]
        [Validation(Required=true, MaxLength=1024)]
        public string RequestBody { get; set; }

    }

}
