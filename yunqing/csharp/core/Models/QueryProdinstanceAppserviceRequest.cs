// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class QueryProdinstanceAppserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 部署单元。
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public string DeployUnit { get; set; }

        // 部署域。当前版本暂不支持。
        [NameInMap("deploy_zone")]
        [Validation(Required=false)]
        public string DeployZone { get; set; }

        // 环境唯一标识。
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 当前页码，默认为1。
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认10，最大100。
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 产品码。
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 产品分组。如果入参设置了产品码，则默认忽略产品分组。
        [NameInMap("product_group")]
        [Validation(Required=false)]
        public string ProductGroup { get; set; }

        // 产品码--应用名
        [NameInMap("product_app")]
        [Validation(Required=false)]
        public string ProductApp { get; set; }

        // 租户信息当前值为mock
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
