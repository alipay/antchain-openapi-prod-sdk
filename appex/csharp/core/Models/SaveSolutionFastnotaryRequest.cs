// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class SaveSolutionFastnotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用did
        // 
        [NameInMap("app_did")]
        [Validation(Required=true)]
        public string AppDid { get; set; }

        // 表名
        [NameInMap("schema_name")]
        [Validation(Required=true)]
        public string SchemaName { get; set; }

        // 存证数据
        [NameInMap("attributes")]
        [Validation(Required=true)]
        public List<NameValuePair> Attributes { get; set; }

    }

}
