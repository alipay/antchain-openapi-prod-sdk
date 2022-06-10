// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class UploadStaffAssessmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求时间
        [NameInMap("time_stamp")]
        [Validation(Required=true)]
        public long? TimeStamp { get; set; }

        // 考核信息
        [NameInMap("assessment")]
        [Validation(Required=true)]
        public Assessment Assessment { get; set; }

    }

}
