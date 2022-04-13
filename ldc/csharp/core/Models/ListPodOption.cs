// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 查询pod列表的可选参数
    public class ListPodOption : TeaModel {
        // 根据pod number列举pod的方式：RANGE为范围查询；ARRAY为指定pod number查询；ALL查询全量
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // [type为RANGE时生效]范围查询的左边界（包含）
        [NameInMap("pod_numer_from")]
        [Validation(Required=false)]
        public long? PodNumerFrom { get; set; }

        // [type为RANGE时生效]范围查询的右边界（不包含）
        [NameInMap("pod_number_to")]
        [Validation(Required=false)]
        public long? PodNumberTo { get; set; }

        // [type为ARRAY时生效]指定pod number的查询
        [NameInMap("pod_numbers")]
        [Validation(Required=false)]
        public List<long?> PodNumbers { get; set; }

    }

}
