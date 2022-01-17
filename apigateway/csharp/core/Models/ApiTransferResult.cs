// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiTransferResult
    public class ApiTransferResult : TeaModel {
        // api配置
        [NameInMap("api_transfer_list")]
        [Validation(Required=false)]
        public List<ApiTransferVO> ApiTransferList { get; set; }

        // 批量转移结果
        [NameInMap("batch_action_result")]
        [Validation(Required=false)]
        public BatchActionResult BatchActionResult { get; set; }

        // file_name
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 流程编排列表
        [NameInMap("apiflow_list")]
        [Validation(Required=false)]
        public List<ApiInfoVO> ApiflowList { get; set; }

    }

}
