// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryInsuranceYzbreportResponse : TeaModel {
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

        // 报案号
        [NameInMap("report_no")]
        [Validation(Required=false)]
        public string ReportNo { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 赔案号
        [NameInMap("claim_no")]
        [Validation(Required=false)]
        public string ClaimNo { get; set; }

        // 报案时间，格式yyyy-mm-dd hh:mm:ss
        [NameInMap("report_req_time")]
        [Validation(Required=false)]
        public string ReportReqTime { get; set; }

        // 案件状态，已报案，已结案，已赔付
        [NameInMap("report_status")]
        [Validation(Required=false)]
        public string ReportStatus { get; set; }

        // 案件赔付金额，单位元，两位小数;
        [NameInMap("report_paid_amount")]
        [Validation(Required=false)]
        public string ReportPaidAmount { get; set; }

        // 险种名称
        [NameInMap("external_product_name")]
        [Validation(Required=false)]
        public string ExternalProductName { get; set; }

        // 结案时间，格式yyyy-mm-dd hh:mm:ss
        [NameInMap("report_end_time")]
        [Validation(Required=false)]
        public string ReportEndTime { get; set; }

        // 案件赔付结论，1-赔付 2-零结 3-商业险拒赔 4-整案拒赔 5-注销
        [NameInMap("report_paid_desc")]
        [Validation(Required=false)]
        public string ReportPaidDesc { get; set; }

        // 案件赔付时间，格式yyyy-mm-dd hh:mm:ss
        // 
        [NameInMap("report_paid_time")]
        [Validation(Required=false)]
        public string ReportPaidTime { get; set; }

        // 案件结论描述
        [NameInMap("report_verdict_desc")]
        [Validation(Required=false)]
        public string ReportVerdictDesc { get; set; }

        // 收款账户名称
        [NameInMap("receiver_account_name")]
        [Validation(Required=false)]
        public string ReceiverAccountName { get; set; }

        // 收款账户类型 ,1-支付宝，2-银行卡
        [NameInMap("receiver_account_type")]
        [Validation(Required=false)]
        public string ReceiverAccountType { get; set; }

        // 收款人账户
        [NameInMap("receiver_account")]
        [Validation(Required=false)]
        public string ReceiverAccount { get; set; }

    }

}
