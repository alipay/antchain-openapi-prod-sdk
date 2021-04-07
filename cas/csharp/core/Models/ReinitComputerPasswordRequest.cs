// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ReinitComputerPasswordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // computer_sequence
        [NameInMap("computer_sequence")]
        [Validation(Required=true)]
        public string ComputerSequence { get; set; }

        // 密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

    }

}
