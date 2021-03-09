// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 旧版应用管理-发布包上传策略
    public class PackageUploadPolicy : TeaModel {
        // accessKey
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // 策略
        [NameInMap("policy")]
        [Validation(Required=false)]
        public string Policy { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 路径前缀
        [NameInMap("path_prefix")]
        [Validation(Required=false)]
        public string PathPrefix { get; set; }

        // endpoint
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        // expire
        [NameInMap("expire")]
        [Validation(Required=false)]
        public string Expire { get; set; }

        // bucket
        [NameInMap("bucket")]
        [Validation(Required=false)]
        public string Bucket { get; set; }

    }

}
