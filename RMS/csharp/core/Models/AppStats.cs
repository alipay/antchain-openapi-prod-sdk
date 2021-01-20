// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AppStats
    public class AppStats : TeaModel {
        // app_list
        [NameInMap("app_list")]
        [Validation(Required=false)]
        public List<string> AppList { get; set; }

        // page_query
        [NameInMap("page_query")]
        [Validation(Required=false)]
        public PageQuery PageQuery { get; set; }

    }

}
