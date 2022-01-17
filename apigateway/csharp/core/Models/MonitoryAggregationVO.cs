// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // MonitoryAggregationVO
    public class MonitoryAggregationVO : TeaModel {
        // invoke_num
        [NameInMap("invoke_num")]
        [Validation(Required=false)]
        public List<MonitorData> InvokeNum { get; set; }

        // qps
        [NameInMap("qps")]
        [Validation(Required=false)]
        public List<MonitorData> Qps { get; set; }

        // rt
        [NameInMap("rt")]
        [Validation(Required=false)]
        public List<MonitorData> Rt { get; set; }

        // 错误码
        [NameInMap("err_code")]
        [Validation(Required=false)]
        public List<MonitorData> ErrCode { get; set; }

        // 错误率
        [NameInMap("err_rate")]
        [Validation(Required=false)]
        public List<MonitorData> ErrRate { get; set; }

        // byte_in
        [NameInMap("byte_in")]
        [Validation(Required=false)]
        public List<MonitorData> ByteIn { get; set; }

        // byte_out
        [NameInMap("byte_out")]
        [Validation(Required=false)]
        public List<MonitorData> ByteOut { get; set; }

    }

}
