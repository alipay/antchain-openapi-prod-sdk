<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateQuotaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 从Query接口找到此ID
    /**
     * @var string
     */
    public $quotaId;

    // 额度，不更新请保持原值，不要留空
    /**
     * @var int
     */
    public $hardLimit;
    protected $_name = [
        'authToken' => 'auth_token',
        'quotaId'   => 'quota_id',
        'hardLimit' => 'hard_limit',
    ];

    public function validate()
    {
        Model::validateRequired('quotaId', $this->quotaId, true);
        Model::validateRequired('hardLimit', $this->hardLimit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->quotaId) {
            $res['quota_id'] = $this->quotaId;
        }
        if (null !== $this->hardLimit) {
            $res['hard_limit'] = $this->hardLimit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateQuotaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['quota_id'])) {
            $model->quotaId = $map['quota_id'];
        }
        if (isset($map['hard_limit'])) {
            $model->hardLimit = $map['hard_limit'];
        }

        return $model;
    }
}
