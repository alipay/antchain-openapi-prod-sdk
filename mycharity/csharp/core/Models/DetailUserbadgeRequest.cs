// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class DetailUserbadgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 元徽章id
        [NameInMap("poap_meta_id")]
        [Validation(Required=true, MaxLength=100)]
        public string PoapMetaId { get; set; }

        // 支付宝用户id
        [NameInMap("alipay_user_id")]
        [Validation(Required=true, MaxLength=16)]
        public string AlipayUserId { get; set; }

    }

}
