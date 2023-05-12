// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // DsName & DsNameFormat
    public class DsNameInfo : TeaModel {
        // ds_name
        [NameInMap("ds_name")]
        [Validation(Required=true)]
        public string DsName { get; set; }

        // ds_name_format
        [NameInMap("ds_name_format")]
        [Validation(Required=true)]
        public string DsNameFormat { get; set; }

    }

}
