// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class NotifyPullstrategyChangestatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 运营商标识
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 加密后的核心数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
        [NameInMap("time_stamp")]
        [Validation(Required=true)]
        public string TimeStamp { get; set; }

        // 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
        [NameInMap("seq")]
        [Validation(Required=true)]
        public string Seq { get; set; }

        // 参数签名，原文为operatorId+data+timeStamp+seq
        [NameInMap("sig")]
        [Validation(Required=true)]
        public string Sig { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 数据模型ID，用于校验data原文数据
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

    }

}
