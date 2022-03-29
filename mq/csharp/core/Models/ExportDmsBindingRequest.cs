// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ExportDmsBindingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public string Ids { get; set; }

        // field
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // order
        [NameInMap("order")]
        [Validation(Required=false)]
        public string Order { get; set; }

        // appname
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // groupid
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=false)]
        public string Eventcode { get; set; }

    }

}
