// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ERAPROD.Models
{
    public class QueryWatermarkFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资料id
        [NameInMap("datum_item_code")]
        [Validation(Required=true)]
        public string DatumItemCode { get; set; }

        // 工号
        [NameInMap("employee_no")]
        [Validation(Required=true)]
        public string EmployeeNo { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 投标资源id
        [NameInMap("tender_resource_id")]
        [Validation(Required=false)]
        public string TenderResourceId { get; set; }

    }

}
