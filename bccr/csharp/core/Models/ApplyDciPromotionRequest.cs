// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class ApplyDciPromotionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人电话
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // dci ID
        [NameInMap("dci_content_id")]
        [Validation(Required=true)]
        public string DciContentId { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 推广渠道
        [NameInMap("promotion_way")]
        [Validation(Required=true)]
        public string PromotionWay { get; set; }

    }

}
