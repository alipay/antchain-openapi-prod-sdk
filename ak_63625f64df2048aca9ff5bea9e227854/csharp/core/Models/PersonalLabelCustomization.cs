// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_63625f64df2048aca9ff5bea9e227854.Models
{
    // 标签个性化
    public class PersonalLabelCustomization : TeaModel {
        // 标签需求类型。0,1-只需要这些标签，2-不需要这些标签，默认0
        [NameInMap("filter_type")]
        [Validation(Required=false)]
        public long? FilterType { get; set; }

        // 需要个性化处理的一级标签
        [NameInMap("custom_label_v1")]
        [Validation(Required=false)]
        public List<string> CustomLabelV1 { get; set; }

        // 需要个性化处理的二级标签
        [NameInMap("custom_label_v2")]
        [Validation(Required=false)]
        public List<string> CustomLabelV2 { get; set; }

    }

}
