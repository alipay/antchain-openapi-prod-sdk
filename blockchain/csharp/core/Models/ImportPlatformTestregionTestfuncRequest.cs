// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ImportPlatformTestregionTestfuncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 123
        [NameInMap("test_param1")]
        [Validation(Required=true)]
        public string TestParam1 { get; set; }

        // 123
        [NameInMap("test_param2")]
        [Validation(Required=true)]
        public long? TestParam2 { get; set; }

        // 123
        [NameInMap("test_param3")]
        [Validation(Required=true)]
        public List<NodeInfo> TestParam3 { get; set; }

    }

}
