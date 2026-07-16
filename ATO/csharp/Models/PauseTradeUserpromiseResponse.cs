// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PauseTradeUserpromiseResponse : TeaModel {
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

        // 暂停后自动重启时间
        [NameInMap("auto_resume_day")]
        [Validation(Required=false)]
        public string AutoResumeDay { get; set; }

        // 暂停后自动执行代扣时间，为autoResumeDay的第二天重新开始执行代扣计划
        [NameInMap("auto_withhold_restart_day")]
        [Validation(Required=false)]
        public string AutoWithholdRestartDay { get; set; }

    }

}
