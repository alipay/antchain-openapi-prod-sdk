// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户还款策略
    public class MerchantOrderRepayStrategy : TeaModel {
        // 分账期数(关联商户履约)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

        // 还款期数(关联用户还款承诺)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lease_term_index")]
        [Validation(Required=false)]
        public long? LeaseTermIndex { get; set; }

        // 分账金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("pay_money")]
        [Validation(Required=false)]
        public long? PayMoney { get; set; }

        // 转代偿时间，yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-01-01</para>
        /// </summary>
        [NameInMap("to_compensate_date")]
        [Validation(Required=false)]
        public string ToCompensateDate { get; set; }

        // 资方社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

        // 资方公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx公司</para>
        /// </summary>
        [NameInMap("fund_company_name")]
        [Validation(Required=false)]
        public string FundCompanyName { get; set; }

    }

}
