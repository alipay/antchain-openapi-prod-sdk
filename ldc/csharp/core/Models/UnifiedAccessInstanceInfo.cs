// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例信息
    public class UnifiedAccessInstanceInfo : TeaModel {
        // 统一接入实例创建的时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
        [NameInMap("spanner_cluster")]
        [Validation(Required=true)]
        public string SpannerCluster { get; set; }

        // 关联的应用服务信息
        [NameInMap("unified_access_instance_container_service_infos")]
        [Validation(Required=false)]
        public List<UnifiedAccessInstanceContainerServiceInfo> UnifiedAccessInstanceContainerServiceInfos { get; set; }

        // https协议配置
        [NameInMap("unified_access_instance_https_entry")]
        [Validation(Required=false)]
        public HttpsEntry UnifiedAccessInstanceHttpsEntry { get; set; }

        // http协议配置
        [NameInMap("unified_access_instance_http_entry")]
        [Validation(Required=true)]
        public HttpEntry UnifiedAccessInstanceHttpEntry { get; set; }

        // 统一接入实例ID
        [NameInMap("unified_access_instance_id")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceId { get; set; }

        // 本地集群详细信息
        [NameInMap("unified_access_instance_local_detail_infos")]
        [Validation(Required=true)]
        public List<UnifiedAccessInstanceLocalDetailInfo> UnifiedAccessInstanceLocalDetailInfos { get; set; }

        // 统一接入实例详细信息显示，包含错误状态信息等
        [NameInMap("unified_access_instance_message_details")]
        [Validation(Required=false)]
        public string UnifiedAccessInstanceMessageDetails { get; set; }

        // 统一接入实例名称
        [NameInMap("unified_access_instance_name")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceName { get; set; }

        // 统一接入实例状态描述：创建中、创建成功、创建失败
        [NameInMap("unified_access_instance_status")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceStatus { get; set; }

        // 统一接入实例网络类型，内网（intranet），公网（internet）
        [NameInMap("unified_access_instance_type")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceType { get; set; }

        // custom模式下，用户自定义entryId以及entryVip信息
        [NameInMap("entry_settings")]
        [Validation(Required=false)]
        public EntrySettings EntrySettings { get; set; }

    }

}
