// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class InitSolutionBmsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 账户名称
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 合约ID
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合约临时url
        [NameInMap("contract_url")]
        [Validation(Required=true)]
        public string ContractUrl { get; set; }

    }

}
