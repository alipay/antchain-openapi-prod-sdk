// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthCrowdUploadurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 问件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 人群类型：LAST_THREE_MONTHS_SURVEY（排除问卷三个月人群）；LAST_SIX_MONTHS_SURVEY（排除问卷六个月人群）；LAST_THREE_MONTHS_RECRUIT（排除招募三个月人群）LAST_SIX_MONTHS_RECRUIT（排除招募任务六个月人群）
        [NameInMap("crowd_type")]
        [Validation(Required=true)]
        public string CrowdType { get; set; }

    }

}
