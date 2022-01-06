// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务元信息
    public class SimpleServiceInfo : TeaModel {
        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 服务提供者列表
        [NameInMap("pub_app")]
        [Validation(Required=false)]
        public List<string> PubApp { get; set; }

        // 服务提供者数
        [NameInMap("pub_count")]
        [Validation(Required=false)]
        public long? PubCount { get; set; }

        // 服务架构类型
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

        // 消费者数
        [NameInMap("sub_count")]
        [Validation(Required=false)]
        public long? SubCount { get; set; }

        // 应用元数据
        [NameInMap("app_infos")]
        [Validation(Required=false)]
        public List<AppMetaDataModel> AppInfos { get; set; }

    }

}
