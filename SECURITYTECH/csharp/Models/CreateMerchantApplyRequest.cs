// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class CreateMerchantApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 统一社会信用代码
        [NameInMap("usci")]
        [Validation(Required=true)]
        public string Usci { get; set; }

        // 行业类型
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 二级类目
        [NameInMap("sub_category")]
        [Validation(Required=true)]
        public string SubCategory { get; set; }

        // 入驻场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 商户信息
        [NameInMap("merchant_info")]
        [Validation(Required=true)]
        public MaoMerchantInfo MerchantInfo { get; set; }

    }

}
