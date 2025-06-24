// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRouterFundrouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 1：现金贷（默认）
        // 2：分期付
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 资产方购物订单号，如二轮车/摩托车订单号；购物场景时传递
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

        // 身份证号
        [NameInMap("card_no")]
        [Validation(Required=false)]
        public string CardNo { get; set; }

        // 姓名
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 默认：0
        // 0：明文
        // 1：md5
        [NameInMap("mobile_type")]
        [Validation(Required=false)]
        public string MobileType { get; set; }

        // 默认：0
        // 0：明文
        // 1：md5
        [NameInMap("card_no_type")]
        [Validation(Required=false)]
        public string CardNoType { get; set; }

        // 默认：0
        // 0：明文
        // 1：md5
        [NameInMap("custom_name_type")]
        [Validation(Required=false)]
        public string CustomNameType { get; set; }

        // 渠道类型
        [NameInMap("channel_type")]
        [Validation(Required=false)]
        public string ChannelType { get; set; }

        // 客户类型
        [NameInMap("custom_type")]
        [Validation(Required=false)]
        public string CustomType { get; set; }

        // 合作方产品编号
        [NameInMap("prod_no")]
        [Validation(Required=false)]
        public string ProdNo { get; set; }

        // 授信过期的资金方编码
        [NameInMap("expired_platform_no")]
        [Validation(Required=false)]
        public string ExpiredPlatformNo { get; set; }

        // 导流平台
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 流量名称
        [NameInMap("traffic_source_name")]
        [Validation(Required=false)]
        public string TrafficSourceName { get; set; }

        // 广告位标志
        [NameInMap("traffic_ad_id")]
        [Validation(Required=false)]
        public string TrafficAdId { get; set; }

        // 预留
        [NameInMap("traffic_mkt_id")]
        [Validation(Required=false)]
        public string TrafficMktId { get; set; }

        // 预留
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

        // 风险字段
        [NameInMap("risk_data")]
        [Validation(Required=false)]
        public string RiskData { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
