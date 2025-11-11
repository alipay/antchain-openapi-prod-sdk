// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class ListAuthConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权企业信用代码
        [NameInMap("enterprise_code")]
        [Validation(Required=false)]
        public string EnterpriseCode { get; set; }

        // 业务应用名称
        [NameInMap("auth_app_name")]
        [Validation(Required=false)]
        public string AuthAppName { get; set; }

        // 产品code列表
        [NameInMap("product_code_list")]
        [Validation(Required=false)]
        public List<string> ProductCodeList { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
