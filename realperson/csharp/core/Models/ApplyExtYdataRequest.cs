// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyExtYdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 之前调用返回的 req_msg_id
        [NameInMap("history_order_no")]
        [Validation(Required=true)]
        public string HistoryOrderNo { get; set; }

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

        // 卡类型
        // 储蓄卡（Debit Card）或者信用卡（Credit Card）
        // 储蓄卡：DC
        // 信用卡：CC
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

        // 第六期是否扣款成功
        [NameInMap("sixth_deduction_amount")]
        [Validation(Required=false)]
        public string SixthDeductionAmount { get; set; }

        // 预留扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
