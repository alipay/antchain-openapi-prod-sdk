// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PullApiHaiguanasyncpollingResponse : TeaModel {
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

        // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
        [NameInMap("inst_code")]
        [Validation(Required=false)]
        public string InstCode { get; set; }

        // 请求id
        [NameInMap("biz_request_id")]
        [Validation(Required=false)]
        public string BizRequestId { get; set; }

        // 身份id，企业税号
        [NameInMap("identity_id")]
        [Validation(Required=false)]
        public string IdentityId { get; set; }

        // 数据文件地址集合，目前只会包含一个txt文件
        [NameInMap("file_list")]
        [Validation(Required=false)]
        public List<string> FileList { get; set; }

        // 解密密钥信封
        [NameInMap("secret")]
        [Validation(Required=false)]
        public string Secret { get; set; }

        // 产品类型
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 行方生成的授权编号
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 系统时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

    }

}
