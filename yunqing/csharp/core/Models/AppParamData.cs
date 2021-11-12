// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 包含应用启动参数的应用对象
    public class AppParamData : TeaModel {
        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用启动参数
        [NameInMap("app_params")]
        [Validation(Required=true)]
        public List<ParamData> AppParams { get; set; }

    }

}
