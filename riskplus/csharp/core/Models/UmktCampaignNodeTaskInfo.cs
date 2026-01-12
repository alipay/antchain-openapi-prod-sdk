// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾半圈投节点任务信息
    public class UmktCampaignNodeTaskInfo : TeaModel {
        // 节点id
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点任务状态
        [NameInMap("node_task_status")]
        [Validation(Required=true)]
        public string NodeTaskStatus { get; set; }

        // 节点任务执行日期 yyyy-MM-dd格式
        [NameInMap("exec_date")]
        [Validation(Required=true)]
        public string ExecDate { get; set; }

        // 节点任务关联资源任务列表
        [NameInMap("rel_task_list")]
        [Validation(Required=true)]
        public List<UmktCampaignRelationTaskInfo> RelTaskList { get; set; }

    }

}
