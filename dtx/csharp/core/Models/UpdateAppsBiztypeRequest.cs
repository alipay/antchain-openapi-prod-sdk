// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class UpdateAppsBiztypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // client_version
        [NameInMap("client_version")]
        [Validation(Required=true)]
        public string ClientVersion { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // is_asyn
        [NameInMap("is_asyn")]
        [Validation(Required=true)]
        public bool? IsAsyn { get; set; }

        // is_load_test
        [NameInMap("is_load_test")]
        [Validation(Required=true)]
        public bool? IsLoadTest { get; set; }

        // is_mix
        [NameInMap("is_mix")]
        [Validation(Required=true)]
        public bool? IsMix { get; set; }

        // participators
        [NameInMap("participators")]
        [Validation(Required=true)]
        public List<Participator> Participators { get; set; }

        // recovery_datasources
        [NameInMap("recovery_datasources")]
        [Validation(Required=true)]
        public List<InitiatorDatasource> RecoveryDatasources { get; set; }

        // recovery_limit
        [NameInMap("recovery_limit")]
        [Validation(Required=true)]
        public long? RecoveryLimit { get; set; }

        // recovery_thread_num
        [NameInMap("recovery_thread_num")]
        [Validation(Required=true)]
        public long? RecoveryThreadNum { get; set; }

    }

}
