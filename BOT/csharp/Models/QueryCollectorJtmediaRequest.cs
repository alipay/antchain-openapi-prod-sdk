// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryCollectorJtmediaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 异常事件ID，由告警事件标识生成，在blockchain.bot.collector.jtflux.query接口中可获取
        [NameInMap("alarm_event_id")]
        [Validation(Required=true)]
        public string AlarmEventId { get; set; }

        // 异常事件媒体文件ID列表
        [NameInMap("media_id_list")]
        [Validation(Required=false)]
        public List<string> MediaIdList { get; set; }

    }

}
