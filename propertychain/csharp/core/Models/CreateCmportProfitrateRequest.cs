// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateCmportProfitrateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品编号
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 金融机构编号
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 金融机构名称
        [NameInMap("financial_name")]
        [Validation(Required=true)]
        public string FinancialName { get; set; }

        // 各方分润比例
        // 对应角色编码类型：
        // 风险承担方：RISK_TAKER
        // 货物监管方：CARGO_SUPERVISION
        // 资金推荐方：CAPITAL_RECOMMEND
        // 融资推荐方：FUNDER_RECOMMEND
        // 运营管理方：MANAGEMENT
        // 技术支持方：TECHNICAL
        [NameInMap("role_ratio")]
        [Validation(Required=true)]
        public List<RoleRatio> RoleRatio { get; set; }

    }

}
