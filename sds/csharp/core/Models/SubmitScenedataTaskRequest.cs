// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class SubmitScenedataTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 约定的场景枚举
        [NameInMap("scene")]
        [Validation(Required=true, MaxLength=32)]
        public string Scene { get; set; }

        // 枚举
        // PHONE_SHA1
        // PHONE_MD5
        [NameInMap("biz_no_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizNoType { get; set; }

        // 适配客户的来源
        // 可能是客户的任务/AK
        [NameInMap("source_mark")]
        [Validation(Required=false, MaxLength=32)]
        public string SourceMark { get; set; }

        // 业务号预期条件
        [NameInMap("expect_condition")]
        [Validation(Required=false)]
        public List<BizNoCondition> ExpectCondition { get; set; }

    }

}
