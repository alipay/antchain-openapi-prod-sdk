// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class OpenCreditDriverResponse : TeaModel {
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

        // 签署开通申请id
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

        // 协议签署开通url
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

        // 签署状态
        // -1:签署开通失败, 0:未签署开通, 1:已签署开通
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
