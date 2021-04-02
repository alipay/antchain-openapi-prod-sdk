// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // TSM CommonCmd
    public class TsmCommonCmd : TeaModel {
        // private byte cla;
        [NameInMap("cla")]
        [Validation(Required=true)]
        public long? Cla { get; set; }

        //  host challenge data.
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<long?> Data { get; set; }

        // private byte ins;
        [NameInMap("ins")]
        [Validation(Required=true)]
        public long? Ins { get; set; }

        //  private byte lc;
        [NameInMap("lc")]
        [Validation(Required=true)]
        public long? Lc { get; set; }

        // private byte le = (byte) 0x00;
        [NameInMap("le")]
        [Validation(Required=false)]
        public long? Le { get; set; }

        // private Boolean needSecurityHandle = Boolean.TRUE;
        [NameInMap("need_security_handle")]
        [Validation(Required=false)]
        public bool? NeedSecurityHandle { get; set; }

        // private byte p1;
        [NameInMap("p1")]
        [Validation(Required=true)]
        public long? P1 { get; set; }

        // private byte p2 = (byte) 0x00;
        [NameInMap("p2")]
        [Validation(Required=true)]
        public long? P2 { get; set; }

    }

}
