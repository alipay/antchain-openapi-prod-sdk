// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class ImportAistudioOssRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 阿里云oss路径
        [NameInMap("aliyun_oss_path")]
        [Validation(Required=true)]
        public string AliyunOssPath { get; set; }

        // 主站oss路径
        [NameInMap("ant_oss_path")]
        [Validation(Required=true)]
        public string AntOssPath { get; set; }

    }

}
