// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class StartMypocketUserdidsignverifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签名
        [NameInMap("did_sign")]
        [Validation(Required=true)]
        public string DidSign { get; set; }

        // 签名原文
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

        // mychain did信息
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // epoch时间，毫秒
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
