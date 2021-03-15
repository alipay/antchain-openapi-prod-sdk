// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthOrgStatusResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务场景码类型
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
        // 
        // [
        //   {
        //     "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfd",
        //     "orgName": "XX检查门诊-1",
        //     "orgNo": "机构编号-1",
        //     "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
        //     "status": 1
        //   },
        //   {
        //     "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfe",
        //     "orgName": "XX检查门诊-2",
        //     "orgNo": "机构编号-2",
        //     "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
        //     "status": 0
        //   }
        // ]
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<string> List { get; set; }

    }

}
