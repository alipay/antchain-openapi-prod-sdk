// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 还款策略
    public class RepayStrategy : TeaModel {
        // 应付租金时间，精确到天 格式为yyyy-MM-dd
        [NameInMap("pay_day")]
        [Validation(Required=true)]
        public string PayDay { get; set; }

        // 用户还款期数，从1开始
        [NameInMap("term_index")]
        [Validation(Required=true)]
        public long? TermIndex { get; set; }

        // 应付租金，精确到分，即1234表示12.34元 大于0
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 是否经营分账, Y-是、N-否 为空代表否
        [NameInMap("operate_divide_flag")]
        [Validation(Required=false)]
        public string OperateDivideFlag { get; set; }

        // 经营分账收入方列表
        // 当operateDivideFlag 为Y时必填
        [NameInMap("operate_divide_trans_in_list")]
        [Validation(Required=false)]
        public List<OperateDivideTransInModel> OperateDivideTransInList { get; set; }

        // 是否停止数科代扣自动执行
        // 
        // Y：停止；由商户调用接口「支付相关接入 - 代扣计划重试」触发代扣；否则代扣不会被执行、到逾期时间后会被逾期
        // 
        // N : 不停止；保持数科自动代扣（默认）
        [NameInMap("no_need_auto_deduction")]
        [Validation(Required=false)]
        public string NoNeedAutoDeduction { get; set; }

    }

}
