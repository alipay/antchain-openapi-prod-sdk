// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 角色企业Map信息
    public class RoleOrganization : TeaModel {
        // 企业编号
        [NameInMap("company_no")]
        [Validation(Required=true)]
        public string CompanyNo { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 角色编码
        // 角色编码类型
        // 风险承担方：RISK_TAKER
        // 货物监管方：CARGO_SUPERVISION
        // 资金推荐方：CAPITAL_RECOMMEND
        // 融资推荐方：FUNDER_RECOMMEND
        // 运营管理方：MANAGEMENT
        // 技术支持方：TECHNICAL
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

    }

}
