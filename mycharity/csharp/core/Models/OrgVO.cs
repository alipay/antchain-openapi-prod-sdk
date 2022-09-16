// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 机构详情结构
    public class OrgVO : TeaModel {
        // 机构ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 统一社会信用代码
        [NameInMap("unified_social_credit_code")]
        [Validation(Required=true)]
        public string UnifiedSocialCreditCode { get; set; }

        // 机构简介
        [NameInMap("introduction")]
        [Validation(Required=true)]
        public string Introduction { get; set; }

        // 签约时间
        [NameInMap("sign_time")]
        [Validation(Required=true)]
        public long? SignTime { get; set; }

        //  测试项目:0正式机构(默认),1测试机构
        [NameInMap("test_flag")]
        [Validation(Required=false)]
        public long? TestFlag { get; set; }

    }

}
