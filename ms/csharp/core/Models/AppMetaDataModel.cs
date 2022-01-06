// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // paas应用元数据
    public class AppMetaDataModel : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用打开链接
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

    }

}
