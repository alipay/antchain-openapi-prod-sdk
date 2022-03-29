// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // WhitelistDO
    public class WhitelistDO : TeaModel {
        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // groupid
        [NameInMap("groupid")]
        [Validation(Required=true)]
        public string Groupid { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

    }

}
