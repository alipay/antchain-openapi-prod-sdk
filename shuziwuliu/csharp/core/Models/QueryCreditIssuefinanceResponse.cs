// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditIssuefinanceResponse : TeaModel {
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

        // 融资失败，回转至无车承运平台失败金额
        [NameInMap("fail_amt")]
        [Validation(Required=false)]
        public string FailAmt { get; set; }

        // 融资失败，回转至无车承运平台成功金额
        [NameInMap("fail_transfer_amt")]
        [Validation(Required=false)]
        public string FailTransferAmt { get; set; }

        // 请求时传入的全局业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入 
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 融资成功金额
        [NameInMap("success_amt")]
        [Validation(Required=false)]
        public string SuccessAmt { get; set; }

    }

}
