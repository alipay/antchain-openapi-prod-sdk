// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    public class ImportProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 幂等编码，需要唯一
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 所属业务线
        [NameInMap("business_line")]
        [Validation(Required=true)]
        public string BusinessLine { get; set; }

        // 所属产品线
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // pd
        [NameInMap("pds")]
        [Validation(Required=true)]
        public List<string> Pds { get; set; }

        // pd负责人
        [NameInMap("pd_leaders")]
        [Validation(Required=true)]
        public List<string> PdLeaders { get; set; }

        // 研发负责人
        [NameInMap("dev_leaders")]
        [Validation(Required=true)]
        public List<string> DevLeaders { get; set; }

        // 研发人员
        [NameInMap("devs")]
        [Validation(Required=false)]
        public List<string> Devs { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
