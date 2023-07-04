// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品部署初始化配置
    public class ProductDeployInitOption : TeaModel {
        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 产品实例名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品code
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 站点code
        [NameInMap("site_code")]
        [Validation(Required=true)]
        public string SiteCode { get; set; }

        // 多个产品实例时，本产品的发布顺序
        [NameInMap("release_order")]
        [Validation(Required=true)]
        public long? ReleaseOrder { get; set; }

        // 产品内应用分部署配置
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<AppDeployInitOption> Apps { get; set; }

    }

}
