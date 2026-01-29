// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SignFundFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 合同待签署url
        [NameInMap("sign_doc_url")]
        [Validation(Required=false)]
        public string SignDocUrl { get; set; }

        // 签署状态 SIGNED-已签署 UNDO-作废
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 签约id
        [NameInMap("sign_no")]
        [Validation(Required=true)]
        public string SignNo { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 文件名 非必填，sign_doc_url传了，此字段必传
        [NameInMap("contract_name")]
        [Validation(Required=false)]
        public string ContractName { get; set; }

    }

}
