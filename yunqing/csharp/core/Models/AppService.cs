// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // （已废弃，请使用AppServiceInfo）一个环境中部署的应用服务信息。
    public class AppService : TeaModel {
        // 应用英文名。
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 应用版本
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 部署单元名称，产品实例下唯一。
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public string DeployUnit { get; set; }

        // 部署域。
        [NameInMap("deploy_zone")]
        [Validation(Required=false)]
        public string DeployZone { get; set; }

        // 环境唯一标识
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 应用服务实例唯一标识。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用所属的产品的产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用类型：BUSINESS | JOB | CONTROLLER
        [NameInMap("app_type")]
        [Validation(Required=false)]
        public string AppType { get; set; }

    }

}
