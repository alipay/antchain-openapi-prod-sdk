// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDeviceDatamodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据模型
        [NameInMap("data_model")]
        [Validation(Required=true)]
        public string DataModel { get; set; }

        // 数据模型名称
        [NameInMap("data_model_name")]
        [Validation(Required=false)]
        public string DataModelName { get; set; }

    }

}
