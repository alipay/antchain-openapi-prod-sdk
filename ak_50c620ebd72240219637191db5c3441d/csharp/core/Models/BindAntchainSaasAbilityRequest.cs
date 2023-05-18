// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_50c620ebd72240219637191db5c3441d.Models
{
    public class BindAntchainSaasAbilityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 能力id列表
        [NameInMap("ability_ids")]
        [Validation(Required=true)]
        public List<string> AbilityIds { get; set; }

        // 操作人的域账号
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // api信息
        [NameInMap("api_info_model")]
        [Validation(Required=true)]
        public ApiInfoModel ApiInfoModel { get; set; }

    }

}
