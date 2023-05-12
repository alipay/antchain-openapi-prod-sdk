// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // app and action view object
    public class AppActionVO : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 参与者名称数组
        [NameInMap("action_array")]
        [Validation(Required=true)]
        public List<string> ActionArray { get; set; }

    }

}
