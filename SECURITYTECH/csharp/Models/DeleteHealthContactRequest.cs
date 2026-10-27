// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class DeleteHealthContactRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联系人业务id
        [NameInMap("contanct_id")]
        [Validation(Required=true)]
        public string ContanctId { get; set; }

        // 品牌方渠道标识
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

    }

}
