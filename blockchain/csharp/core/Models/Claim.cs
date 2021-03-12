// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 申请用户授权的目标可验证声明内容、过期时间等配置
    public class Claim : TeaModel {
        // 一个json的string，内容包含具体需要的声明，不同业务场景不同。
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        [NameInMap("claim_type")]
        [Validation(Required=false)]
        public string ClaimType { get; set; }

        // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
