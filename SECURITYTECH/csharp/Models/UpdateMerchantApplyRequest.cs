// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UpdateMerchantApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户号
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 社会统代
        [NameInMap("usci")]
        [Validation(Required=false)]
        public string Usci { get; set; }

        // 行业类型
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 入驻场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 商户信息
        [NameInMap("modify_fields")]
        [Validation(Required=true)]
        public MaoMerchantInfo ModifyFields { get; set; }

    }

}
