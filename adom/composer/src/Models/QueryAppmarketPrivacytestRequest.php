<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class QueryAppmarketPrivacytestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 记录id
    /**
     * @var string
     */
    public $recordId;

    // 实例id
    /**
     * @var string
     */
    public $instId;
    protected $_name = [
        'authToken' => 'auth_token',
        'recordId'  => 'record_id',
        'instId'    => 'inst_id',
    ];

    public function validate()
    {
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('instId', $this->instId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->instId) {
            $res['inst_id'] = $this->instId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppmarketPrivacytestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['inst_id'])) {
            $model->instId = $map['inst_id'];
        }

        return $model;
    }
}
