// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 生命周期阶段活动数据
    public class LcaStageActiveData : TeaModel {
        // LCA阶段
        [NameInMap("lca_stage")]
        [Validation(Required=true)]
        public string LcaStage { get; set; }

        // 输入流活动数据列表
        [NameInMap("input_stream_list")]
        [Validation(Required=true)]
        public List<InputStreamActiveData> InputStreamList { get; set; }

        // 输出流活动数据列表
        [NameInMap("output_stream_list")]
        [Validation(Required=true)]
        public List<OutputStreamActiveData> OutputStreamList { get; set; }

    }

}
