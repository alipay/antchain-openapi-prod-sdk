// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // code,name
    public class CodeListView : TeaModel {
        // 数据code
        [NameInMap("data_code")]
        [Validation(Required=true)]
        public string DataCode { get; set; }

        // 数据名称
        [NameInMap("data_name")]
        [Validation(Required=true)]
        public string DataName { get; set; }

    }

}
