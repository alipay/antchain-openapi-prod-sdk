<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDatabaseAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // account id
    /**
     * @var string
     */
    public $accountSequence;
    protected $_name = [
        'authToken'       => 'auth_token',
        'accountSequence' => 'account_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('accountSequence', $this->accountSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accountSequence) {
            $res['account_sequence'] = $this->accountSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDatabaseAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['account_sequence'])) {
            $model->accountSequence = $map['account_sequence'];
        }

        return $model;
    }
}
