// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class CreateApiAuthurlResponse : TeaModel {
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

        // 短链接地址
        [NameInMap("login_url")]
        [Validation(Required=false)]
        public string LoginUrl { get; set; }

        // 蚂蚁生成的订单号，此次授权的唯一标识
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

    }

}
