// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 实人信息
    public class BclCertifyInfo : TeaModel {
        // 认证id
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 认证url 如果status待认证,该字段非空,
        // 如果认证失败,这里的新的认证链接,支持重复认证
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

        // 认证描述
        [NameInMap("result_desc")]
        [Validation(Required=false)]
        public string ResultDesc { get; set; }

        // 认证状态
        // 待认证  INIT
        // 认证成功 PASS
        // 认证失败 FAIL
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
