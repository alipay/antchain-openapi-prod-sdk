// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class JudgeAliyunAuthorityRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 阿里云POP API名称
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 阿里云资源描述数组
        [NameInMap("aliyun_resources")]
        [Validation(Required=true)]
        public List<AliyunResource> AliyunResources { get; set; }

        // 自定义条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 阿里云POP透传参数
        [NameInMap("request_info")]
        [Validation(Required=true)]
        public AliyunPopRequestInfo RequestInfo { get; set; }

        // 阿里云服务名称
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 0000000001
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
