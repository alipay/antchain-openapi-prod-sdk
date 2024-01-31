// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PullApiSimpleauthmarkResponse : TeaModel {
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

        // 拉取推送系统时间
        [NameInMap("timestamp")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Timestamp { get; set; }

        // 请求id，幂等控制
        [NameInMap("biz_unique_id")]
        [Validation(Required=false)]
        public string BizUniqueId { get; set; }

        // 调用的租户
        [NameInMap("inst_code")]
        [Validation(Required=false)]
        public string InstCode { get; set; }

        // oss文件的域名地址
        // 测试环境域名：http://invoice-oss-sit.oss-cn-hangzhou.aliyuncs.com
        // 生产环境域名：http://invoice-commercial-prod.oss-cn-hangzhou.aliyuncs.com
        // 端口是默认的80
        [NameInMap("result_list")]
        [Validation(Required=false)]
        public List<string> ResultList { get; set; }

        // 解密的秘钥
        [NameInMap("secret")]
        [Validation(Required=false)]
        public string Secret { get; set; }

    }

}
