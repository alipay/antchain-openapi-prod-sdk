// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteDatabaseAccountRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // account id
        [NameInMap("account_sequence")]
        [Validation(Required=true)]
        public string AccountSequence { get; set; }

    }

}
