// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 角色对应分润比例
    public class RoleRatio : TeaModel {
        // 角色编号
        // 角色编号类型
        // 风险承担方：RISK_TAKER
        // 货物监管方：CARGO_SUPERVISION
        // 资金推荐方：CAPITAL_RECOMMEND
        // 融资推荐方：FUNDER_RECOMMEND
        // 运营管理方：MANAGEMENT
        // 技术支持方：TECHNICAL
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

        // 分润比例，保留两位小数的百分比
        [NameInMap("ratio")]
        [Validation(Required=true)]
        public string Ratio { get; set; }

    }

}
