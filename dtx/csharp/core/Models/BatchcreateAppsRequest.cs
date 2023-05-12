// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class BatchcreateAppsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 参与者数组
        [NameInMap("action_array")]
        [Validation(Required=false)]
        public List<Participator> ActionArray { get; set; }

        // 1 同库； 2 异库
        [NameInMap("activity_mode")]
        [Validation(Required=false)]
        public long? ActivityMode { get; set; }

        // app
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // Hash
        [NameInMap("db_rule_name")]
        [Validation(Required=false)]
        public string DbRuleName { get; set; }

        // xxx
        [NameInMap("db_rule_templete")]
        [Validation(Required=false)]
        public string DbRuleTemplete { get; set; }

        // 描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 编辑时传
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 发起方信息
        [NameInMap("recovery_array")]
        [Validation(Required=false)]
        public List<RecoveryDTO> RecoveryArray { get; set; }

        // 数据源数组
        [NameInMap("recovery_ds_array")]
        [Validation(Required=false)]
        public List<RecoveryDsDTO> RecoveryDsArray { get; set; }

        // hash
        [NameInMap("table_rule_name")]
        [Validation(Required=false)]
        public string TableRuleName { get; set; }

        // xxx
        [NameInMap("table_rule_templete")]
        [Validation(Required=false)]
        public string TableRuleTemplete { get; set; }

    }

}
