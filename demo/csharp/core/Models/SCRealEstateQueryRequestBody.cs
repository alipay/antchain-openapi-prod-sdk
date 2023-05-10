// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // SCRealEstateQueryRequestBody
    public class SCRealEstateQueryRequestBody : TeaModel {
        // cmd
        [NameInMap("cmd")]
        [Validation(Required=true)]
        public Cmd Cmd { get; set; }

        // 路由信息
        [NameInMap("route_condition")]
        [Validation(Required=true)]
        public RouteCondition RouteCondition { get; set; }

        // requestId
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // payload
        [NameInMap("payload")]
        [Validation(Required=true)]
        public SCRealEstateQueryRequestPayload Payload { get; set; }

    }

}
