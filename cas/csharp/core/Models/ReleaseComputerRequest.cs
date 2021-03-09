// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ReleaseComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 需要释放的 computer ids
        [NameInMap("computer_sequences")]
        [Validation(Required=true)]
        public List<string> ComputerSequences { get; set; }

    }

}
