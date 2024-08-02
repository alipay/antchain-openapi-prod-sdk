// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class BatchqueryScenedataTaskresultResponse : TeaModel {
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

        // 0-未开始
        // 1-可继续
        // 2-结束
        [NameInMap("sync_status")]
        [Validation(Required=false)]
        public string SyncStatus { get; set; }

        // 本次的最后一个游标，保存起来下一次使用
        [NameInMap("last_cursor")]
        [Validation(Required=false)]
        public string LastCursor { get; set; }

        // 结果列表
        [NameInMap("result_list")]
        [Validation(Required=false)]
        public List<BatchResult> ResultList { get; set; }

    }

}
