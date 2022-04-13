// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例详细信息
    public class UnifiedAccessInstanceLocalDetailInfo : TeaModel {
        // 所属集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 所在可用区，即AZ信息
        [NameInMap("data_center")]
        [Validation(Required=true)]
        public string DataCenter { get; set; }

        // local实例详细信息显示，包含错误状态信息等
        [NameInMap("message_details")]
        [Validation(Required=false)]
        public string MessageDetails { get; set; }

        // local实例状态描述：创建中、创建成功、创建失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // vip信息
        [NameInMap("vip")]
        [Validation(Required=true)]
        public string Vip { get; set; }

        // http entry的状态
        [NameInMap("http_entry_status")]
        [Validation(Required=false)]
        public HttpEntryStatus HttpEntryStatus { get; set; }

        // https entry的状态
        [NameInMap("https_entry_status")]
        [Validation(Required=false)]
        public HttpsEntryStatus HttpsEntryStatus { get; set; }

    }

}
