// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 守夜人类型卡点配置
    public class HasHookConfig : TeaModel {
        // 前置脚本类型，巡检或预案
        [NameInMap("pre_type")]
        [Validation(Required=false)]
        public string PreType { get; set; }

        // 前置巡检或预案id
        [NameInMap("pre_ref_id")]
        [Validation(Required=false)]
        public string PreRefId { get; set; }

        // 前置巡检或预案名称
        [NameInMap("pre_name")]
        [Validation(Required=false)]
        public string PreName { get; set; }

        // 前置巡检或预案参数
        [NameInMap("pre_param")]
        [Validation(Required=false)]
        public string PreParam { get; set; }

        // 后置脚本类型，巡检或预案
        [NameInMap("post_type")]
        [Validation(Required=false)]
        public string PostType { get; set; }

        // 后置巡检或预案id
        [NameInMap("post_ref_id")]
        [Validation(Required=false)]
        public string PostRefId { get; set; }

        // 后置巡检或预案参数
        [NameInMap("post_param")]
        [Validation(Required=false)]
        public string PostParam { get; set; }

        // 后置巡检或预案名称
        [NameInMap("post_name")]
        [Validation(Required=false)]
        public string PostName { get; set; }

    }

}
