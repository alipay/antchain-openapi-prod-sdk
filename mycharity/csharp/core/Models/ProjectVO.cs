// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 项目详情
    public class ProjectVO : TeaModel {
        // 公益项目ID
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

        // 公益项目名称
        [NameInMap("pj_name")]
        [Validation(Required=true)]
        public string PjName { get; set; }

        // 机构ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 公益方向
        [NameInMap("public_welfare_direction")]
        [Validation(Required=true)]
        public string PublicWelfareDirection { get; set; }

        // 测试项目:0正式项目(默认),1测试项目
        [NameInMap("test_flag")]
        [Validation(Required=false)]
        public long? TestFlag { get; set; }

    }

}
