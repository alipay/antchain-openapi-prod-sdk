<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetConsumecardCommissionmanagerRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 手续费管理员账户
    /**
     * @var string
     */
    public $setAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'setAccountId'      => 'set_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->setAccountId) {
            $res['set_account_id'] = $this->setAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetConsumecardCommissionmanagerRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['set_account_id'])) {
            $model->setAccountId = $map['set_account_id'];
        }

        return $model;
    }
}
