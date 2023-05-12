// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class GetRecoveryInitiatorsResponse : TeaModel {
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

        // client_version
        [NameInMap("client_version")]
        [Validation(Required=false)]
        public string ClientVersion { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // is_asyn
        [NameInMap("is_asyn")]
        [Validation(Required=false)]
        public bool? IsAsyn { get; set; }

        // is_load_test
        [NameInMap("is_load_test")]
        [Validation(Required=false)]
        public bool? IsLoadTest { get; set; }

        // is_mix
        [NameInMap("is_mix")]
        [Validation(Required=false)]
        public bool? IsMix { get; set; }

        // recovery_datasources
        [NameInMap("recovery_datasources")]
        [Validation(Required=false)]
        public List<InitiatorDatasource> RecoveryDatasources { get; set; }

        // recovery_limit
        [NameInMap("recovery_limit")]
        [Validation(Required=false)]
        public long? RecoveryLimit { get; set; }

        // thread_num
        [NameInMap("thread_num")]
        [Validation(Required=false)]
        public long? ThreadNum { get; set; }

    }

}
