// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepaymentLxResponse : TeaModel {
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

        // 业务返回码，001 请求成功 002 请求失败
        [NameInMap("ccode")]
        [Validation(Required=false)]
        public string Ccode { get; set; }

        // 业务返回描述
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 业务数据
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public long? BizContent { get; set; }

        // 响应时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

        // 签名数据
        [NameInMap("sign")]
        [Validation(Required=false)]
        public string Sign { get; set; }

    }

}
