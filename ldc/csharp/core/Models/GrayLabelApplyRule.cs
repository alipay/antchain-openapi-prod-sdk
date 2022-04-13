// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 灰度发布场景下，给进入的流量加灰度label的规则
    public class GrayLabelApplyRule : TeaModel {
        // 多个指定条件的计算方式，目前支持AND和OR
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 入口流量的多个规则，将根据operator进行与、或运算
        [NameInMap("downstream_rules")]
        [Validation(Required=true)]
        public List<GrayLabelDownstreamRule> DownstreamRules { get; set; }

    }

}
