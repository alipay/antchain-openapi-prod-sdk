// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器应用服务版本信息。
    public class ContainerServiceRevision : TeaModel {
        // 应用信息。
        [NameInMap("app_info")]
        [Validation(Required=true)]
        public AppInfo AppInfo { get; set; }

        // 容器服务配置。
        [NameInMap("container_service_config")]
        [Validation(Required=true)]
        public ContainerServiceConfig ContainerServiceConfig { get; set; }

        // 容器服务服务名称。
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 容器服务发布信息
        [NameInMap("container_service_release_info")]
        [Validation(Required=false)]
        public ContainerServiceReleaseInfo ContainerServiceReleaseInfo { get; set; }

        // 创建时间。
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 发布状态。
        [NameInMap("deploy_status")]
        [Validation(Required=false)]
        public string DeployStatus { get; set; }

        // container service description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 关联的最近一次发布单。
        [NameInMap("last_plan_id")]
        [Validation(Required=false)]
        public string LastPlanId { get; set; }

        // 元数据状态。
        [NameInMap("meta_status")]
        [Validation(Required=false)]
        public string MetaStatus { get; set; }

        // 更新时间。
        [NameInMap("modified_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // 所属命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 版本提交人。
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 版本备注。
        [NameInMap("remarks")]
        [Validation(Required=false)]
        public string Remarks { get; set; }

        // 版本号。
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

    }

}
