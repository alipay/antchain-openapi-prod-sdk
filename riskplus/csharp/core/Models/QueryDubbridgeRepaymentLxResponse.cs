// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepaymentLxResponse : TeaModel {
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

        // 还款状态，
        // 1、成功(结算成功)
        // 2、失败(结算失败)
        // 3. 还款中(结算处理中)
        // 4. 查无此通知（会重复发起还款）
        [NameInMap("repay_status")]
        [Validation(Required=false)]
        public long? RepayStatus { get; set; }

        // 处理成功时间，成功必填YYYY-MM-DD HH:MM:SS
        [NameInMap("process_time")]
        [Validation(Required=false)]
        public string ProcessTime { get; set; }

        // 还款描述，失败时，需给出的错误描述
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 还款总额,保留两位有效数字(单位:元)
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public long? RepayAmount { get; set; }

        // 实还本金,保留两位有效数字(单位:元)
        [NameInMap("repay_principal")]
        [Validation(Required=false)]
        public string RepayPrincipal { get; set; }

        // 实还利息,保留两位有效数字(单位:元)
        [NameInMap("repay_interest")]
        [Validation(Required=false)]
        public string RepayInterest { get; set; }

        // 实还罚息,保留两位有效数字(单位:元)
        [NameInMap("repay_muclt")]
        [Validation(Required=false)]
        public long? RepayMuclt { get; set; }

        // 实还担保费,保留两位有效数字(单位:元)
        [NameInMap("repay_guarantee")]
        [Validation(Required=false)]
        public long? RepayGuarantee { get; set; }

        // 实还信用评估费,保留两位有效数字(单位:元)
        [NameInMap("repay_credit_fee")]
        [Validation(Required=false)]
        public long? RepayCreditFee { get; set; }

        // 实还咨询服务费,保留两位有效数字(单位:元)
        [NameInMap("repay_grantee_consult_service_fee")]
        [Validation(Required=false)]
        public long? RepayGranteeConsultServiceFee { get; set; }

    }

}
