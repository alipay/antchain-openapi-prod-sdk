// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分充值信息
    public class PoiMallPointRechargeInfo : TeaModel {
        // 充值唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("recharge_id")]
        [Validation(Required=true)]
        public string RechargeId { get; set; }

        // 支付宝小程序用户唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 门店ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 分期主订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 商城总余额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_mall_amount")]
        [Validation(Required=true)]
        public string TotalMallAmount { get; set; }

        // 积分换算系数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("exchange_rate")]
        [Validation(Required=true)]
        public string ExchangeRate { get; set; }

        // 商城充值总期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_phase")]
        [Validation(Required=true)]
        public string TotalPhase { get; set; }

        // 当前期数编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("phase_no")]
        [Validation(Required=true)]
        public string PhaseNo { get; set; }

        // 当期充值金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("phase_amount")]
        [Validation(Required=true)]
        public string PhaseAmount { get; set; }

        // 渠道Code
        /// <summary>
        /// <b>Example:</b>
        /// <para>TBJHF</para>
        /// </summary>
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 子渠道
        /// <summary>
        /// <b>Example:</b>
        /// <para>NYG</para>
        /// </summary>
        [NameInMap("traffic_platform")]
        [Validation(Required=true)]
        public string TrafficPlatform { get; set; }

        // 充值来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>DUBHE_MALL_INTEGRAL_RECHARG</para>
        /// </summary>
        [NameInMap("point_source")]
        [Validation(Required=true)]
        public string PointSource { get; set; }

    }

}
