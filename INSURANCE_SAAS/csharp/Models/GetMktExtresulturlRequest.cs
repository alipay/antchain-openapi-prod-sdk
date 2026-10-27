// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetMktExtresulturlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，每一次请求保持唯一，若重复，则报错
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 项目ID，蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ProjectId { get; set; }

        // 上传营销标识，来源于上传结果通知中的uploadMktNo
        [NameInMap("upload_mkt_no")]
        [Validation(Required=true, MaxLength=64)]
        public string UploadMktNo { get; set; }

    }

}
