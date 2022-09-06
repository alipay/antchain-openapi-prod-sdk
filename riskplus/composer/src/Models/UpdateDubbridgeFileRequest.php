<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgeFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 授信申请订单号(资产方)
    /**
     * @var string
     */
    public $originalOrderNo;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 资料文件
    /**
     * @var Material[]
     */
    public $materials;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'originalOrderNo'   => 'original_order_no',
        'customNo'          => 'custom_no',
        'materials'         => 'materials',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
        Model::validateRequired('customNo', $this->customNo, true);
        Model::validateRequired('materials', $this->materials, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->materials) {
            $res['materials'] = [];
            if (null !== $this->materials && \is_array($this->materials)) {
                $n = 0;
                foreach ($this->materials as $item) {
                    $res['materials'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubbridgeFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['materials'])) {
            if (!empty($map['materials'])) {
                $model->materials = [];
                $n                = 0;
                foreach ($map['materials'] as $item) {
                    $model->materials[$n++] = null !== $item ? Material::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
