// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyPfConfirmationResponse : TeaModel {
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

        // 融资提款确认书 hash	
        // 
        [NameInMap("confirmation_hash")]
        [Validation(Required=false)]
        public string ConfirmationHash { get; set; }

        // 融资提款确认书 OSSkey
        // 
        // 
        [NameInMap("confirmation_oss_key")]
        [Validation(Required=false)]
        public string ConfirmationOssKey { get; set; }

        // 贷款起始日期，格式：yyyyMMdd	
        // 
        // 
        [NameInMap("loan_start_time")]
        [Validation(Required=false)]
        public string LoanStartTime { get; set; }

        // 贷款到期日期，格式：yyyyMMdd	
        // 
        // 
        [NameInMap("loan_end_time")]
        [Validation(Required=false)]
        public string LoanEndTime { get; set; }

        // 还款方式
        // 
        // 
        [NameInMap("repayment")]
        [Validation(Required=false)]
        public string Repayment { get; set; }

    }

}
