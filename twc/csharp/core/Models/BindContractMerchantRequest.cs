// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class BindContractMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户ID
        [NameInMap("smid")]
        [Validation(Required=true)]
        public string Smid { get; set; }

        // 商户证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 代理用户id，不填默认挂接平台方
        [NameInMap("agent_account_id")]
        [Validation(Required=false)]
        public string AgentAccountId { get; set; }

    }

}
