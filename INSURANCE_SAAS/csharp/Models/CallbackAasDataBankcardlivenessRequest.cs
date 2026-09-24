// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackAasDataBankcardlivenessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码：BANKCARD_LIVENESS
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 请求ID，最大32位字母数字
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 响应ID（原查询接口返回的history_request_id）
        [NameInMap("history_request_id")]
        [Validation(Required=true)]
        public string HistoryRequestId { get; set; }

        // 绑卡页面银行排序（从上到下）
        [NameInMap("bank_display")]
        [Validation(Required=false)]
        public string BankDisplay { get; set; }

        // 用户选卡银行
        [NameInMap("interim_selected_bank_code")]
        [Validation(Required=false)]
        public string InterimSelectedBankCode { get; set; }

        // 用户绑卡银行
        [NameInMap("bind_bank_code")]
        [Validation(Required=true)]
        public string BindBankCode { get; set; }

        // 用户最终绑卡银行在页面上的排序
        [NameInMap("bind_bank_display")]
        [Validation(Required=false)]
        public string BindBankDisplay { get; set; }

        // 卡类型：DC-储蓄卡，CC-信用卡
        [NameInMap("bank_type")]
        [Validation(Required=true)]
        public string BankType { get; set; }

        // 第一期是否扣款成功
        [NameInMap("first_deduction")]
        [Validation(Required=true)]
        public bool? FirstDeduction { get; set; }

        // 第一期扣款金额
        [NameInMap("first_deduction_amount")]
        [Validation(Required=false)]
        public string FirstDeductionAmount { get; set; }

        // 第二期是否扣款成功
        [NameInMap("second_deduction")]
        [Validation(Required=false)]
        public bool? SecondDeduction { get; set; }

        // 第二期扣款金额
        [NameInMap("second_deduction_amount")]
        [Validation(Required=false)]
        public string SecondDeductionAmount { get; set; }

        // 第三期是否扣款成功
        [NameInMap("third_deduction")]
        [Validation(Required=false)]
        public bool? ThirdDeduction { get; set; }

        // 第三期扣款金额
        [NameInMap("third_deduction_amount")]
        [Validation(Required=false)]
        public string ThirdDeductionAmount { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
