// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class V2AasDataBankcardlivenessCallbackRequest : TeaModel {
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
        [Validation(Required=false)]
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

        // 第四期是否扣款成功
        [NameInMap("fourth_deduction")]
        [Validation(Required=false)]
        public bool? FourthDeduction { get; set; }

        // 第四期扣款金额
        [NameInMap("fourth_deduction_amount")]
        [Validation(Required=false)]
        public string FourthDeductionAmount { get; set; }

        // 第五期是否扣款成功
        [NameInMap("fifth_deduction")]
        [Validation(Required=false)]
        public bool? FifthDeduction { get; set; }

        // 第五期扣款金额
        [NameInMap("fifth_deduction_amount")]
        [Validation(Required=false)]
        public string FifthDeductionAmount { get; set; }

        // 第六期是否扣款成功
        [NameInMap("sixth_deduction")]
        [Validation(Required=false)]
        public bool? SixthDeduction { get; set; }

        // 第六期扣款金额
        [NameInMap("sixth_deduction_amount")]
        [Validation(Required=false)]
        public string SixthDeductionAmount { get; set; }

        // 第七期是否扣款成功
        [NameInMap("seventh_deduction")]
        [Validation(Required=false)]
        public bool? SeventhDeduction { get; set; }

        // 第七期扣款金额
        [NameInMap("seventh_deduction_amount")]
        [Validation(Required=false)]
        public string SeventhDeductionAmount { get; set; }

        // 第八期是否扣款成功
        [NameInMap("eighth_deduction")]
        [Validation(Required=false)]
        public bool? EighthDeduction { get; set; }

        // 第八期扣款金额
        [NameInMap("eighth_deduction_amount")]
        [Validation(Required=false)]
        public string EighthDeductionAmount { get; set; }

        // 第九期是否扣款成功
        [NameInMap("ninth_deduction")]
        [Validation(Required=false)]
        public bool? NinthDeduction { get; set; }

        // 第九期扣款金额
        [NameInMap("ninth_deduction_amount")]
        [Validation(Required=false)]
        public string NinthDeductionAmount { get; set; }

        // 第十期是否扣款成功
        [NameInMap("tenth_deduction")]
        [Validation(Required=false)]
        public bool? TenthDeduction { get; set; }

        // 第十期扣款金额
        [NameInMap("tenth_deduction_amount")]
        [Validation(Required=false)]
        public string TenthDeductionAmount { get; set; }

        // 第十一期是否扣款成功
        [NameInMap("eleventh_deduction")]
        [Validation(Required=false)]
        public bool? EleventhDeduction { get; set; }

        // 第十一期扣款金额
        [NameInMap("eleventh_deduction_amount")]
        [Validation(Required=false)]
        public string EleventhDeductionAmount { get; set; }

        // 第十二期是否扣款成功
        [NameInMap("twelfth_deduction")]
        [Validation(Required=false)]
        public bool? TwelfthDeduction { get; set; }

        // 第十二期扣款金额
        [NameInMap("twelfth_deduction_amount")]
        [Validation(Required=false)]
        public string TwelfthDeductionAmount { get; set; }

        // 第十三期是否扣款成功
        [NameInMap("thirteenth_deduction")]
        [Validation(Required=false)]
        public bool? ThirteenthDeduction { get; set; }

        // 第十三期扣款金额
        [NameInMap("thirteenth_deduction_amount")]
        [Validation(Required=false)]
        public string ThirteenthDeductionAmount { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
