// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // api导入 效验返回体
    public class CheckApiResult : TeaModel {
        // 导入的所有的API集合
        [NameInMap("all_api_list")]
        [Validation(Required=false)]
        public List<ApiTransferVO> AllApiList { get; set; }

        // API或者配置中有重复的集合
        [NameInMap("failed_api_list")]
        [Validation(Required=false)]
        public List<ApiTransferVO> FailedApiList { get; set; }

        // 	
        // API包括配置无重复的集合
        [NameInMap("success_api_list")]
        [Validation(Required=false)]
        public List<ApiTransferVO> SuccessApiList { get; set; }

        // 失败api配置详情
        [NameInMap("check_result")]
        [Validation(Required=false)]
        public string CheckResult { get; set; }

    }

}
