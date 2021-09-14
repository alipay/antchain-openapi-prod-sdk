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

    // 被授权人接入应用biz_uuid
    /**
     * @var string
     */
    public $beAuthedPersonAppBizUuid;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'beAuthedPersonAppBizUuid' => 'be_authed_person_app_biz_uuid',
    ];

    public function validate()
    {
        Model::validateRequired('beAuthedPersonAppBizUuid', $this->beAuthedPersonAppBizUuid, true);
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
        if (null !== $this->beAuthedPersonAppBizUuid) {
            $res['be_authed_person_app_biz_uuid'] = $this->beAuthedPersonAppBizUuid;
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
        if (isset($map['be_authed_person_app_biz_uuid'])) {
            $model->beAuthedPersonAppBizUuid = $map['be_authed_person_app_biz_uuid'];
        }

        return $model;
    }
}
