// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class AuthIcmEnterpriseResponse : TeaModel {
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

        // 是否授权成功true是，false否
        // 
        [NameInMap("auth_success")]
        [Validation(Required=false)]
        public bool? AuthSuccess { get; set; }

        // 授权订单订单号
        // 
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 过期时间，unix时间戳 毫秒
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // unix时间戳 毫秒
        [NameInMap("auth_time")]
        [Validation(Required=false)]
        public long? AuthTime { get; set; }

    }

}
