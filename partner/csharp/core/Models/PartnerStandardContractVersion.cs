// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方标准合同版本信息
    public class PartnerStandardContractVersion : TeaModel {
        // 协议名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 协议可预览地址
        [NameInMap("preview_url")]
        [Validation(Required=true)]
        public string PreviewUrl { get; set; }

        // 协议版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
