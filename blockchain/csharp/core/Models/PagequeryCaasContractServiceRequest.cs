// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PagequeryCaasContractServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页码
        [NameInMap("num")]
        [Validation(Required=true)]
        public long? Num { get; set; }

        // 页大小
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 业务数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public ContractListReq Data { get; set; }

    }

}
