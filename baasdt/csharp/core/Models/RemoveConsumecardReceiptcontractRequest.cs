// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class RemoveConsumecardReceiptcontractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础信息对象
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 合同编号，纯数字
        [NameInMap("contract_number")]
        [Validation(Required=true)]
        public string ContractNumber { get; set; }

    }

}
