// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    //  应用基线数据
    public class AppInstance : TeaModel {
        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用版本
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        // 应用镜像名
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 应用基线状态：ACTIVE、FAILED、UPGRADING
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=false)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署单元实例id
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=false)]
        public string DeploymentUnitInstanceIdentity { get; set; }

        // 应用期望实例数
        [NameInMap("expect_replica")]
        [Validation(Required=true)]
        public string ExpectReplica { get; set; }

    }

}
