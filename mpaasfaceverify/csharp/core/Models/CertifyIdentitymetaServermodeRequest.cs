// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MPAASFACEVERIFY.Models
{
    public class CertifyIdentitymetaServermodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保...
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 用户身份信息
        // 
        [NameInMap("identity_param")]
        [Validation(Required=true)]
        public string IdentityParam { get; set; }

        // 计费规则码
        // 
        [NameInMap("charge_code")]
        [Validation(Required=true)]
        public string ChargeCode { get; set; }

        // operation_type
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 预留扩展业务参数
        // 
        [NameInMap("extern_param")]
        [Validation(Required=true)]
        public string ExternParam { get; set; }

    }

}
