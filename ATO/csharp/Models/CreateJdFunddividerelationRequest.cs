// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateJdFunddividerelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被分账方商户公司社会统一信用代码
        [NameInMap("subject_merchant_id")]
        [Validation(Required=true)]
        public string SubjectMerchantId { get; set; }

        // 分账方租户8位id
        [NameInMap("divide_tenant_id")]
        [Validation(Required=true)]
        public string DivideTenantId { get; set; }

        // 分账公司社会信用代码
        [NameInMap("divide_merchant_id")]
        [Validation(Required=true)]
        public string DivideMerchantId { get; set; }

        // 分账合同或协议
        [NameInMap("contract_files")]
        [Validation(Required=false)]
        public List<FileInfo> ContractFiles { get; set; }

        // 分账关系说明
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 关系id
        [NameInMap("relation_id")]
        [Validation(Required=false)]
        public string RelationId { get; set; }

        // 进件模式：DIRECT（直连进件），AGENT（代理进件）
        [NameInMap("expand_mode")]
        [Validation(Required=false)]
        public string ExpandMode { get; set; }

    }

}
