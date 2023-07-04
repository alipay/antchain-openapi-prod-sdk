// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品部署初始化请求
    public class ProductDeployInitOptionRequest : TeaModel {
        // 站点code
        [NameInMap("site_code")]
        [Validation(Required=true)]
        public string SiteCode { get; set; }

        // 需要部署的产品实例元数据
        [NameInMap("product_instances")]
        [Validation(Required=true)]
        public List<ProductInstanceMeta> ProductInstances { get; set; }

    }

}
