// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportIotlinkThingmodeltslRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 您编辑的物模型（TSL）。JSON格式的字符串。产品的物模型（TSL）包含属性、服务和事件的定义。
        [NameInMap("tsl_str")]
        [Validation(Required=true)]
        public string TslStr { get; set; }

    }

}
