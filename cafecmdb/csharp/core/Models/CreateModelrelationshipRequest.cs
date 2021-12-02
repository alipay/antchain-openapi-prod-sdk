// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class CreateModelrelationshipRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标模型的唯一标识
        [NameInMap("destination_model_id")]
        [Validation(Required=true)]
        public string DestinationModelId { get; set; }

        // 源模型的唯一标识（目标模型内唯一）
        [NameInMap("source_model_id")]
        [Validation(Required=true)]
        public string SourceModelId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

    }

}
