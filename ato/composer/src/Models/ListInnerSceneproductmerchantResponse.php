<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ListInnerSceneproductmerchantResponse extends Model
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

    // 场景商品适用商家列表
    /**
     * @var ApplySceneProductMerchantInfo[]
     */
    public $applySceneProductMerchantList;
    protected $_name = [
        'reqMsgId'                      => 'req_msg_id',
        'resultCode'                    => 'result_code',
        'resultMsg'                     => 'result_msg',
        'applySceneProductMerchantList' => 'apply_scene_product_merchant_list',
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
        if (null !== $this->applySceneProductMerchantList) {
            $res['apply_scene_product_merchant_list'] = [];
            if (null !== $this->applySceneProductMerchantList && \is_array($this->applySceneProductMerchantList)) {
                $n = 0;
                foreach ($this->applySceneProductMerchantList as $item) {
                    $res['apply_scene_product_merchant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListInnerSceneproductmerchantResponse
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
        if (isset($map['apply_scene_product_merchant_list'])) {
            if (!empty($map['apply_scene_product_merchant_list'])) {
                $model->applySceneProductMerchantList = [];
                $n                                    = 0;
                foreach ($map['apply_scene_product_merchant_list'] as $item) {
                    $model->applySceneProductMerchantList[$n++] = null !== $item ? ApplySceneProductMerchantInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
