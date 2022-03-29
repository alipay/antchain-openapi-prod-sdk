// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // dashboard
    public class XDashboardCRULResponseCURequest : TeaModel {
        // API版本
        [NameInMap("api_version")]
        [Validation(Required=false)]
        public string ApiVersion { get; set; }

        // Dashboard元数据信息
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public XResource Metadata { get; set; }

        // Dashboard配置JSON字符串。
        // Dashboard目录不需要填写
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

    }

}
