// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器应用服务基础信息。
    public class ContainerServiceBasicInfo : TeaModel {
        // 镜像构建id。
        [NameInMap("app_build")]
        [Validation(Required=false)]
        public string AppBuild { get; set; }

        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 应用名称。
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 创建时间。
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 当前最新镜像。
        [NameInMap("current_image")]
        [Validation(Required=false)]
        public string CurrentImage { get; set; }

        // 发布中的版本。
        [NameInMap("deploying_revision")]
        [Validation(Required=false)]
        public string DeployingRevision { get; set; }

        // 发布部署状态。
        [NameInMap("deployment_status")]
        [Validation(Required=false)]
        public string DeploymentStatus { get; set; }

        // container service描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 当前应用服务草稿对应的版本号。
        [NameInMap("drafted_revision")]
        [Validation(Required=false)]
        public string DraftedRevision { get; set; }

        // 草稿更新时间。
        [NameInMap("drafted_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DraftedTime { get; set; }

        // 最近一次发布的版本。
        [NameInMap("last_deployed_revision")]
        [Validation(Required=false)]
        public string LastDeployedRevision { get; set; }

        // 最近一次发布的结束时间。
        [NameInMap("last_deploy_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastDeployEndTime { get; set; }

        // 最近一次关联的发布单。
        [NameInMap("last_deploy_plan_id")]
        [Validation(Required=false)]
        public string LastDeployPlanId { get; set; }

        // 最近一次发布的开始时间。
        [NameInMap("last_deploy_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastDeployStartTime { get; set; }

        // 容器服务元数据状态。
        [NameInMap("metadata_status")]
        [Validation(Required=true)]
        public string MetadataStatus { get; set; }

        // 创建时间。
        [NameInMap("modified_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // 容器应用服务名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 负责人。
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 容器服务的Pod列表。
        [NameInMap("pod_list")]
        [Validation(Required=true)]
        public List<PodInfo> PodList { get; set; }

        // 更新中pod数量
        [NameInMap("processing_count")]
        [Validation(Required=false)]
        public string ProcessingCount { get; set; }

        // replicas数量
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public string Replicas { get; set; }

        // runding pod数量
        [NameInMap("running_count")]
        [Validation(Required=false)]
        public string RunningCount { get; set; }

        // 运行时版本。
        [NameInMap("runtime_revision")]
        [Validation(Required=false)]
        public string RuntimeRevision { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 容器服务Service列表。
        [NameInMap("service_list")]
        [Validation(Required=false)]
        public List<LoadBalancerService> ServiceList { get; set; }

        // message信息
        [NameInMap("message_detail")]
        [Validation(Required=false)]
        public string MessageDetail { get; set; }

    }

}
