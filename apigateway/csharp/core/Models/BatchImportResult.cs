// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // BatchImportResult
    public class BatchImportResult : TeaModel {
        // failed_count
        [NameInMap("failed_count")]
        [Validation(Required=false)]
        public long? FailedCount { get; set; }

        // 重复的API列表
        [NameInMap("repeat_api_list")]
        [Validation(Required=false)]
        public List<ApiTransferVO> RepeatApiList { get; set; }

        // results
        [NameInMap("results")]
        [Validation(Required=false)]
        public List<ImportResult> Results { get; set; }

        // success_count
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // total_count
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 导入成功的API列表
        [NameInMap("success_api_list")]
        [Validation(Required=false)]
        public List<ApiInfoVO> SuccessApiList { get; set; }

    }

}
