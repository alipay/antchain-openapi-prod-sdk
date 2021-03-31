// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfPledgeResponse : TeaModel {
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

        // 账单id
        [NameInMap("bill_id")]
        [Validation(Required=false)]
        public string BillId { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=false)]
        public string FinancingSubjectDid { get; set; }

        // 已提交  COMMIT
        // 推送中 PUSHING
        // 推送成功 PUSH_SUC
        // 推送失败 PUSH_FAIL
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 状态描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
