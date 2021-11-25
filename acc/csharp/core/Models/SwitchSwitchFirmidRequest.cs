// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class SwitchSwitchFirmidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 企业id
        [NameInMap("firm_id")]
        [Validation(Required=true)]
        public long? FirmId { get; set; }

        // 登录sessionId
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
