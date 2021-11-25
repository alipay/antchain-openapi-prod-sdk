// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class AddContractDocumentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待签署文件
        [NameInMap("docs")]
        [Validation(Required=true)]
        public List<ContractDocument> Docs { get; set; }

        // 流程ID
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

    }

}
