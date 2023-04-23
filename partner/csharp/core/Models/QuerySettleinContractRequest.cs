// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class QuerySettleinContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户来源-用户租户间功能和数据隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 一级合作类型
        [NameInMap("l1_partner_type")]
        [Validation(Required=true)]
        public string L1PartnerType { get; set; }

        // 二级合作类型
        [NameInMap("l2_partner_type")]
        [Validation(Required=true)]
        public string L2PartnerType { get; set; }

        // 伙伴标准合同查询扩展选项
        [NameInMap("option")]
        [Validation(Required=false)]
        public PartnerStandardContractQueryOption Option { get; set; }

        // 合同渲染上下文，jsonString格式，key值需要提前约定好
        [NameInMap("render_context")]
        [Validation(Required=false)]
        public string RenderContext { get; set; }

    }

}
