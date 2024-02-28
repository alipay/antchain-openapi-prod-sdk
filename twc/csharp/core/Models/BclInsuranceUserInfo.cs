// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁宝plus用户信息
    public class BclInsuranceUserInfo : TeaModel {
        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 保险用户类型：
        // HOLDER_ORG: 投保人（机构）
        // INSURED_ORG: 被保人（机构）
        // INSURANCE_ORG: 保司（机构）
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 证件号名称:
        // USCC，社会统一信用代码，目前仅支持
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 证件号码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 联系地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 联系方式
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 邮件地址
        [NameInMap("mail")]
        [Validation(Required=true)]
        public string Mail { get; set; }

    }

}
