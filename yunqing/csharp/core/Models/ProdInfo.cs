// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 巡检查询产品详情
    public class ProdInfo : TeaModel {
        // 应用实例信息
        [NameInMap("app_infos")]
        [Validation(Required=true)]
        public List<AppInfo> AppInfos { get; set; }

        // 产品名
        [NameInMap("prod_name")]
        [Validation(Required=true)]
        public string ProdName { get; set; }

        // prod version
        [NameInMap("prod_version")]
        [Validation(Required=true)]
        public string ProdVersion { get; set; }

    }

}
