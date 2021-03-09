<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetLoadbalanceHealthRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // lb_id
    /**
     * @var string
     */
    public $lbId;
    protected $_name = [
        'authToken' => 'auth_token',
        'lbId'      => 'lb_id',
    ];

    public function validate()
    {
        Model::validateRequired('lbId', $this->lbId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->lbId) {
            $res['lb_id'] = $this->lbId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetLoadbalanceHealthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['lb_id'])) {
            $model->lbId = $map['lb_id'];
        }

        return $model;
    }
}
