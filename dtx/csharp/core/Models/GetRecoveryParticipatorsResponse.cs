// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class GetRecoveryParticipatorsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // action_name
        [NameInMap("action_name")]
        [Validation(Required=false)]
        public string ActionName { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 关联关系表的id，用于更新
        [NameInMap("biz_type_id")]
        [Validation(Required=false)]
        public long? BizTypeId { get; set; }

        // class_name
        [NameInMap("class_name")]
        [Validation(Required=false)]
        public string ClassName { get; set; }

        // commit_method_name
        [NameInMap("commit_method_name")]
        [Validation(Required=false)]
        public string CommitMethodName { get; set; }

        // commit_method_params_type
        [NameInMap("commit_method_params_type")]
        [Validation(Required=false)]
        public long? CommitMethodParamsType { get; set; }

        // elastic_key
        [NameInMap("elastic_key")]
        [Validation(Required=false)]
        public string ElasticKey { get; set; }

        // elastic_route_rule
        [NameInMap("elastic_route_rule")]
        [Validation(Required=false)]
        public string ElasticRouteRule { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // is_zone_route
        [NameInMap("is_zone_route")]
        [Validation(Required=false)]
        public bool? IsZoneRoute { get; set; }

        // rollback_method_name
        [NameInMap("rollback_method_name")]
        [Validation(Required=false)]
        public string RollbackMethodName { get; set; }

        // rollback_method_params_type
        [NameInMap("rollback_method_params_type")]
        [Validation(Required=false)]
        public long? RollbackMethodParamsType { get; set; }

        // test_url
        [NameInMap("test_url")]
        [Validation(Required=false)]
        public string TestUrl { get; set; }

        // unique_id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // ws_tr
        [NameInMap("ws_tr")]
        [Validation(Required=false)]
        public string WsTr { get; set; }

    }

}
