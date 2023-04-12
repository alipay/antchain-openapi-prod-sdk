// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadTrafficOperatelogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通过trace_id生成接口生成的trace_id
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 事件时间
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 当前页面类型标记 
        [NameInMap("page_flag")]
        [Validation(Required=true)]
        public string PageFlag { get; set; }

        // 行为标记
        [NameInMap("action_flag")]
        [Validation(Required=true)]
        public string ActionFlag { get; set; }

        // 当前页面地址
        [NameInMap("cur_url")]
        [Validation(Required=true)]
        public string CurUrl { get; set; }

        // 事件对应位置编码
        [NameInMap("position_no")]
        [Validation(Required=true)]
        public string PositionNo { get; set; }

        // 商品标识
        [NameInMap("item_id")]
        [Validation(Required=false)]
        public string ItemId { get; set; }

        // 店铺标识
        [NameInMap("shop_id")]
        [Validation(Required=false)]
        public string ShopId { get; set; }

        // 上一跳页面地址
        [NameInMap("pre_url")]
        [Validation(Required=false)]
        public string PreUrl { get; set; }

        // 渠道说明
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 当前广告位级别
        [NameInMap("ad_space_level")]
        [Validation(Required=false)]
        public string AdSpaceLevel { get; set; }

        // 人群组标签ID
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

    }

}
