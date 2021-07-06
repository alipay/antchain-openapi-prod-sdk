// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBlocrBusinesslicenseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件二进制内容 + base64
        [NameInMap("image_raw")]
        [Validation(Required=false)]
        public string ImageRaw { get; set; }

        // 图片下载url
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

        // 服务调用来源(需要咨询服务提供方)
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
