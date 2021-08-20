<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class GetDasLinkRequest extends Model
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

    // 被授权人接入应用id
    /**
     * @var string
     */
    public $beAuthedPersonAppId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'beAuthedPersonAppId' => 'be_authed_person_app_id',
    ];

    public function validate()
    {
        Model::validateRequired('beAuthedPersonAppId', $this->beAuthedPersonAppId, true);
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
        if (null !== $this->beAuthedPersonAppId) {
            $res['be_authed_person_app_id'] = $this->beAuthedPersonAppId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDasLinkRequest
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
        if (isset($map['be_authed_person_app_id'])) {
            $model->beAuthedPersonAppId = $map['be_authed_person_app_id'];
        }

        return $model;
    }
}
