// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class PagequeryBaselineAppcontainersRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境ID
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名数组，没传则查询改产品下的所有参数
        [NameInMap("apps")]
        [Validation(Required=false)]
        public List<string> Apps { get; set; }

        // 部署单元实例id。默认值为default
        [NameInMap("deployment_unit_instance_identities")]
        [Validation(Required=false)]
        public List<string> DeploymentUnitInstanceIdentities { get; set; }

        // 页大小，默认每页12
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 第几页，默认返回第一页
        // 
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

    }

}
