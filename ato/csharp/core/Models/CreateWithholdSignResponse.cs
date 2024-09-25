// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateWithholdSignResponse : TeaModel {
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

        // 签约字符串
        [NameInMap("sign_str")]
        [Validation(Required=false)]
        public string SignStr { get; set; }

        // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
        [NameInMap("sign_str_type")]
        [Validation(Required=false)]
        public string SignStrType { get; set; }

    }

}
