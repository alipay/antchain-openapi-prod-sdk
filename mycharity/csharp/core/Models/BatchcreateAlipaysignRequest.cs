// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class BatchcreateAlipaysignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构id
        [NameInMap("org_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrgId { get; set; }

        // 代扣签约账号信息列表
        [NameInMap("sign_user_info_list")]
        [Validation(Required=true)]
        public List<SignUserInfo> SignUserInfoList { get; set; }

    }

}
