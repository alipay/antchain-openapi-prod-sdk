// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class VerifyAuthBusinessUserResponse : TeaModel {
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

        // 用户当前记录状态
        [NameInMap("record_type")]
        [Validation(Required=false)]
        public string RecordType { get; set; }

        // 加密后的用户授权记录id
        [NameInMap("encrypt_biz_id")]
        [Validation(Required=false)]
        public string EncryptBizId { get; set; }

        // 授权协议信息列表
        [NameInMap("agreement_config_info_list")]
        [Validation(Required=false)]
        public List<AgreementConfigInfoDTO> AgreementConfigInfoList { get; set; }

    }

}
