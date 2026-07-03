// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // TSM CommonCmd
    public class TsmCommonCmd : TeaModel {
        // private byte cla;
        /// <summary>
        /// <b>Example:</b>
        /// <para>00</para>
        /// </summary>
        [NameInMap("cla")]
        [Validation(Required=true)]
        public long? Cla { get; set; }

        //  host challenge data.
        /// <summary>
        /// <b>Example:</b>
        /// <para>[0,0]</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<long?> Data { get; set; }

        // private byte ins;
        /// <summary>
        /// <b>Example:</b>
        /// <para>00</para>
        /// </summary>
        [NameInMap("ins")]
        [Validation(Required=true)]
        public long? Ins { get; set; }

        //  private byte lc;
        /// <summary>
        /// <b>Example:</b>
        /// <para>lc</para>
        /// </summary>
        [NameInMap("lc")]
        [Validation(Required=true)]
        public long? Lc { get; set; }

        // private byte le = (byte) 0x00;
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("le")]
        [Validation(Required=false)]
        public long? Le { get; set; }

        // private Boolean needSecurityHandle = Boolean.TRUE;
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("need_security_handle")]
        [Validation(Required=false)]
        public bool? NeedSecurityHandle { get; set; }

        // private byte p1;
        /// <summary>
        /// <b>Example:</b>
        /// <para>00</para>
        /// </summary>
        [NameInMap("p1")]
        [Validation(Required=true)]
        public long? P1 { get; set; }

        // private byte p2 = (byte) 0x00;
        /// <summary>
        /// <b>Example:</b>
        /// <para>00</para>
        /// </summary>
        [NameInMap("p2")]
        [Validation(Required=true)]
        public long? P2 { get; set; }

    }

}
