// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class DeleteDevicecorpThingmodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要删除的属性标识符列表
        [NameInMap("property_identifier")]
        [Validation(Required=false)]
        public List<string> PropertyIdentifier { get; set; }

        // 需要删除的服务标识符列表
        [NameInMap("service_identifier")]
        [Validation(Required=false)]
        public List<string> ServiceIdentifier { get; set; }

        // 需要删除的事件标识符列表
        [NameInMap("event_identifier")]
        [Validation(Required=false)]
        public List<string> EventIdentifier { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

    }

}
