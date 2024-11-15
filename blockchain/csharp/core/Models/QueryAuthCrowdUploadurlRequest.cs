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

        // 业务类型：survey_1（排除问卷三个月人群）；survey_2（排除问卷六个月人群）；recruit_1（排除招募三个月人群）recruit_2（排除招募任务六个月人群）
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

    }

}
