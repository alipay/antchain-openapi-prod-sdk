// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 国际可开票单据
    public class IntlRcptDetailItem : TeaModel {
        // 可开票单据号
        /// <summary>
        /// <b>Example:</b>
        /// <para>33345454</para>
        /// </summary>
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20882838383</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 合同号或订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>3333</para>
        /// </summary>
        [NameInMap("ar_no")]
        [Validation(Required=true)]
        public string ArNo { get; set; }

        // 计费类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PREPAY/AFTER_PAY</para>
        /// </summary>
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public string ChargeType { get; set; }

        // 合同商品总金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>34.99</para>
        /// </summary>
        [NameInMap("rcpt_contract_amt")]
        [Validation(Required=true)]
        public string RcptContractAmt { get; set; }

        // 合同商品已开票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>22.12</para>
        /// </summary>
        [NameInMap("rept_inved_amt")]
        [Validation(Required=true)]
        public string ReptInvedAmt { get; set; }

        // 合同商品剩余可开票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>23.21</para>
        /// </summary>
        [NameInMap("rcpt_contract_remain_amt")]
        [Validation(Required=true)]
        public string RcptContractRemainAmt { get; set; }

        // 商品CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>abd</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试商品</para>
        /// </summary>
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // ou
        /// <summary>
        /// <b>Example:</b>
        /// <para>Z37</para>
        /// </summary>
        [NameInMap("ou")]
        [Validation(Required=true)]
        public string Ou { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>840</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.09</para>
        /// </summary>
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

        // 合同金额（不含税）
        /// <summary>
        /// <b>Example:</b>
        /// <para>22</para>
        /// </summary>
        [NameInMap("rcpt_contract_amt_excl_tax")]
        [Validation(Required=true)]
        public string RcptContractAmtExclTax { get; set; }

        // 已开票金额（不含税）
        /// <summary>
        /// <b>Example:</b>
        /// <para>23</para>
        /// </summary>
        [NameInMap("rept_inved_amt_excl_tax")]
        [Validation(Required=true)]
        public string ReptInvedAmtExclTax { get; set; }

        // 剩余可开票金额（不含税）
        /// <summary>
        /// <b>Example:</b>
        /// <para>23</para>
        /// </summary>
        [NameInMap("rcpt_contract_remain_amt_excl_tax")]
        [Validation(Required=true)]
        public string RcptContractRemainAmtExclTax { get; set; }

    }

}
