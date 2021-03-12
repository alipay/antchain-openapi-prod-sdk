// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // Did服务类型描述结构体
    public class DidServiceType : TeaModel {
        // 枚举类型，描述访问服务的方式
        [NameInMap("access_mode")]
        [Validation(Required=false)]
        public string AccessMode { get; set; }

        // 对服务的文字描述，<1000个字符
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=1000)]
        public string Description { get; set; }

        // 服务类型创建者did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // { "item1":"", "item2":"",...
        [NameInMap("service_input")]
        [Validation(Required=false)]
        public string ServiceInput { get; set; }

        // 返回值类型描述，json形式
        [NameInMap("service_output")]
        [Validation(Required=false)]
        public string ServiceOutput { get; set; }

        // 自定义服务类型，字符数16～32个
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
