// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 账户映射的具体信息
    public class AccountMap : TeaModel {
        // 要映射的链对应的唯一id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
        [NameInMap("entity_info_type")]
        [Validation(Required=false)]
        public long? EntityInfoType { get; set; }

        // 对应entity_info_type的具体值
        // 
        [NameInMap("entity_info_value")]
        [Validation(Required=false)]
        public string EntityInfoValue { get; set; }

        // 账户对应实体的全名
        [NameInMap("full_name")]
        [Validation(Required=false)]
        public string FullName { get; set; }

        // 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 希望映射后在链上的账户名
        [NameInMap("target_name")]
        [Validation(Required=false)]
        public string TargetName { get; set; }

        // 该账户对应实体的类型：0， 个人； 1， 企业
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 自有系统中该账户的唯一标示
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

    }

}
