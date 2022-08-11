// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    // 大安全内容安全接口返回值
    public class HoloxCheckResult : TeaModel {
        // 是否成功
        [NameInMap("sucess")]
        [Validation(Required=false)]
        public bool? Sucess { get; set; }

        // 本次调用id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 结果码
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 结果信息
        [NameInMap("result_message")]
        [Validation(Required=false)]
        public string ResultMessage { get; set; }

        // 213
        [NameInMap("warn_action")]
        [Validation(Required=false)]
        public string WarnAction { get; set; }

        // 123
        [NameInMap("content_property_output_result_map")]
        [Validation(Required=true)]
        public string ContentPropertyOutputResultMap { get; set; }

        // 213
        [NameInMap("hit_result_items")]
        [Validation(Required=false)]
        public string HitResultItems { get; set; }

    }

}
