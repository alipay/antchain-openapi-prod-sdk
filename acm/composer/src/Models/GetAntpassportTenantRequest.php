<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetAntpassportTenantRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 蚂蚁通行证uid
    /**
     * @var string
     */
    public $antUid;
    protected $_name = [
        'authToken' => 'auth_token',
        'antUid'    => 'ant_uid',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntpassportTenantRequest
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

        return $model;
    }
}
