// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 邮箱地址，默认空	
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
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

        // 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
