// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class AddWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 0非弹机房，1弹性机房；
        [NameInMap("is_elastic")]
        [Validation(Required=true)]
        public long? IsElastic { get; set; }

        // 数据源名称
        [NameInMap("logical_ds_name")]
        [Validation(Required=true)]
        public string LogicalDsName { get; set; }

        // 业务类型
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

    }

}
