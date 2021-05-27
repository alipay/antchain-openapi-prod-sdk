// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateCmportProfitpartnerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业编号
        [NameInMap("company_no")]
        [Validation(Required=true)]
        public string CompanyNo { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 组织类别
        [NameInMap("organization_category")]
        [Validation(Required=true)]
        public string OrganizationCategory { get; set; }

        // 角色编号对应组织信息
        // 组织对应角色编码：
        // 风险承担方：RISK_TAKER
        // 货物监管方：CARGO_SUPERVISION
        // 资金推荐方：CAPITAL_RECOMMEND
        // 融资推荐方：FUNDER_RECOMMEND
        // 运营管理方：MANAGEMENT
        // 技术支持方：TECHNICAL
        [NameInMap("role_organization_list")]
        [Validation(Required=true)]
        public List<RoleOrganization> RoleOrganizationList { get; set; }

    }

}
