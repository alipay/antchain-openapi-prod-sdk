// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqAdminapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否显示创建接口
        [NameInMap("show_create")]
        [Validation(Required=false)]
        public bool? ShowCreate { get; set; }

        // 是否显示删除接口
        [NameInMap("show_delete")]
        [Validation(Required=false)]
        public bool? ShowDelete { get; set; }

        // 是否显示查询接口
        [NameInMap("show_retrieve")]
        [Validation(Required=false)]
        public bool? ShowRetrieve { get; set; }

        // 是否显示更新接口
        [NameInMap("show_update")]
        [Validation(Required=false)]
        public bool? ShowUpdate { get; set; }

        // 是否显示操作类接口
        [NameInMap("show_operation")]
        [Validation(Required=false)]
        public bool? ShowOperation { get; set; }

    }

}
