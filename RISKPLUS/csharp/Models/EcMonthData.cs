// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 经营数据
    public class EcMonthData : TeaModel {
        // 月份格式为YYYYMM
        /// <summary>
        /// <b>Example:</b>
        /// <para>202210</para>
        /// </summary>
        [NameInMap("month")]
        [Validation(Required=true)]
        public string Month { get; set; }

        // 实际结算金额/销售收入 单位：元，格式：数字，小数点后两位
        /// <summary>
        /// <b>Example:</b>
        /// <para>22300000.00</para>
        /// </summary>
        [NameInMap("purchase_amount")]
        [Validation(Required=true)]
        public long? PurchaseAmount { get; set; }

        // GMV，单位：元，格式：数字，小数点后两位
        /// <summary>
        /// <b>Example:</b>
        /// <para>22300000.00</para>
        /// </summary>
        [NameInMap("gmv")]
        [Validation(Required=true)]
        public long? Gmv { get; set; }

        // 退货率。单位：%，格式：数字，小数点后两位
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.08</para>
        /// </summary>
        [NameInMap("ret_rate")]
        [Validation(Required=true)]
        public long? RetRate { get; set; }

    }

}
