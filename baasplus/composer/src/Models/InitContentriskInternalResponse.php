<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class InitContentriskInternalResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 内容ID，用于查询异步识别结果时作为查询ID
    /**
     * @var string
     */
    public $appSceneDataId;

    // 内容安全同步检测返回的事件id，用于异步获取检测结果
    /**
     * @var string
     */
    public $eventId;

    // 命中结果详情
    /**
     * @var HitDetectItems[]
     */
    public $hitDetectItems;

    // 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
    /**
     * @var string
     */
    public $needQuery;

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
    /**
     * @var string
     */
    public $resultAction;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'appSceneDataId' => 'app_scene_data_id',
        'eventId'        => 'event_id',
        'hitDetectItems' => 'hit_detect_items',
        'needQuery'      => 'need_query',
        'resultAction'   => 'result_action',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->appSceneDataId) {
            $res['app_scene_data_id'] = $this->appSceneDataId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->hitDetectItems) {
            $res['hit_detect_items'] = [];
            if (null !== $this->hitDetectItems && \is_array($this->hitDetectItems)) {
                $n = 0;
                foreach ($this->hitDetectItems as $item) {
                    $res['hit_detect_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->needQuery) {
            $res['need_query'] = $this->needQuery;
        }
        if (null !== $this->resultAction) {
            $res['result_action'] = $this->resultAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitContentriskInternalResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['app_scene_data_id'])) {
            $model->appSceneDataId = $map['app_scene_data_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['hit_detect_items'])) {
            if (!empty($map['hit_detect_items'])) {
                $model->hitDetectItems = [];
                $n                     = 0;
                foreach ($map['hit_detect_items'] as $item) {
                    $model->hitDetectItems[$n++] = null !== $item ? HitDetectItems::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['need_query'])) {
            $model->needQuery = $map['need_query'];
        }
        if (isset($map['result_action'])) {
            $model->resultAction = $map['result_action'];
        }

        return $model;
    }
}
