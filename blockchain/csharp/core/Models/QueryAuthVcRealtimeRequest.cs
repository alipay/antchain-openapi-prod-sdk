// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVcRealtimeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询目标业务的实时凭证颁发情况
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 最新实时颁发的凭证查看数目，可以不设定，默认返回10个结果，如果整体结果少于10，则按情况返回。
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

    }

}
