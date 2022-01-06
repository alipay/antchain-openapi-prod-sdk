// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QuerySgServicepubsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // [
        //         {
        //             "gmtModified":"2019-12-12T20:58:26+08:00",
        //             "alive":true,
        //             "hostIp":"10.15.228.102",
        //             "appName":"aliyun-demo",
        //             "weight":100,
        //             "gmtCreate":"2019-12-12T20:58:26+08:00",
        //             "content":"10.15.228.96:12200?rpcVer=50303&serialization=hessian2&weight=100&timeout=3000&appName=aliyun-demo&warmupTime=0&warmupWeight=10&p=1&v=4.0&_SERIALIZETYPE=hessian2&_WEIGHT=100&_TIMEOUT=3000&app_name=aliyun-demo&startTime=1576047463993",
        //             "mosn":false,
        //             "timeout":3000,
        //             "serviceIp":"10.15.228.96",
        //             "protocol":"bolt",
        //             "instanceId":"0SGTOGOOLRD8",
        //             "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
        //             "processId":"10.15.228.102:64638",
        //             "zone":"DEFAULT_ZONE",
        //             "checkSum":"d7e0e231f57d1156fe4a4f0979231fe5",
        //             "vmMode":false,
        //             "id":969,
        //             "servicePort":12200,
        //             "status":true
        //         }
        [NameInMap("publishers")]
        [Validation(Required=false)]
        public List<Publisher> Publishers { get; set; }

        // 起始索引
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // 总条数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

    }

}
