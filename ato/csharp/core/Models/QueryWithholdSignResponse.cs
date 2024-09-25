// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryWithholdSignResponse : TeaModel {
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

        // 协议当前状态
        // 1. UNSIGNED：未签约
        // 2. SIGNED：已签约；
        // 3. TERMINATED：已解约
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 协议签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignTime { get; set; }

        // 协议生效时间
        [NameInMap("valid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

        // 协议失效时间
        [NameInMap("invalid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvalidTime { get; set; }

        // 代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
        [NameInMap("sign_str_type")]
        [Validation(Required=false)]
        public string SignStrType { get; set; }

    }

}
