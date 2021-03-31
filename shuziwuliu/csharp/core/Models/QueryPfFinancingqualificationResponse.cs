// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfFinancingqualificationResponse : TeaModel {
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

        // 请求号
        [NameInMap("apl_seq_no")]
        [Validation(Required=false)]
        public string AplSeqNo { get; set; }

        // 申请日期
        [NameInMap("app_date")]
        [Validation(Required=false)]
        public string AppDate { get; set; }

        // 审批通过时间
        // 
        // 
        [NameInMap("approve_date")]
        [Validation(Required=false)]
        public string ApproveDate { get; set; }

        // 额度协议文件编号
        // 
        // 
        [NameInMap("amnt_agrmnt_fn")]
        [Validation(Required=false)]
        public string AmntAgrmntFn { get; set; }

        // 处理状态
        // A01-审批中
        // A02-审批失败
        // A03-审批通过
        // A04-审批作废
        [NameInMap("proce_status")]
        [Validation(Required=false)]
        public string ProceStatus { get; set; }

        // 失败原因
        [NameInMap("fail_rslt")]
        [Validation(Required=false)]
        public string FailRslt { get; set; }

        // 错误码
        [NameInMap("gen_reason")]
        [Validation(Required=false)]
        public string GenReason { get; set; }

    }

}
