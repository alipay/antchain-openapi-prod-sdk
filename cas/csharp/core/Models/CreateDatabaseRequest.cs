// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateDatabaseRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 数据库账户
        [NameInMap("database_accounts")]
        [Validation(Required=false)]
        public List<DatabaseAccount> DatabaseAccounts { get; set; }

        // db schema
        [NameInMap("database_schema")]
        [Validation(Required=false)]
        public DatabaseSchema DatabaseSchema { get; set; }

        // db 引擎，默认为在 MYSQL
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // 引擎版本，默认为 MYSQL6
        [NameInMap("engine_version")]
        [Validation(Required=false)]
        public string EngineVersion { get; set; }

        // 创建的实例数量。默认为 1 台
        [NameInMap("instance_count")]
        [Validation(Required=false)]
        public long? InstanceCount { get; set; }

        // database 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // db 规格。
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // db 存储空间大小
        [NameInMap("storage_size")]
        [Validation(Required=true)]
        public long? StorageSize { get; set; }

        // database 类型，默认为 DATABASE 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // VPC类型的实例，需要指定虚拟交换机ID。
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

        // database 所在工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // app service ids
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // app ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

    }

}
