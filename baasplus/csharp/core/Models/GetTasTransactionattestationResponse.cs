// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class GetTasTransactionattestationResponse : TeaModel {
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

        // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 精简后的时间戳完整编码（在校验时需要提交）
        [NameInMap("ctsr")]
        [Validation(Required=false)]
        public string Ctsr { get; set; }

        // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
        [NameInMap("ts")]
        [Validation(Required=false)]
        public string Ts { get; set; }

    }

}
