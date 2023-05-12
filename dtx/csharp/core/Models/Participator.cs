// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 参与者信息
    public class Participator : TeaModel {
        // 参与者名称
        [NameInMap("action_name")]
        [Validation(Required=false)]
        public string ActionName { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 类全名，包括完整包名
        [NameInMap("class_name")]
        [Validation(Required=false)]
        public string ClassName { get; set; }

        // 提交方法名称
        [NameInMap("commit_method_name")]
        [Validation(Required=false)]
        public string CommitMethodName { get; set; }

        // 提交方法参数
        [NameInMap("commit_method_params_type")]
        [Validation(Required=false)]
        public long? CommitMethodParamsType { get; set; }

        // 弹性key
        [NameInMap("elastic_key")]
        [Validation(Required=false)]
        public string ElasticKey { get; set; }

        // 弹性路由规则（Groovy脚本）
        [NameInMap("elastic_route_rule")]
        [Validation(Required=false)]
        public string ElasticRouteRule { get; set; }

        // 记录id，更新必传
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // rpc是否ldc调用
        [NameInMap("is_zone_route")]
        [Validation(Required=false)]
        public bool? IsZoneRoute { get; set; }

        // 回滚方法名称
        [NameInMap("rollback_method_name")]
        [Validation(Required=false)]
        public string RollbackMethodName { get; set; }

        // 回滚方法的参数类型
        [NameInMap("rollback_method_params_type")]
        [Validation(Required=false)]
        public long? RollbackMethodParamsType { get; set; }

        // rpc接口测试地址
        [NameInMap("test_url")]
        [Validation(Required=false)]
        public string TestUrl { get; set; }

        // rpc uniqueId
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // 是否被使用
        [NameInMap("used")]
        [Validation(Required=false)]
        public bool? Used { get; set; }

        // rpc协议，ws或tr
        [NameInMap("ws_tr")]
        [Validation(Required=false)]
        public string WsTr { get; set; }

    }

}
