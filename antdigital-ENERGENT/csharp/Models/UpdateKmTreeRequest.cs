// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class UpdateKmTreeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=true)]
        public string TreeId { get; set; }

        // 知识库名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 知识库描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 知识库图标
        [NameInMap("icon")]
        [Validation(Required=false)]
        public string Icon { get; set; }

        // 图谱本体Schema JSON
        [NameInMap("schema_json")]
        [Validation(Required=false)]
        public string SchemaJson { get; set; }

        // 是否开启图谱编译
        [NameInMap("graph_enabled")]
        [Validation(Required=false)]
        public bool? GraphEnabled { get; set; }

    }

}
