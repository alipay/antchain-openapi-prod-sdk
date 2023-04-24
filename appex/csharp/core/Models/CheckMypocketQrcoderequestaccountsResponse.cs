// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CheckMypocketQrcoderequestaccountsResponse : TeaModel {
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

        // 小程序码唯一标识
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 外部业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 小程序码状态，枚举，IDLE|SCANNED|CONFIRMED|CANCELLED|UNKNOWN
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 账户列表
        [NameInMap("accounts")]
        [Validation(Required=false)]
        public List<ChainAccountEX> Accounts { get; set; }

    }

}
