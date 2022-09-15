// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class CreateProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 50字符，单平台幂等
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 50字符 机构id
        [NameInMap("org_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrgId { get; set; }

        // 100字符 项目名称
        [NameInMap("pj_name")]
        [Validation(Required=true, MaxLength=100)]
        public string PjName { get; set; }

        // 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
        [NameInMap("public_welfare_direction")]
        [Validation(Required=true, MaxLength=64)]
        public string PublicWelfareDirection { get; set; }

        // 测试项目说明:0正式项目(默认),1测试项目
        [NameInMap("test_flag")]
        [Validation(Required=false)]
        public long? TestFlag { get; set; }

    }

}
