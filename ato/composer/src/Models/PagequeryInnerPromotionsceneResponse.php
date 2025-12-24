<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerPromotionsceneResponse extends Model
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

    // 营销场景列表
    /**
     * @var PromotionScene[]
     */
    public $promotionSceneList;

    // 记录总数量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'promotionSceneList' => 'promotion_scene_list',
        'totalCount'         => 'total_count',
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
        if (null !== $this->promotionSceneList) {
            $res['promotion_scene_list'] = [];
            if (null !== $this->promotionSceneList && \is_array($this->promotionSceneList)) {
                $n = 0;
                foreach ($this->promotionSceneList as $item) {
                    $res['promotion_scene_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerPromotionsceneResponse
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
        if (isset($map['promotion_scene_list'])) {
            if (!empty($map['promotion_scene_list'])) {
                $model->promotionSceneList = [];
                $n                         = 0;
                foreach ($map['promotion_scene_list'] as $item) {
                    $model->promotionSceneList[$n++] = null !== $item ? PromotionScene::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
