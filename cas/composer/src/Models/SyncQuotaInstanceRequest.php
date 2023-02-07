<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SyncQuotaInstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // quota_instance_ids，从quota.instance.query返回
    /**
     * @var string[]
     */
    public $quotaInstanceIds;
    protected $_name = [
        'authToken'        => 'auth_token',
        'quotaInstanceIds' => 'quota_instance_ids',
    ];

    public function validate()
    {
        Model::validateRequired('quotaInstanceIds', $this->quotaInstanceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->quotaInstanceIds) {
            $res['quota_instance_ids'] = $this->quotaInstanceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncQuotaInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['quota_instance_ids'])) {
            if (!empty($map['quota_instance_ids'])) {
                $model->quotaInstanceIds = $map['quota_instance_ids'];
            }
        }

        return $model;
    }
}
