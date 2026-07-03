// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubheRouterFundrouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号(md5加密32位)
        [NameInMap("card_no")]
        [Validation(Required=true)]
        public string CardNo { get; set; }

        // 手机号（MD5加密，32位）
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 客户姓名
        [NameInMap("custom_name")]
        [Validation(Required=true)]
        public string CustomName { get; set; }

        // 合作方产品编号
        [NameInMap("prod_no")]
        [Validation(Required=true)]
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

    }

}
