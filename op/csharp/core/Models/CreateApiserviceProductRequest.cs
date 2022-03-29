// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class CreateApiserviceProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 产品类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 产品英文名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品中文名
        [NameInMap("chinese_name")]
        [Validation(Required=true)]
        public string ChineseName { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=false)]
        public string ProdVersion { get; set; }

        // 产品所有者
        [NameInMap("primary_owner_id")]
        [Validation(Required=true)]
        public string PrimaryOwnerId { get; set; }

        // 产品描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // api提供方类型
        [NameInMap("provider_type")]
        [Validation(Required=false)]
        public string ProviderType { get; set; }

        // 产品前缀
        [NameInMap("api_name_prefix")]
        [Validation(Required=false)]
        public string ApiNamePrefix { get; set; }

    }

}
