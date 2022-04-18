<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SetProductOperateRequest extends Model
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

    // 请求入参
    /**
     * @var string
     */
    public $inputJson;

    // 操作类型
    /**
     * @var string
     */
    public $operateType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'inputJson'         => 'input_json',
        'operateType'       => 'operate_type',
    ];

    public function validate()
    {
        Model::validateRequired('inputJson', $this->inputJson, true);
        Model::validateRequired('operateType', $this->operateType, true);
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
        if (null !== $this->inputJson) {
            $res['input_json'] = $this->inputJson;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetProductOperateRequest
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
        if (isset($map['input_json'])) {
            $model->inputJson = $map['input_json'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }

        return $model;
    }
}
