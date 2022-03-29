// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class SwitchSofamqAdminapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api接口名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 开关是否打开
        [NameInMap("switch_open")]
        [Validation(Required=true)]
        public bool? SwitchOpen { get; set; }

    }

}
