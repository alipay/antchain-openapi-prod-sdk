// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权协议信息
    public class AgreementConfigInfoDTO : TeaModel {
        // 协议名称
        [NameInMap("agreement_name")]
        [Validation(Required=true)]
        public string AgreementName { get; set; }

        // 协议链接
        [NameInMap("agreement_url")]
        [Validation(Required=true)]
        public string AgreementUrl { get; set; }

        // 协议描述
        [NameInMap("agreement_desc")]
        [Validation(Required=true)]
        public string AgreementDesc { get; set; }

        // 协议版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

    }

}
