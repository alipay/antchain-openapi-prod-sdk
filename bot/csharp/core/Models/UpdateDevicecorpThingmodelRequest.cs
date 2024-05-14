// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateDevicecorpThingmodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 功能原有的标识符
        [NameInMap("identifier")]
        [Validation(Required=false)]
        public string Identifier { get; set; }

        // 新的功能定义详情
        [NameInMap("thing_model_json")]
        [Validation(Required=false)]
        public string ThingModelJson { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

    }

}
