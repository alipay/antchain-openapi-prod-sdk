// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDP.Models
{
    public class QuerybyappidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // appid
        [NameInMap("appid")]
        [Validation(Required=true)]
        public string Appid { get; set; }

        // 手机或者设备md5
        [NameInMap("userid")]
        [Validation(Required=true)]
        public string Userid { get; set; }

        // mobile/device
        [NameInMap("idtype")]
        [Validation(Required=true)]
        public string Idtype { get; set; }

    }

}
