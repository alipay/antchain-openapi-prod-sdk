// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 创建VC参数
    public class AddVC : TeaModel {
        // vc原文hash
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // issuer后缀的hash值
        [NameInMap("issuer_hash")]
        [Validation(Required=true)]
        public string IssuerHash { get; set; }

        // valid or invalid
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 接收者后缀hash值
        [NameInMap("subject_hash")]
        [Validation(Required=true)]
        public string SubjectHash { get; set; }

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

    }

}
