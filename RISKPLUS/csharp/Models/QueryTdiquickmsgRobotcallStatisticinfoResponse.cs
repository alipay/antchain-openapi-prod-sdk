// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryTdiquickmsgRobotcallStatisticinfoResponse : TeaModel {
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

        // 全量手机号数量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 累计拨打次数
        [NameInMap("call_count")]
        [Validation(Required=false)]
        public long? CallCount { get; set; }

        // 已经拨打的手机号数量
        [NameInMap("callee_count")]
        [Validation(Required=false)]
        public string CalleeCount { get; set; }

        // 已拨打次数中接通的数量
        [NameInMap("connect_count")]
        [Validation(Required=false)]
        public long? ConnectCount { get; set; }

        // 拨打率
        [NameInMap("call_rate")]
        [Validation(Required=false)]
        public string CallRate { get; set; }

        // 接通率
        [NameInMap("connect_rate")]
        [Validation(Required=false)]
        public string ConnectRate { get; set; }

    }

}
