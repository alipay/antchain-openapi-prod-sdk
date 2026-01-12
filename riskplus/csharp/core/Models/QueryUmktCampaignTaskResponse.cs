// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktCampaignTaskResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 圈投计划id
        [NameInMap("campaign_id")]
        [Validation(Required=false)]
        public long? CampaignId { get; set; }

        // 圈投任务列表
        [NameInMap("campaign_task_list")]
        [Validation(Required=false)]
        public List<UmktCampaignTaskInfo> CampaignTaskList { get; set; }

    }

}
