<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerSceneproductResponse extends Model
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

    // 总条数
    /**
     * @var int
     */
    public $totalCount;

    // 场景添加商品数
    /**
     * @var int
     */
    public $addedSceneProductCount;

    // 场景产品列表
    /**
     * @var SceneProductInfoResp[]
     */
    public $sceneProductInfoList;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'totalCount'             => 'total_count',
        'addedSceneProductCount' => 'added_scene_product_count',
        'sceneProductInfoList'   => 'scene_product_info_list',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->addedSceneProductCount) {
            $res['added_scene_product_count'] = $this->addedSceneProductCount;
        }
        if (null !== $this->sceneProductInfoList) {
            $res['scene_product_info_list'] = [];
            if (null !== $this->sceneProductInfoList && \is_array($this->sceneProductInfoList)) {
                $n = 0;
                foreach ($this->sceneProductInfoList as $item) {
                    $res['scene_product_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerSceneproductResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['added_scene_product_count'])) {
            $model->addedSceneProductCount = $map['added_scene_product_count'];
        }
        if (isset($map['scene_product_info_list'])) {
            if (!empty($map['scene_product_info_list'])) {
                $model->sceneProductInfoList = [];
                $n                           = 0;
                foreach ($map['scene_product_info_list'] as $item) {
                    $model->sceneProductInfoList[$n++] = null !== $item ? SceneProductInfoResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
