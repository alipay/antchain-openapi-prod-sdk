<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 蚂蚁通行证uid
    /**
     * @var string
     */
    public $antUid;

    // 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
    /**
     * @var string
     */
    public $businessOwnerId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'antUid'          => 'ant_uid',
        'businessOwnerId' => 'business_owner_id',
    ];

    public function validate()
    {
        Model::validateRequired('antUid', $this->antUid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->antUid) {
            $res['ant_uid'] = $this->antUid;
        }
        if (null !== $this->businessOwnerId) {
            $res['business_owner_id'] = $this->businessOwnerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ant_uid'])) {
            $model->antUid = $map['ant_uid'];
        }
        if (isset($map['business_owner_id'])) {
            $model->businessOwnerId = $map['business_owner_id'];
        }

        return $model;
    }
}
