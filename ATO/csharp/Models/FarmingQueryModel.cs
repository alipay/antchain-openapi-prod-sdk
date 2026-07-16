// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 行业刷单风险识别入参模型
    public class FarmingQueryModel : TeaModel {
        // 支付宝外部交易号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6983312****</para>
        /// </summary>
        [NameInMap("out_order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OutOrderNo { get; set; }

        // 支付宝内部交易号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20230436xxxxxxxxx</para>
        /// </summary>
        [NameInMap("order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OrderNo { get; set; }

        // 金额，用户购买或使用服务时产生的具体金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>36500</para>
        /// </summary>
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6228xxxxxxxxxxxxx13</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=128)]
        public string BankCardNo { get; set; }

        // 服务商 pid
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxxxxxxxxxxx</para>
        /// </summary>
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        /// <summary>
        /// <b>Example:</b>
        /// <para>CATERING</para>
        /// </summary>
        [NameInMap("store_mcc_desc")]
        [Validation(Required=false, MaxLength=30)]
        public string StoreMccDesc { get; set; }

        // 门店地址；不需要传城市和行政区
        /// <summary>
        /// <b>Example:</b>
        /// <para>万塘路18号</para>
        /// </summary>
        [NameInMap("outlet_address")]
        [Validation(Required=false, MaxLength=128)]
        public string OutletAddress { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州贸易有限公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=false, MaxLength=128)]
        public string CompanyName { get; set; }

        // 店铺名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>小店1号</para>
        /// </summary>
        [NameInMap("store_name")]
        [Validation(Required=false, MaxLength=128)]
        public string StoreName { get; set; }

    }

}
