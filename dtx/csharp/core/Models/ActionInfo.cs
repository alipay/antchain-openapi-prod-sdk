// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 参与者信息
    public class ActionInfo : TeaModel {
        // action_mode
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public string ActionMode { get; set; }

        // action_name
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // commit
        [NameInMap("commit")]
        [Validation(Required=true)]
        public string Commit { get; set; }

        // rollback
        [NameInMap("rollback")]
        [Validation(Required=true)]
        public string Rollback { get; set; }

        // ws_tr
        [NameInMap("ws_tr")]
        [Validation(Required=true)]
        public string WsTr { get; set; }

    }

}
