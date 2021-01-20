// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsPathRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // requests
        [NameInMap("requests")]
        [Validation(Required=false)]
        public List<FolderRequestCmd> Requests { get; set; }

    }

}
