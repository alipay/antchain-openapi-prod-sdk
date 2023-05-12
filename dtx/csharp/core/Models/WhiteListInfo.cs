// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 白名单信息
    public class WhiteListInfo : TeaModel {
        // app_ame
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 2018-10-10T10:10:00Z
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 机房选择：0非弹机房，1弹性机房；
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
        [Validation(Required=false)]
        public string BusinessType { get; set; }

    }

}
