// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 阶段存证结果
    public class PhaseCreateResult : TeaModel {
        // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
        [NameInMap("phase_no")]
        [Validation(Required=true)]
        public long? PhaseNo { get; set; }

        // 阶段ID，阶段存证的唯一标记
        [NameInMap("phase_id")]
        [Validation(Required=true)]
        public string PhaseId { get; set; }

        // 业务方原始数据ID，方便与业务方进行数据核对使用，并且如果同一个阶段多次存证，则需要根据业务方原始数据ID识别不同的阶段存证响应
        [NameInMap("origin_data_id")]
        [Validation(Required=true)]
        public string OriginDataId { get; set; }

    }

}
