// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyMktRealtimemktRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 加密类型，MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true)]
        public string EncryptionType { get; set; }

        // 实时营销人群列表
        [NameInMap("realtime_mkt_audience_list")]
        [Validation(Required=true)]
        public List<RealtimeMktAudience> RealtimeMktAudienceList { get; set; }

    }

}
