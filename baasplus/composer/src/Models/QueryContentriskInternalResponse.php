<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryContentriskInternalResponse extends Model
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

    // 命中结果详情
    /**
     * @var HitDetectItems[]
     */
    public $hitDetectItems;

    // PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
    /**
     * @var string
     */
    public $resultAction;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'hitDetectItems' => 'hit_detect_items',
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
        if (null !== $this->hitDetectItems) {
            $res['hit_detect_items'] = [];
            if (null !== $this->hitDetectItems && \is_array($this->hitDetectItems)) {
                $n = 0;
                foreach ($this->hitDetectItems as $item) {
                    $res['hit_detect_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resultAction) {
            $res['result_action'] = $this->resultAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContentriskInternalResponse
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
        if (isset($map['hit_detect_items'])) {
            if (!empty($map['hit_detect_items'])) {
                $model->hitDetectItems = [];
                $n                     = 0;
                foreach ($map['hit_detect_items'] as $item) {
                    $model->hitDetectItems[$n++] = null !== $item ? HitDetectItems::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_action'])) {
            $model->resultAction = $map['result_action'];
        }

        return $model;
    }
}
