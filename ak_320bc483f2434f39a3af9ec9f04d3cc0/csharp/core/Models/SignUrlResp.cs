// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署链接类
    public class SignUrlResp : TeaModel {
        // 0-企业 1-用户
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 企业名称或用户姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 社会信用代码或身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 手动签署url（长链接）
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 手动签署url(端链接)
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public string ShortUrl { get; set; }

        // 电子合同签署区id
        [NameInMap("sign_filed_id")]
        [Validation(Required=true)]
        public string SignFiledId { get; set; }

    }

}
