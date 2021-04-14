// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractOrganizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
        // ）返回的accountId
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 企业法人名称
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 企业法人证件号
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
