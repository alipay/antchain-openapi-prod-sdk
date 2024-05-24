// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT人脸核身初始化数据
    public class FaceVerifyInitData : TeaModel {
        // 请求唯一标识Id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 可信实人认证的唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 认证流程入口 URL
        [NameInMap("certify_url")]
        [Validation(Required=true)]
        public string CertifyUrl { get; set; }

    }

}
