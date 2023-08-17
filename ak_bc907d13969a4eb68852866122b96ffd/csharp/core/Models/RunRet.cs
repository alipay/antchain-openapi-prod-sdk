// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 轮询导出进度中的RunRet
    public class RunRet : TeaModel {
        // taskid
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

        // subtaskdistdt
        [NameInMap("subtaskdistdt")]
        [Validation(Required=false)]
        public string Subtaskdistdt { get; set; }

        // requestid
        [NameInMap("requestid")]
        [Validation(Required=false)]
        public string Requestid { get; set; }

        // taskname
        [NameInMap("taskname")]
        [Validation(Required=false)]
        public string Taskname { get; set; }

        // msgsenddt
        [NameInMap("msgsenddt")]
        [Validation(Required=false)]
        public string Msgsenddt { get; set; }

        // msgid
        [NameInMap("msgid")]
        [Validation(Required=false)]
        public string Msgid { get; set; }

        // resultlink
        [NameInMap("resultlink")]
        [Validation(Required=false)]
        public string Resultlink { get; set; }

    }

}
