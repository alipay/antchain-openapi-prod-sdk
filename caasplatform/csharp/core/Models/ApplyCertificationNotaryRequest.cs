// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class ApplyCertificationNotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 申请主体信息（公证处Identity结构）
        [NameInMap("applicant")]
        [Validation(Required=true)]
        public ApplicantInfo Applicant { get; set; }

        // 环节明细列表
        [NameInMap("step_detail_infos")]
        [Validation(Required=true)]
        public List<StepDetailInfo> StepDetailInfos { get; set; }

    }

}
