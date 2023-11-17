// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // psi任务信息
    public class PsiJob : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 执行任务ID
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // 发起任务的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 任务提交时间（毫秒）
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 任务真正开始执行的unix 时间戳（毫秒）
        [NameInMap("gmt_exec_start")]
        [Validation(Required=true)]
        public long? GmtExecStart { get; set; }

        // 任务最终执行完成时间（毫秒）
        [NameInMap("gmt_exec_end")]
        [Validation(Required=true)]
        public long? GmtExecEnd { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 项目类型
        [NameInMap("project_type")]
        [Validation(Required=true)]
        public string ProjectType { get; set; }

        // 项目描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 任务执行结果信息，若执行失败则返回错误日志
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 参与方配置参数，参考结构体定义
        [NameInMap("participant_list")]
        [Validation(Required=true)]
        public List<PsiParticipantConfig> ParticipantList { get; set; }

    }

}
