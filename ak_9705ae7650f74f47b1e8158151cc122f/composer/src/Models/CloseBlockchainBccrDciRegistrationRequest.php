<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class CloseBlockchainBccrDciRegistrationRequest extends Model
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

    // 数登id
    /**
     * @var string
     */
    public $digitalRegisterId;

    // 退费人名称
    /**
     * @var string
     */
    public $name;

    // 联系手机号
    /**
     * @var string
     */
    public $mobileNo;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digitalRegisterId' => 'digital_register_id',
        'name'              => 'name',
        'mobileNo'          => 'mobile_no',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('digitalRegisterId', $this->digitalRegisterId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobileNo', $this->mobileNo, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->digitalRegisterId) {
            $res['digital_register_id'] = $this->digitalRegisterId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloseBlockchainBccrDciRegistrationRequest
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
        if (isset($map['digital_register_id'])) {
            $model->digitalRegisterId = $map['digital_register_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
