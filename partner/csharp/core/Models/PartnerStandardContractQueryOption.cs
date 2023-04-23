// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方标准合同查询扩展选项
    public class PartnerStandardContractQueryOption : TeaModel {
        // 是否渲染
        [NameInMap("render_contract")]
        [Validation(Required=true)]
        public bool? RenderContract { get; set; }

        // 合同渲染上下文，jsonString格式，key值需要提前约定好	
        // 
        [NameInMap("render_context")]
        [Validation(Required=true)]
        public string RenderContext { get; set; }

    }

}
