// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsNotifyhistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=true)]
        public long? From { get; set; }

        // login_name
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public long? To { get; set; }

    }

}
