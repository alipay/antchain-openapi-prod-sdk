// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b08c548e3a88469c89fe27adc3d0b925.Models
{
    public class QueryBlockchainAppexSolutionFastnotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用did
        // 
        [NameInMap("app_did")]
        [Validation(Required=true)]
        public string AppDid { get; set; }

        // 索引字段的值
        // 
        [NameInMap("biz_index_key_value")]
        [Validation(Required=true)]
        public string BizIndexKeyValue { get; set; }

        // 名称
        [NameInMap("schema_name")]
        [Validation(Required=true)]
        public string SchemaName { get; set; }

    }

}
