// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyPfFinancingqualificationResponse : TeaModel {
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

        // 申请流水号
        [NameInMap("apl_seq_no")]
        [Validation(Required=false)]
        public string AplSeqNo { get; set; }

        // 受理标志
        // 0-受理失败
        // 1-受理成功
        [NameInMap("acceptance_flag")]
        [Validation(Required=false)]
        public string AcceptanceFlag { get; set; }

    }

}
