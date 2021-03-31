// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateCreditIssuefinanceResponse : TeaModel {
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

        // 融资申请失败，回转至无车承运平台金额
        [NameInMap("fail_apply_amt")]
        [Validation(Required=false)]
        public string FailApplyAmt { get; set; }

        // 请求时传入的全局业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 融资申请成功金额
        [NameInMap("success_apply_amt")]
        [Validation(Required=false)]
        public string SuccessApplyAmt { get; set; }

    }

}
