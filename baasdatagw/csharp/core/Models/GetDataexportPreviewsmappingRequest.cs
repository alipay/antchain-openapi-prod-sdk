// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class GetDataexportPreviewsmappingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户唯一标识符（租户ID）
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链唯一标识符
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 获取的映射类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 预览返回的数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<string> Data { get; set; }

    }

}
