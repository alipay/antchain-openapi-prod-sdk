// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CountIpAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // 场景码(入驻时申请)(长度不超过50个字符)
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // null返回所有数据，非空返回对应渠道的数据
        [NameInMap("channel_name")]
        [Validation(Required=false)]
        public string ChannelName { get; set; }

    }

}
