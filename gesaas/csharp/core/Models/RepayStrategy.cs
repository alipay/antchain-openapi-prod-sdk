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
        [NameInMap("renta_money")]
        [Validation(Required=true)]
        public long? RentaMoney { get; set; }

        // 是否经营分账, Y-是、N-否 为空代表否
        [NameInMap("operate_divide_flag")]
        [Validation(Required=false)]
        public string OperateDivideFlag { get; set; }

        // 经营分账收入方列表
        // 当operateDivideFlag 为Y时必填
        [NameInMap("operate_divide_trans_in_list")]
        [Validation(Required=true)]
        public List<OperateDivideTransInModel> OperateDivideTransInList { get; set; }

    }

}
