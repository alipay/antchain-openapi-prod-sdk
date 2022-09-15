// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class DeploySceneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // bnaas did
        [NameInMap("bnaas_basic_service_did")]
        [Validation(Required=false)]
        public string BnaasBasicServiceDid { get; set; }

        // baas rest bizId
        [NameInMap("baas_rest_biz_id")]
        [Validation(Required=false)]
        public string BaasRestBizId { get; set; }

        // 合约版本号
        [NameInMap("contract_version")]
        [Validation(Required=false)]
        public string ContractVersion { get; set; }

    }

}
