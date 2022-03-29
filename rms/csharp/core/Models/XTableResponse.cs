// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // x
    public class XTableResponse : TeaModel {
        //  
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

        //  
        [NameInMap("result")]
        [Validation(Required=true)]
        public List<XTableData> Result { get; set; }

    }

}
