// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAlarmhistorytypeRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public long? From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public long? To { get; set; }

    }

}
