// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyMktserviceproviderAudiencecircleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，每一次请求保持唯一；
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 业务场景标识
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 加密类型，MD5 32位小写
        [NameInMap("encryption_type")]
        [Validation(Required=true)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_ids")]
        [Validation(Required=true)]
        public List<string> EncryptedUserIds { get; set; }

    }

}
