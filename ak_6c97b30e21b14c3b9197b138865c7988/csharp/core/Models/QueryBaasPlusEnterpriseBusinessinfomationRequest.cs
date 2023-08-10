// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6c97b30e21b14c3b9197b138865c7988.Models
{
    public class QueryBaasPlusEnterpriseBusinessinfomationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 00：企业名；01：注册号；02：18位统一社会信用代码；03：9位组织机构代码
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 企业查询关键字，企业名/注册号/社会信用代码/组织机构代码
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 产品场景编码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
