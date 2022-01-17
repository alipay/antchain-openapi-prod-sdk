// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateDisDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 个人身份证号。当组织类型为个人时，此字段为必填项
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 企业名称。当组织类型为企业时，此字段为必填项
        [NameInMap("ep_cert_name")]
        [Validation(Required=false)]
        public string EpCertName { get; set; }

        // 企业信用号码。当组织类型为企业时，此字段为必填项
        [NameInMap("ep_cert_no")]
        [Validation(Required=false)]
        public string EpCertNo { get; set; }

        // 扩展字段
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 个人手机号码。当组织类型为个人时，此字段为必填项
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 个人姓名。当组织类型为个人时，此字段为必填项
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 组织类型。企业或者个人，二选一填入
        [NameInMap("organization_type")]
        [Validation(Required=true)]
        public string OrganizationType { get; set; }

        // 所属平台did。如果为空时，表示创建根平台，允许申请网络货运平台或者3pl角色。创建除根平台外的其他身份时，所属平台did必须填写。
        [NameInMap("platform_did")]
        [Validation(Required=false)]
        public string PlatformDid { get; set; }

        // 角色类型。
        // 当组织类型为个人时，可填角色：货主、司机、承运商；
        // 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商、托盘方
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public string RoleType { get; set; }

    }

}
