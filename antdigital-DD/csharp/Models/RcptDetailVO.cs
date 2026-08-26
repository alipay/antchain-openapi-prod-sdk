// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 开票单据明细
    public class RcptDetailVO : TeaModel {
        // 合同号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149-ZNHYFM01222234</para>
        /// </summary>
        [NameInMap("ar_no")]
        [Validation(Required=true)]
        public string ArNo { get; set; }

        // OU
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZL6</para>
        /// </summary>
        [NameInMap("ou")]
        [Validation(Required=true)]
        public string Ou { get; set; }

        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 客户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试客户</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 单据唯一号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20230928107305000028710015937380</para>
        /// </summary>
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

        // 税率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.06</para>
        /// </summary>
        [NameInMap("tax")]
        [Validation(Required=false)]
        public string Tax { get; set; }

        // 商品CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>SQBRFSZL601262688</para>
        /// </summary>
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 开票模式，01：先款后票、02：先票后款
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

        // 单据可开票总金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>13.45</para>
        /// </summary>
        [NameInMap("total_amt")]
        [Validation(Required=true)]
        public string TotalAmt { get; set; }

        // 已开票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.23</para>
        /// </summary>
        [NameInMap("inved_amt")]
        [Validation(Required=true)]
        public string InvedAmt { get; set; }

        // 剩余可开票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>234.99</para>
        /// </summary>
        [NameInMap("remain_amt")]
        [Validation(Required=true)]
        public string RemainAmt { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>商品名称</para>
        /// </summary>
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

    }

}
