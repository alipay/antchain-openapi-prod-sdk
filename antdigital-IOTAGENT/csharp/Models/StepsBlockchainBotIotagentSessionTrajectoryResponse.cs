// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StepsBlockchainBotIotagentSessionTrajectoryResponse : TeaModel {
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

        // 执行步骤列表(JSON)
        [NameInMap("steps_json")]
        [Validation(Required=false)]
        public string StepsJson { get; set; }

        // 下一页游标
        [NameInMap("next_cursor")]
        [Validation(Required=false)]
        public string NextCursor { get; set; }

        // 总步骤数
        [NameInMap("total_steps")]
        [Validation(Required=false)]
        public long? TotalSteps { get; set; }

    }

}
