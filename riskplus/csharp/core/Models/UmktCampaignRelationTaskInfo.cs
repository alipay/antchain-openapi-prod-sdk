// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾半圈投返回节点关联任务信息
    public class UmktCampaignRelationTaskInfo : TeaModel {
        // 关联资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 任务状态
        // WFE-待执行
        // D - 已完成
        // ECN - 执行中
        // C - 取消
        // F - 执行失败
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

        // 错误信息
        [NameInMap("err_msg")]
        [Validation(Required=true)]
        public string ErrMsg { get; set; }

    }

}
