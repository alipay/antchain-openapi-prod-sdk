<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnderwritingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 承保申请号（蚂蚁内部）
    /**
     * @var string
     */
    public $insuranceApplicationNoInner;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'insuranceApplicationNoInner' => 'insurance_application_no_inner',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceApplicationNoInner', $this->insuranceApplicationNoInner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->insuranceApplicationNoInner) {
            $res['insurance_application_no_inner'] = $this->insuranceApplicationNoInner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnderwritingRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['insurance_application_no_inner'])) {
            $model->insuranceApplicationNoInner = $map['insurance_application_no_inner'];
        }

        return $model;
    }
}
