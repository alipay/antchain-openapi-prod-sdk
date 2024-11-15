// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class CreateProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 英文名
        [NameInMap("name_en")]
        [Validation(Required=true)]
        public string NameEn { get; set; }

        // 中文名
        [NameInMap("name_cn")]
        [Validation(Required=true)]
        public string NameCn { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // zoujili.zjl
        [NameInMap("owner_id")]
        [Validation(Required=true)]
        public string OwnerId { get; set; }

        // 成员域账号，用于同步权限
        [NameInMap("member_list")]
        [Validation(Required=false)]
        public List<string> MemberList { get; set; }

    }

}
