// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用负责人
    public class AppOwner : TeaModel {
        // 研发负责人
        [NameInMap("dev_owner")]
        [Validation(Required=false)]
        public UserInfo DevOwner { get; set; }

        // backup开发人员
        [NameInMap("backup_dev_owners")]
        [Validation(Required=false)]
        public List<UserInfo> BackupDevOwners { get; set; }

        // 测试负责人
        [NameInMap("test_owner")]
        [Validation(Required=false)]
        public UserInfo TestOwner { get; set; }

        // 备用测试人员
        [NameInMap("backup_test_owners")]
        [Validation(Required=false)]
        public List<UserInfo> BackupTestOwners { get; set; }

        // 运维负责人
        [NameInMap("ops")]
        [Validation(Required=false)]
        public UserInfo Ops { get; set; }

        // 备用SRE人员
        [NameInMap("backup_opses")]
        [Validation(Required=false)]
        public List<UserInfo> BackupOpses { get; set; }

        // 开发architect负责人
        [NameInMap("dev_architect")]
        [Validation(Required=false)]
        public UserInfo DevArchitect { get; set; }

        // 备用Architects联系人
        [NameInMap("backup_dev_architects")]
        [Validation(Required=false)]
        public List<UserInfo> BackupDevArchitects { get; set; }

        // 测试architect
        [NameInMap("test_architect")]
        [Validation(Required=false)]
        public UserInfo TestArchitect { get; set; }

        // 备用测试architects
        [NameInMap("backup_test_architects")]
        [Validation(Required=false)]
        public List<UserInfo> BackupTestArchitects { get; set; }

    }

}
