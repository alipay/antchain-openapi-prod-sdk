// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCutpaymentOneclickResponse : TeaModel {
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

        // 签约协议号
        [NameInMap("protocol_no")]
        [Validation(Required=false)]
        public string ProtocolNo { get; set; }

        // 银行卡识别码
        [NameInMap("sgn_acc")]
        [Validation(Required=false)]
        public string SgnAcc { get; set; }

        // 账户信息
        [NameInMap("acc_info")]
        [Validation(Required=false)]
        public AccInfo AccInfo { get; set; }

        // 银行编号
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

    }

}
