// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用服务实例详情。
    public class AppServiceInfo : TeaModel {
        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 应用版本
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 所属单元ID
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

        // 容器列表。
        [NameInMap("containers")]
        [Validation(Required=false)]
        public List<Container> Containers { get; set; }

        // 部署单元名称，产品实例下唯一。
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public string DeployUnit { get; set; }

        // 环境唯一标识。
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 应用服务实例唯一标识。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 所属产品分组唯一标识。
        [NameInMap("product_group_identity")]
        [Validation(Required=false)]
        public string ProductGroupIdentity { get; set; }

        // 所属产品分组名称。
        [NameInMap("product_group_name")]
        [Validation(Required=false)]
        public string ProductGroupName { get; set; }

        // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
