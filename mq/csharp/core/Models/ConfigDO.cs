// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // config
    public class ConfigDO : TeaModel {
        // key
        [NameInMap("property")]
        [Validation(Required=true)]
        public string Property { get; set; }

        // target name
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // cluster type or broker type
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public string TargetType { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
