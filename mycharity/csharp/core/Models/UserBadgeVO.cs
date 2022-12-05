// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 用户徽章详细信息
    public class UserBadgeVO : TeaModel {
        // 用户徽章id
        [NameInMap("poap_id")]
        [Validation(Required=false)]
        public string PoapId { get; set; }

        // 徽章hash
        [NameInMap("poap_id_hash")]
        [Validation(Required=false)]
        public string PoapIdHash { get; set; }

        // 徽章图片
        [NameInMap("logo_url")]
        [Validation(Required=false)]
        public string LogoUrl { get; set; }

        // 徽章名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 徽章简介
        [NameInMap("introduction")]
        [Validation(Required=false)]
        public string Introduction { get; set; }

        // 品牌商名称
        [NameInMap("brands_name")]
        [Validation(Required=false)]
        public string BrandsName { get; set; }

        // 公益机构名称
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

    }

}
