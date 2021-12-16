<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryPartnercoreSignRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 合同id
    /**
     * @var string
     */
    public $agreementId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'agreementId' => 'agreement_id',
    ];

    public function validate()
    {
        Model::validateRequired('agreementId', $this->agreementId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->agreementId) {
            $res['agreement_id'] = $this->agreementId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPartnercoreSignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['agreement_id'])) {
            $model->agreementId = $map['agreement_id'];
        }

        return $model;
    }
}
