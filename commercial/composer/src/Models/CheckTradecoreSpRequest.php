<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CheckTradecoreSpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 服务商id
    /**
     * @var string
     */
    public $spId;
    protected $_name = [
        'authToken' => 'auth_token',
        'spId'      => 'sp_id',
    ];

    public function validate()
    {
        Model::validateRequired('spId', $this->spId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->spId) {
            $res['sp_id'] = $this->spId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckTradecoreSpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sp_id'])) {
            $model->spId = $map['sp_id'];
        }

        return $model;
    }
}
