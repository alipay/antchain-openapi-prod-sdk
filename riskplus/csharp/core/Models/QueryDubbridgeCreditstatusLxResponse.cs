// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCreditstatusLxResponse : TeaModel {
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

        // 授信审核状态
        // 0. 授信成功
        // 1. 授信失败
        // 2. 授信中（重试查询）
        // 3. 查无此单（按1授信失败处理，订单轮询至下一资方）
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public long? AuditState { get; set; }

        // 业务错误码
        // 无异常=0 ，不同异常，返回不同的code
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public long? ErrorCode { get; set; }

        // 授信失败必填，描述具体的失败原因，用于运营分析
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 授信成功必填,授信成功后，资方的授信编号，后续用信/支用时用到
        [NameInMap("credit_no")]
        [Validation(Required=false)]
        public string CreditNo { get; set; }

        // 授信批准的额度，授信成功必填，单位:元
        [NameInMap("credit_amt")]
        [Validation(Required=false)]
        public long? CreditAmt { get; set; }

        // 授信生效日期，授信审核通过时必填，格式：yyyy-MM-dd
        [NameInMap("credit_valid_date")]
        [Validation(Required=false)]
        public string CreditValidDate { get; set; }

        // 授信失效日期，授信审核通过时必填，格式：yyyy-MM-dd  ,如果授信的当前日期大于
        // 等于失效日期,就认为失效
        [NameInMap("credit_expire_date")]
        [Validation(Required=false)]
        public string CreditExpireDate { get; set; }

    }

}
