// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 实时营销人群
    public class RealtimeMktAudience : TeaModel {
        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
