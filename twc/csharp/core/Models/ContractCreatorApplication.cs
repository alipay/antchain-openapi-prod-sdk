// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 更新后平台方经办人信息
    public class ContractCreatorApplication : TeaModel {
        // 邮箱地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 创建人ID
        [NameInMap("creator_id")]
        [Validation(Required=true)]
        public string CreatorId { get; set; }

    }

}
