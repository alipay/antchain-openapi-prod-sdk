// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryMainsiteUnifiedentranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权协议索引
        [NameInMap("file_index")]
        [Validation(Required=false)]
        public string FileIndex { get; set; }

        // 整个需求的入参，map json
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 是否授权
        [NameInMap("user_authed")]
        [Validation(Required=false)]
        public bool? UserAuthed { get; set; }

        // 数据集服务id
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 	
        // 授权token
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // token授权场景码
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 实际调用的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
