// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class InitContentriskInternalResponse : TeaModel {
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

        // 内容ID，用于查询异步识别结果时作为查询ID
        [NameInMap("app_scene_data_id")]
        [Validation(Required=false)]
        public string AppSceneDataId { get; set; }

        // 内容安全同步检测返回的事件id，用于异步获取检测结果
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 命中结果详情
        [NameInMap("hit_detect_items")]
        [Validation(Required=false)]
        public List<HitDetectItems> HitDetectItems { get; set; }

        // 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
        [NameInMap("need_query")]
        [Validation(Required=false)]
        public string NeedQuery { get; set; }

        // PASSED("数据识别通过，可以在网站上正常显示")
        // 
        // REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
        // 
        // CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")
        // 
        // DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")
        // 
        // REPLACE("替换部分词为 ***")
        // 
        // WARNING("提示数据，表示内容存在可疑，提示用户操作")
        // 
        // RECOVER("恢复数据，将误判断的内容，恢复回来")
        [NameInMap("result_action")]
        [Validation(Required=false)]
        public string ResultAction { get; set; }

    }

}
