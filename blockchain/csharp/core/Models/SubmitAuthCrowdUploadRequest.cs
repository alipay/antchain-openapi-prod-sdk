// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SubmitAuthCrowdUploadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上传文件地址
        [NameInMap("upload_url")]
        [Validation(Required=true)]
        public string UploadUrl { get; set; }

        // 人群类型 （1，三个月的问卷人群，2，六个月的问卷人群，3，三个月的招募人群，4，六个月的招募人群）
        [NameInMap("crowd_type")]
        [Validation(Required=true)]
        public string CrowdType { get; set; }

        // 备注信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
