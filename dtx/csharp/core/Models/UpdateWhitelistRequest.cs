// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class UpdateWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 0非弹机房，1弹性机房；
        [NameInMap("is_elastic")]
        [Validation(Required=true)]
        public long? IsElastic { get; set; }

        // 0正常流量，1影子流量；
        [NameInMap("is_load_test")]
        [Validation(Required=true)]
        public long? IsLoadTest { get; set; }

        // 数据源名称
        [NameInMap("logical_ds_name")]
        [Validation(Required=true)]
        public string LogicalDsName { get; set; }

        // business_type
        [NameInMap("business_type")]
        [Validation(Required=true)]
        public string BusinessType { get; set; }

    }

}
