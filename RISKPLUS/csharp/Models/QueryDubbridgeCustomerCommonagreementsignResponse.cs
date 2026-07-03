// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCustomerCommonagreementsignResponse : TeaModel {
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

        // 客户编号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 客户名称
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 流水号
        [NameInMap("trans_serials")]
        [Validation(Required=false)]
        public string TransSerials { get; set; }

        // 签约状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 签约用户唯一标识
        [NameInMap("account_user_id")]
        [Validation(Required=false)]
        public string AccountUserId { get; set; }

        // 脱敏的签约账号
        [NameInMap("account_no")]
        [Validation(Required=false)]
        public string AccountNo { get; set; }

        // 协议号
        [NameInMap("protocol_no")]
        [Validation(Required=false)]
        public string ProtocolNo { get; set; }

        // 协议签约时间
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

    }

}
