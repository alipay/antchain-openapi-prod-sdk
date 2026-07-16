// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销抢购风险识别入参模型
    public class PurchaseQueryModel : TeaModel {
        // 支付宝外部交易号
        /// <summary>
        /// <b>Example:</b>
        /// <para>202304xxxxxxxxxx</para>
        /// </summary>
        [NameInMap("out_order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OutOrderNo { get; set; }

        // 支付宝内部生成的交易号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20230426xxxxxxxxxx</para>
        /// </summary>
        [NameInMap("order_no")]
        [Validation(Required=false, MaxLength=50)]
        public string OrderNo { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6228xxxxxxxxxxxxx13</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=52)]
        public string BankCardNo { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州贸易有限公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=false, MaxLength=50)]
        public string CompanyName { get; set; }

        // 金额，用户购买或使用服务时产生的具体金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>6657</para>
        /// </summary>
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

    }

}
