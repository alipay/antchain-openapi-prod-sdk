// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryAgreementAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 小程序用户open_id
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 关联小程序appId
        [NameInMap("associated_app_id")]
        [Validation(Required=false)]
        public string AssociatedAppId { get; set; }

        // 关联的小程序用户openId
        [NameInMap("associated_open_id")]
        [Validation(Required=false)]
        public string AssociatedOpenId { get; set; }

    }

}
