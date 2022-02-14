// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJusticeBasecaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 针对案件信息查询的索引方式，01为根据案件caseID索引，02为根据申请人的统一社会信用代码与业务订单号进行索引
        [NameInMap("index_method")]
        [Validation(Required=true)]
        public string IndexMethod { get; set; }

        // 纠纷处理平台后台唯一的caseID 当索引方式为01时必填
        [NameInMap("case_id")]
        [Validation(Required=false)]
        public string CaseId { get; set; }

        // 案件申请人（企业）的统一社会信用代码 当索引方式为02时必填
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 案件的业务订单ID 当索引方式为02时必填
        [NameInMap("business_number")]
        [Validation(Required=false)]
        public string BusinessNumber { get; set; }

    }

}
