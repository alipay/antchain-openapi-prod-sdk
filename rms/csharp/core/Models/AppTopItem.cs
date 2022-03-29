// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 应用TopN信息
    public class AppTopItem : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用TopN统计值，有可能有小数，使用前转换为数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
