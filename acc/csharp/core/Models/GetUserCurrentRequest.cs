// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class GetUserCurrentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 不传默认是 BASE_INFO
        // BASE_INFO 基本信息
        // ORG_CERT_FILE 企业图片
        // LP_CERT_FILE 法人图片
        [NameInMap("query_options")]
        [Validation(Required=false)]
        public List<string> QueryOptions { get; set; }

        // 企业用户userId
        [NameInMap("firm_user_id")]
        [Validation(Required=false)]
        public long? FirmUserId { get; set; }

    }

}
