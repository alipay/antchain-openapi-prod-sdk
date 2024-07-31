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

        // 身份证号
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("custom_name")]
        [Validation(Required=true)]
        public string CustomName { get; set; }

        // 合作方产品编号
        [NameInMap("prod_no")]
        [Validation(Required=false)]
        public string ProdNo { get; set; }

        // 渠道类型
        [NameInMap("channel_type")]
        [Validation(Required=false)]
        public string ChannelType { get; set; }

        // 客户类型
        [NameInMap("custom_type")]
        [Validation(Required=false)]
        public string CustomType { get; set; }

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

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 风险字段
        [NameInMap("risk_data")]
        [Validation(Required=false)]
        public string RiskData { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

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

    }

}
