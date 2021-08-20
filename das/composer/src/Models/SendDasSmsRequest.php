<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class SendDasSmsRequest extends Model
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

    // 接收方电话号码
    /**
     * @var int
     */
    public $receivePhoneNum;

    // 授权实例ID
    /**
     * @var string
     */
    public $authInstanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'receivePhoneNum'   => 'receive_phone_num',
        'authInstanceId'    => 'auth_instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('receivePhoneNum', $this->receivePhoneNum, true);
        Model::validateRequired('authInstanceId', $this->authInstanceId, true);
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
        if (null !== $this->receivePhoneNum) {
            $res['receive_phone_num'] = $this->receivePhoneNum;
        }
        if (null !== $this->authInstanceId) {
            $res['auth_instance_id'] = $this->authInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendDasSmsRequest
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
        if (isset($map['receive_phone_num'])) {
            $model->receivePhoneNum = $map['receive_phone_num'];
        }
        if (isset($map['auth_instance_id'])) {
            $model->authInstanceId = $map['auth_instance_id'];
        }

        return $model;
    }
}
