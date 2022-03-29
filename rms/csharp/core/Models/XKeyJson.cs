// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XKeyJson : TeaModel {
        //  
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // json string
        [NameInMap("json")]
        [Validation(Required=true)]
        public string Json { get; set; }

    }

}
