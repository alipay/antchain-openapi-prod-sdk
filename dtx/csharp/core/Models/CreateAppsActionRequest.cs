// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateAppsActionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 参与者名称
        // 
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 类全名，包括完整包名
        // 
        [NameInMap("class_name")]
        [Validation(Required=true)]
        public string ClassName { get; set; }

        // 提交方法名称
        // 
        [NameInMap("commit_method_name")]
        [Validation(Required=true)]
        public string CommitMethodName { get; set; }

        // 提交方法参数
        // 
        [NameInMap("commit_method_params_type")]
        [Validation(Required=true)]
        public long? CommitMethodParamsType { get; set; }

        // 弹性key
        // 
        [NameInMap("elastic_key")]
        [Validation(Required=false)]
        public string ElasticKey { get; set; }

        // 弹性路由规则（Groovy脚本）
        // 
        [NameInMap("elastic_route_rule")]
        [Validation(Required=false)]
        public string ElasticRouteRule { get; set; }

        // 更新时需要
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 00001
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // rpc是否ldc调用
        // 
        [NameInMap("is_zone_route")]
        [Validation(Required=true)]
        public bool? IsZoneRoute { get; set; }

        // 回滚方法名称
        // 
        [NameInMap("rollback_method_name")]
        [Validation(Required=true)]
        public string RollbackMethodName { get; set; }

        // 回滚方法的参数类型
        // 
        [NameInMap("rollback_method_params_type")]
        [Validation(Required=true)]
        public long? RollbackMethodParamsType { get; set; }

        // rpc接口测试地址
        // 
        [NameInMap("test_url")]
        [Validation(Required=false)]
        public string TestUrl { get; set; }

        // rpc uniqueId
        // 
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // rpc协议，ws或tr
        // 
        [NameInMap("ws_tr")]
        [Validation(Required=true)]
        public string WsTr { get; set; }

    }

}
