// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCreditPermitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号
        [NameInMap("card_no")]
        [Validation(Required=false)]
        public string CardNo { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 合作方产品编号
        [NameInMap("prod_no")]
        [Validation(Required=false)]
        public string ProdNo { get; set; }

        // 1:app
        // 2:H5
        [NameInMap("channel_type")]
        [Validation(Required=false)]
        public string ChannelType { get; set; }

        // 客户类型
        // ("1", "新增客户"),("2", "存量激活客户"),("3", "目标营销账户")
        [NameInMap("custom_type")]
        [Validation(Required=false)]
        public string CustomType { get; set; }

        // 导流平台
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 流量来源名称
        [NameInMap("traffic_source_name")]
        [Validation(Required=false)]
        public string TrafficSourceName { get; set; }

        // 广告位标志
        [NameInMap("traffic_ad_id")]
        [Validation(Required=false)]
        public string TrafficAdId { get; set; }

        // 营销id
        [NameInMap("traffic_mkt_id")]
        [Validation(Required=false)]
        public string TrafficMktId { get; set; }

        // 点击id
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

    }

}
