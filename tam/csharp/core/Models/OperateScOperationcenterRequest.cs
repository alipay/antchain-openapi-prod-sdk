// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    public class OperateScOperationcenterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 手机号/邮箱
        [NameInMap("receiver")]
        [Validation(Required=true)]
        public string Receiver { get; set; }

    }

}
