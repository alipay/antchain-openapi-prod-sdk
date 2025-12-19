// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 权益智能体会话对象
    public class AgentSessionData : TeaModel {
        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 会话标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public string GmtCreated { get; set; }

        // VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 任务列表
        [NameInMap("task_list")]
        [Validation(Required=false)]
        public List<AgentTaskData> TaskList { get; set; }

    }

}
