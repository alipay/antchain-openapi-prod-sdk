// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单搜索信息
    public class OrderSearchInfo : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SH20241017184159846222</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 支付宝代扣协议号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20241025944255332</para>
        /// </summary>
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 订单创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17 18:41:59</para>
        /// </summary>
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 租金总额（单位分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>3500</para>
        /// </summary>
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 租期
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("rent_term")]
        [Validation(Required=false)]
        public long? RentTerm { get; set; }

        // 租期单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>MONTH</para>
        /// </summary>
        [NameInMap("rent_unit")]
        [Validation(Required=false)]
        public string RentUnit { get; set; }

        // 订单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>OPEN</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 承租人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345678912</para>
        /// </summary>
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

    }

}
