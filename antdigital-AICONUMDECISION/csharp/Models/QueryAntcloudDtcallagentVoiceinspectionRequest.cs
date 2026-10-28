// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    public class QueryAntcloudDtcallagentVoiceinspectionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务空间实例编码
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // execute 接口返回的质检记录 ID
        [NameInMap("qc_record_id")]
        [Validation(Required=true)]
        public string QcRecordId { get; set; }

    }

}
