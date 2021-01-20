// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // Operator
    public class Operator : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // login_name
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // email
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // nick_name
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

    }

}
