// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidDiddocDirectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 待查询did
        [NameInMap("query_did")]
        [Validation(Required=true)]
        public string QueryDid { get; set; }

        // 请求中其他字段的签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
