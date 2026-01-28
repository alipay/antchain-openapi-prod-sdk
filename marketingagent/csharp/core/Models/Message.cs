// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETINGAGENT.Models
{
    // Message is one unit of communication between client and server.
    public class Message : TeaModel {
        // Parts is the container of the message content.
        [NameInMap("parts")]
        [Validation(Required=false)]
        public List<Part> Parts { get; set; }

        // Identifies the sender of the message.
        // USER role refers to communication from the client to the server.
        // AGENT role refers to communication from the server to the client.
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
        [NameInMap("context_id")]
        [Validation(Required=false)]
        public string ContextId { get; set; }

    }

}
