// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCreditamtLxResponse : TeaModel {
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

        // 返回描述信息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 查询状态，0. 查询成功
        // 1. 查询失败---表示“拒绝”的有效终态，下一步重新调用授信申请接口
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 剩余可用额度,授信成功必填,单位:元
        [NameInMap("credit_remain_amt")]
        [Validation(Required=false)]
        public string CreditRemainAmt { get; set; }

        // 授信批准的额度，授信成功必填,单位:元
        [NameInMap("credit_amt")]
        [Validation(Required=false)]
        public string CreditAmt { get; set; }

        // 授信生效日期，授信审核通过时必填,格式：yyyy-MM-dd
        [NameInMap("credit_valid_date")]
        [Validation(Required=false)]
        public string CreditValidDate { get; set; }

        // 授信失效日期，授信审核通过时必填,格式：yyyy-MM-dd  
        [NameInMap("credit_expire_date")]
        [Validation(Required=false)]
        public string CreditExpireDate { get; set; }

    }

}
