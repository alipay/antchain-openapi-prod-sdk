// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentCreativeImageeditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品代码，当前仅支持 FUND（基金）。
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 来源子图成功版本 ID，必须属于当前调用用户及租户；可使用子图列表中的成功版本或上一轮编辑成功返回的新版本。
        [NameInMap("segment_version_id")]
        [Validation(Required=true)]
        public string SegmentVersionId { get; set; }

        // 本轮图片修改要求，不能为空。源图和输出宽高由服务端根据来源版本解析。
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

    }

}
