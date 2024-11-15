<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessruleServicesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 提交人域账号
    /**
     * @var string
     */
    public $submitterId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'submitterId' => 'submitter_id',
    ];

    public function validate()
    {
        Model::validateRequired('submitterId', $this->submitterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->submitterId) {
            $res['submitter_id'] = $this->submitterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessruleServicesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['submitter_id'])) {
            $model->submitterId = $map['submitter_id'];
        }

        return $model;
    }
}
