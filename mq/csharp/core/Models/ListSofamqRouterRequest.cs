// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqRouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标单元
        [NameInMap("destination_cell")]
        [Validation(Required=false)]
        public string DestinationCell { get; set; }

        // 目标实例 ID
        [NameInMap("destination_instance_id")]
        [Validation(Required=true)]
        public string DestinationInstanceId { get; set; }

        // 目标 Topic
        [NameInMap("destination_topic")]
        [Validation(Required=false)]
        public string DestinationTopic { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 源单元
        [NameInMap("source_cell")]
        [Validation(Required=false)]
        public string SourceCell { get; set; }

        // 源实例 ID
        [NameInMap("source_instance_id")]
        [Validation(Required=true)]
        public string SourceInstanceId { get; set; }

        // 源 Topic
        [NameInMap("source_topic")]
        [Validation(Required=false)]
        public string SourceTopic { get; set; }

    }

}
