// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseUserperformanceResponse : TeaModel {
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

        // 链上不存在该订单，该订单存在链上，但未获取链上融资，全部履约，累积逾期次数
        [NameInMap("result_message")]
        [Validation(Required=false)]
        public string ResultMessage { get; set; }

        // 预期次数
        [NameInMap("response_data")]
        [Validation(Required=false)]
        public string ResponseData { get; set; }

    }

}
