// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateAppsRecoveryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 000001
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 发起方信息
        [NameInMap("recovery")]
        [Validation(Required=true)]
        public RecoveryDTO Recovery { get; set; }

        // 数据源信息
        [NameInMap("recovery_ds_array")]
        [Validation(Required=true)]
        public List<RecoveryDsDTO> RecoveryDsArray { get; set; }

    }

}
