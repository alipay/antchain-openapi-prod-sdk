// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class NotifyPartnerAsyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ZHONGYI
        [NameInMap("partner_id")]
        [Validation(Required=true)]
        public string PartnerId { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 通知内容	
        // 
        [NameInMap("notify_content")]
        [Validation(Required=true)]
        public string NotifyContent { get; set; }

    }

}
