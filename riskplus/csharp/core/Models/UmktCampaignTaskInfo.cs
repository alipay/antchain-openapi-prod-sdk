// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾圈投任务信息
    public class UmktCampaignTaskInfo : TeaModel {
        // 任务唯一id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 圈投任务执行日期，yyyy-MM-dd格式
        [NameInMap("exec_date")]
        [Validation(Required=true)]
        public string ExecDate { get; set; }

        // 圈投任务执行批次
        [NameInMap("exec_batch")]
        [Validation(Required=true)]
        public string ExecBatch { get; set; }

        // 圈投任务状态
        [NameInMap("campaign_task_status")]
        [Validation(Required=true)]
        public string CampaignTaskStatus { get; set; }

        // 节点任务列表
        [NameInMap("node_task_list")]
        [Validation(Required=true)]
        public UmktCampaignNodeTaskInfo NodeTaskList { get; set; }

    }

}
