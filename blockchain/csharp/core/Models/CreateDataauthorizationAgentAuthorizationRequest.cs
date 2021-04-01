// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationAgentAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务UUID
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 授权原因
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 数据资产ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=true)]
        public long? Expire { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 授权规则
        [NameInMap("rule")]
        [Validation(Required=false)]
        public AuthorizationRule Rule { get; set; }

        // 被授权人ID
        [NameInMap("subject_id")]
        [Validation(Required=true)]
        public string SubjectId { get; set; }

        // 申请代理授权的参与方DID
        [NameInMap("applicant_id")]
        [Validation(Required=true)]
        public string ApplicantId { get; set; }

    }

}
