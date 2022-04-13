// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 灰度发布场景下，给入口流量添加的单个判断规则
    public class GrayLabelDownstreamRule : TeaModel {
        // 判断入口流量的方式，目前支持通过header或cookie判断
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 用于判断的键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 判断条件，目前支持相等或者不相等
        [NameInMap("condition")]
        [Validation(Required=true)]
        public string Condition { get; set; }

        // 用于判断的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
