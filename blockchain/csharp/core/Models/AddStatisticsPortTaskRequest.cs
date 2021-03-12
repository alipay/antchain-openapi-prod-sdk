// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class AddStatisticsPortTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 结束块高
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 开始块高
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

    }

}
