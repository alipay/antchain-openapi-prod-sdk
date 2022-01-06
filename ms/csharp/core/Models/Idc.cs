// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 机房信息
    public class Idc : TeaModel {
        // 机房对应配置中心域名
        [NameInMap("domain_name")]
        [Validation(Required=false)]
        public string DomainName { get; set; }

        // 机房id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 机房名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否为预发环境
        [NameInMap("preprod")]
        [Validation(Required=false)]
        public bool? Preprod { get; set; }

    }

}
