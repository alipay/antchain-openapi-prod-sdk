// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class QueryOperatorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 企业ID
        [NameInMap("customer")]
        [Validation(Required=true)]
        public string Customer { get; set; }

        // 当前页，默认值为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认值为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 租户唯一标识
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 部门唯一码
        [NameInMap("department_code")]
        [Validation(Required=false)]
        public string DepartmentCode { get; set; }

    }

}
