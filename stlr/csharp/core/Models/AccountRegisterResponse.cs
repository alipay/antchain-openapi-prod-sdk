// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 账户开通返回
    public class AccountRegisterResponse : TeaModel {
        // 账户did
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

    }

}
