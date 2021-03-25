// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyContractReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署文件存档阶段存证核验信息
        [NameInMap("document_info")]
        [Validation(Required=false)]
        public List<ContractNotaryDocumentInfo> DocumentInfo { get; set; }

        // 签署结束阶段存证核验信息
        [NameInMap("finish_info")]
        [Validation(Required=true)]
        public ContractNotaryFinishInfo FinishInfo { get; set; }

        // 签署流程ID
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 签署发起阶段存证核验信息
        [NameInMap("init_info")]
        [Validation(Required=true)]
        public ContractNotaryInitInfo InitInfo { get; set; }

        // 签署过程阶段存证核验信息
        [NameInMap("sign_info")]
        [Validation(Required=true)]
        public List<ContractNotarySignInfo> SignInfo { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

    }

}
