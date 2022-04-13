// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用摘要信息
    public class AppSimpleInfo : TeaModel {
        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 应用分组名字
        [NameInMap("app_instance_group_name")]
        [Validation(Required=true)]
        public string AppInstanceGroupName { get; set; }

        // 应用名字
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 执行者
        [NameInMap("executor")]
        [Validation(Required=true)]
        public string Executor { get; set; }

        // 结束时间
        [NameInMap("finish_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishTime { get; set; }

        // 分组个数
        [NameInMap("group_num")]
        [Validation(Required=true)]
        public long? GroupNum { get; set; }

        // 分组策略
        [NameInMap("group_strategy")]
        [Validation(Required=true)]
        public string GroupStrategy { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 操作类型
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 发布版本号
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        // 回滚revision
        [NameInMap("rollback_revision")]
        [Validation(Required=false)]
        public string RollbackRevision { get; set; }

        // 是否可单独执行
        [NameInMap("standalone_executable")]
        [Validation(Required=true)]
        public bool? StandaloneExecutable { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 应用状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // Pod 数量
        [NameInMap("pod_count")]
        [Validation(Required=false)]
        public long? PodCount { get; set; }

        // 回滚原因
        [NameInMap("rollback_reason")]
        [Validation(Required=false)]
        public string RollbackReason { get; set; }

        // 依赖的应用服务名
        [NameInMap("depend_container_service_names")]
        [Validation(Required=false)]
        public List<string> DependContainerServiceNames { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 发布模板名称
        [NameInMap("deployment_template_name")]
        [Validation(Required=false)]
        public string DeploymentTemplateName { get; set; }

    }

}
