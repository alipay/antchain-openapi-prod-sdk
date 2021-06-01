// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署区列表包含印章id数据
    public class ContractSignFieldSealId : TeaModel {
        // 文件file id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 印章id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
        [NameInMap("seal_type")]
        [Validation(Required=false)]
        public string SealType { get; set; }

        // 签署区Id
        [NameInMap("signfield_id")]
        [Validation(Required=false)]
        public string SignfieldId { get; set; }

    }

}
