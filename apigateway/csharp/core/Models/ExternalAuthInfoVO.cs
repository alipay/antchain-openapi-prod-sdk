// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 外部授权信息
    public class ExternalAuthInfoVO : TeaModel {
        // 绑定api数量
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 缓存开关
        [NameInMap("cache_switch")]
        [Validation(Required=false)]
        public string CacheSwitch { get; set; }

        // 缓存时间
        [NameInMap("cache_ttl")]
        [Validation(Required=false)]
        public long? CacheTtl { get; set; }

        // 能否删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 外部系统标识
        [NameInMap("external_auth_id")]
        [Validation(Required=false)]
        public string ExternalAuthId { get; set; }

        // 外部授权名称
        [NameInMap("external_auth_name")]
        [Validation(Required=false)]
        public string ExternalAuthName { get; set; }

        // 	
        // 方法名
        [NameInMap("function_name")]
        [Validation(Required=false)]
        public string FunctionName { get; set; }

        // 	
        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 	
        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 后端接口名
        [NameInMap("interface_name")]
        [Validation(Required=false)]
        public string InterfaceName { get; set; }

        // 请求方法
        [NameInMap("method")]
        [Validation(Required=false)]
        public string Method { get; set; }

        // operationtype
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 		
        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 外部api参数
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<ApiParamVO> Params { get; set; }

        // 路由标识
        [NameInMap("router_id")]
        [Validation(Required=false)]
        public string RouterId { get; set; }

        // 路由规则
        [NameInMap("router_info")]
        [Validation(Required=false)]
        public RouterInfoVO RouterInfo { get; set; }

        // 路由策略类型
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // SystemClusterVO
        [NameInMap("system_cluster")]
        [Validation(Required=false)]
        public SystemClusterVO SystemCluster { get; set; }

        // 系统集群标识
        [NameInMap("sys_id")]
        [Validation(Required=false)]
        public string SysId { get; set; }

        // 	
        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // timeout
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // 服务标识
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // 后端路径
        [NameInMap("upstream_path")]
        [Validation(Required=false)]
        public string UpstreamPath { get; set; }

        // 后端协议类型
        [NameInMap("upstream_protocol")]
        [Validation(Required=false)]
        public string UpstreamProtocol { get; set; }

        // 后端服务类型
        [NameInMap("upstream_type")]
        [Validation(Required=false)]
        public string UpstreamType { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
