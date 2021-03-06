// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpDetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ip的链上id列表
        [NameInMap("ip_ids")]
        [Validation(Required=true)]
        public List<string> IpIds { get; set; }

        // 查找不到的ip是否报错，默认false，会报错
        [NameInMap("skip_not_found_ip")]
        [Validation(Required=false)]
        public bool? SkipNotFoundIp { get; set; }

    }

}
