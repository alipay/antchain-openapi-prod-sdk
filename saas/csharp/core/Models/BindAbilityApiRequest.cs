// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class BindAbilityApiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 共享能力id
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // qiujianglong.qjl
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // api模型集合
        [NameInMap("api_info_models")]
        [Validation(Required=true)]
        public List<ApiInfoModel> ApiInfoModels { get; set; }

    }

}
