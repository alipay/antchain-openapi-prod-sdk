// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryOptestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // string
        [NameInMap("str")]
        [Validation(Required=true)]
        public string Str { get; set; }

        // long
        [NameInMap("lon")]
        [Validation(Required=true)]
        public long? Lon { get; set; }

        // arr_str
        [NameInMap("arr_str")]
        [Validation(Required=false)]
        public List<string> ArrStr { get; set; }

        // stru
        [NameInMap("stru")]
        [Validation(Required=false)]
        public Zone Stru { get; set; }

        // arr_stru
        [NameInMap("arr_stru")]
        [Validation(Required=false)]
        public List<VPC> ArrStru { get; set; }

    }

}
