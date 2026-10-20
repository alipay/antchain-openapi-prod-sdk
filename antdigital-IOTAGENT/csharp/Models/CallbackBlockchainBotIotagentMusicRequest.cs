// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CallbackBlockchainBotIotagentMusicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云音乐授权码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 云音乐CSRF状态码
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

    }

}
