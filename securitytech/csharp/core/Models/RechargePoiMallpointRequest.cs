// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class RechargePoiMallpointRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝小程序用户唯一ID
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 分期主订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 商城总余额
        [NameInMap("total_mall_amount")]
        [Validation(Required=true)]
        public string TotalMallAmount { get; set; }

        // 积分换算系数
        [NameInMap("exchange_rate")]
        [Validation(Required=true)]
        public string ExchangeRate { get; set; }

        // 商城充值总期数
        [NameInMap("total_phase")]
        [Validation(Required=true)]
        public string TotalPhase { get; set; }

        // 当期充值金额
        [NameInMap("phase_amount")]
        [Validation(Required=true)]
        public string PhaseAmount { get; set; }

        // 当前期数编号
        [NameInMap("phase_no")]
        [Validation(Required=true)]
        public string PhaseNo { get; set; }

        // 渠道
        [NameInMap("traffic_platform")]
        [Validation(Required=true)]
        public string TrafficPlatform { get; set; }

        // 渠道Code
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

    }

}
