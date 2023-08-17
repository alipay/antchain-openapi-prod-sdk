// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 任务使用的数据集
    public class DatasetProxyRelations : TeaModel {
        // 来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // iTAG数据集的ID
        [NameInMap("datasetid")]
        [Validation(Required=false)]
        public string Datasetid { get; set; }

        // 标注类型
        [NameInMap("datasettype")]
        [Validation(Required=false)]
        public string Datasettype { get; set; }

        // SourceBizId
        [NameInMap("sourcebizid")]
        [Validation(Required=false)]
        public string Sourcebizid { get; set; }

    }

}
