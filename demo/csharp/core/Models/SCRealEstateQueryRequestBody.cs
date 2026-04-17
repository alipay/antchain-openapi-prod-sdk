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
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;cmd&quot;: {       &quot;cmdCode&quot;: &quot;SC-RealEstate-Query&quot;,       &quot;version&quot;: &quot;test_d19bd9d59915&quot;     }</para>
        /// </summary>
        [NameInMap("cmd")]
        [Validation(Required=true)]
        public Cmd Cmd { get; set; }

        // 路由信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;routeCondition&quot;: {       &quot;channelId&quot;: &quot;HZZKZTKJ&quot;     }</para>
        /// </summary>
        [NameInMap("route_condition")]
        [Validation(Required=true)]
        public RouteCondition RouteCondition { get; set; }

        // requestId
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_8c964bb7781a</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // payload
        /// <summary>
        /// <b>Example:</b>
        /// <para>{ &quot;xm&quot;: &quot;张三&quot;,   &quot;sfz&quot;: &quot;51382219970820817X&quot;}</para>
        /// </summary>
        [NameInMap("payload")]
        [Validation(Required=true)]
        public SCRealEstateQueryRequestPayload Payload { get; set; }

    }

}
