// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 智能合同个人账户创建申请信息
    public class ContractAccountApplication : TeaModel {
        // 邮箱地址，默认空
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 手机号码，默认空
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 用户唯一标识，可传入第三方平台的个人用户id等
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
