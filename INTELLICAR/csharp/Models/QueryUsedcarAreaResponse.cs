// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryUsedcarAreaResponse : TeaModel {
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

        // 响应码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 响应信息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 省份集合
        [NameInMap("province")]
        [Validation(Required=false)]
        public List<Province> Province { get; set; }

        // 城市集合
        [NameInMap("city")]
        [Validation(Required=false)]
        public List<City> City { get; set; }

        // 区县集合
        [NameInMap("county")]
        [Validation(Required=false)]
        public List<County> County { get; set; }

    }

}
