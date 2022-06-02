<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiAuthtemplatedefineRequest extends Model
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

    // token
    /**
     * @var string
     */
    public $token;

    // message：短信
    // qrCode：二维码
    /**
     * @var string
     */
    public $actionType;

    // 依赖的数据值 比如身份证
    /**
     * @var string
     */
    public $dependsValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'token'             => 'token',
        'actionType'        => 'action_type',
        'dependsValue'      => 'depends_value',
    ];

    public function validate()
    {
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('dependsValue', $this->dependsValue, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->dependsValue) {
            $res['depends_value'] = $this->dependsValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiAuthtemplatedefineRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['depends_value'])) {
            $model->dependsValue = $map['depends_value'];
        }

        return $model;
    }
}
