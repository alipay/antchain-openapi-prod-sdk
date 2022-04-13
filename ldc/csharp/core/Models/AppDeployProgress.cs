// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用发布进度
    public class AppDeployProgress : TeaModel {
        // 应用发布所需要组件列表
        [NameInMap("component_list")]
        [Validation(Required=true)]
        public List<string> ComponentList { get; set; }

        // 应用发布分组列表
        [NameInMap("execute_groups")]
        [Validation(Required=true)]
        public List<AppDeployGroup> ExecuteGroups { get; set; }

        // 结束时间
        [NameInMap("finish_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishTime { get; set; }

        // service id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 当前应用是否是一个回滚的应用
        [NameInMap("is_roll_back")]
        [Validation(Required=true)]
        public bool? IsRollBack { get; set; }

        // 发布进度pod状态统计数据
        [NameInMap("pod_state_summary")]
        [Validation(Required=true)]
        public AppDeployPodStateSummary PodStateSummary { get; set; }

        // 后置任务列表
        [NameInMap("post_tasks")]
        [Validation(Required=true)]
        public List<AppDeployTask> PostTasks { get; set; }

        // 前置任务列表
        [NameInMap("pre_tasks")]
        [Validation(Required=true)]
        public List<AppDeployTask> PreTasks { get; set; }

        // 当前服务关联的一个回滚服务的id，如果该值不为空则表示当前服务被回滚过
        [NameInMap("roll_back_service_id")]
        [Validation(Required=false)]
        public string RollBackServiceId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 当前发布状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 容器服务命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // task id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 操作code
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

    }

}
