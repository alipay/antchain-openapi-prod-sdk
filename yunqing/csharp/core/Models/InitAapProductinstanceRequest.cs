// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class InitAapProductinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 命名空间，命名格式：siteCode-prodCode （小写）
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 产品实例名称，推荐产品code的小写字母
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品code
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=true)]
        public string ProdVersion { get; set; }

        // 产品部署的拓扑名称，部署时会根据该信息进行部署
        [NameInMap("topology_code")]
        [Validation(Required=true)]
        public string TopologyCode { get; set; }

        // 站点code
        [NameInMap("site_code")]
        [Validation(Required=true)]
        public string SiteCode { get; set; }

    }

}
