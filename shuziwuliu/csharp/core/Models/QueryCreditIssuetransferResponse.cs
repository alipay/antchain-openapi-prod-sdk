// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditIssuetransferResponse : TeaModel {
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

        // 错误信息
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 转让失败金额
        [NameInMap("fail_amt")]
        [Validation(Required=false)]
        public string FailAmt { get; set; }

        // 信用凭证号
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 请求时传入的全局业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 转入方分布式数字身份
        [NameInMap("payee_did")]
        [Validation(Required=false)]
        public string PayeeDid { get; set; }

        // 转出方分布式数字身份
        [NameInMap("payer_did")]
        [Validation(Required=false)]
        public string PayerDid { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 转让成功金额
        [NameInMap("success_amt")]
        [Validation(Required=false)]
        public string SuccessAmt { get; set; }

    }

}
