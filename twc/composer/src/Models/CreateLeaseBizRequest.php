<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseBizRequest extends Model
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

    // 租赁订单相关内容，以json形式发送
    /**
     * @var string
     */
    public $bizContent;

    // 租赁订单所属阶段
    /**
     * @var string
     */
    public $type;

    // 租赁订单操作类型
    /**
     * @var string
     */
    public $operationType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizContent'        => 'biz_content',
        'type'              => 'type',
        'operationType'     => 'operation_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseBizRequest
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
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }

        return $model;
    }
}
