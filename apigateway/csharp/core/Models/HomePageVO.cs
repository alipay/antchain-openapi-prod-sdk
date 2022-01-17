// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // HomePageVO
    public class HomePageVO : TeaModel {
        // api分组数量
        [NameInMap("api_group_count")]
        [Validation(Required=false)]
        public long? ApiGroupCount { get; set; }

        // api数量
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // app数量
        [NameInMap("app_count")]
        [Validation(Required=false)]
        public long? AppCount { get; set; }

    }

}
