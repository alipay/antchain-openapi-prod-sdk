// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class DisableDynamicslbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // envid
        [NameInMap("envid")]
        [Validation(Required=true)]
        public string Envid { get; set; }

        // 部署单元id
        [NameInMap("unitinstanceid")]
        [Validation(Required=true)]
        public string Unitinstanceid { get; set; }

        // prodcode
        [NameInMap("prodcode")]
        [Validation(Required=true)]
        public string Prodcode { get; set; }

        // appname
        [NameInMap("appname")]
        [Validation(Required=true)]
        public string Appname { get; set; }

    }

}
