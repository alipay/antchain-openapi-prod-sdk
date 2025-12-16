<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAuthDataRequest extends Model
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

    // 授权token
    /**
     * @var string
     */
    public $authorizedToken;

    // 数据详情 JSONObject
    /**
     * @var string
     */
    public $dataDetail;

    // 国标产品标识码
    /**
     * @var string
     */
    public $productIdentityId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authorizedToken'   => 'authorized_token',
        'dataDetail'        => 'data_detail',
        'productIdentityId' => 'product_identity_id',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedToken', $this->authorizedToken, true);
        Model::validateRequired('dataDetail', $this->dataDetail, true);
        Model::validateRequired('productIdentityId', $this->productIdentityId, true);
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
        if (null !== $this->authorizedToken) {
            $res['authorized_token'] = $this->authorizedToken;
        }
        if (null !== $this->dataDetail) {
            $res['data_detail'] = $this->dataDetail;
        }
        if (null !== $this->productIdentityId) {
            $res['product_identity_id'] = $this->productIdentityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackAuthDataRequest
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
        if (isset($map['authorized_token'])) {
            $model->authorizedToken = $map['authorized_token'];
        }
        if (isset($map['data_detail'])) {
            $model->dataDetail = $map['data_detail'];
        }
        if (isset($map['product_identity_id'])) {
            $model->productIdentityId = $map['product_identity_id'];
        }

        return $model;
    }
}
