// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpGoodsdetailwithchannelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础结构
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ip的链上id
        [NameInMap("ip_ids")]
        [Validation(Required=true)]
        public List<string> IpIds { get; set; }

        // 查询的渠道名字
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

    }

}
