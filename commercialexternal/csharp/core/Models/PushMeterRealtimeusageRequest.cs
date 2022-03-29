// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIALEXTERNAL.Models
{
    public class PushMeterRealtimeusageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，防重用
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=64)]
        public string RequestId { get; set; }

        // 计量域编码
        [NameInMap("domain_code")]
        [Validation(Required=true, MaxLength=128)]
        public string DomainCode { get; set; }

        // 规格编码
        [NameInMap("spec_code")]
        [Validation(Required=true, MaxLength=128)]
        public string SpecCode { get; set; }

        // 资源编码
        [NameInMap("resource_code")]
        [Validation(Required=true, MaxLength=128)]
        public string ResourceCode { get; set; }

        // 规格实例id
        [NameInMap("spec_instance_id")]
        [Validation(Required=true, MaxLength=128)]
        public string SpecInstanceId { get; set; }

        // 计量数据，json string格式字符串
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 计量数据发生时间
        [NameInMap("gmt_meter")]
        [Validation(Required=true)]
        public string GmtMeter { get; set; }

    }

}
