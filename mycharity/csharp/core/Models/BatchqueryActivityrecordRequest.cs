// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class BatchqueryActivityrecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 元徽章id
        [NameInMap("poap_meta_id")]
        [Validation(Required=false)]
        public string PoapMetaId { get; set; }

        // 支付宝用户UID 
        [NameInMap("alipay_user_id")]
        [Validation(Required=false)]
        public string AlipayUserId { get; set; }

    }

}
