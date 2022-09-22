// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器应用服务部署
    public class ContainerServiceDeployment : TeaModel {
        // 容器服务名称。
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 容器服务版本号。
        [NameInMap("container_service_revision")]
        [Validation(Required=true)]
        public string ContainerServiceRevision { get; set; }

        // 依赖的容器应用服务名称。
        [NameInMap("depend_container_service_names")]
        [Validation(Required=true)]
        public List<string> DependContainerServiceNames { get; set; }

        // 限定需要发布的部署单元
        [NameInMap("restricted_cells")]
        [Validation(Required=false)]
        public List<string> RestrictedCells { get; set; }

        // 自定义发布批次
        [NameInMap("batches")]
        [Validation(Required=false)]
        public List<ReleaseBatchObj> Batches { get; set; }

        // 默认ByIndex
        [NameInMap("upgrade_policy")]
        [Validation(Required=false)]
        public string UpgradePolicy { get; set; }

        // 发布模板名称
        [NameInMap("deployment_template_name")]
        [Validation(Required=false)]
        public string DeploymentTemplateName { get; set; }

        // 发布模板卡点规则
        [NameInMap("deployment_template_hooks")]
        [Validation(Required=false)]
        public List<CustomHook> DeploymentTemplateHooks { get; set; }

    }

}
