<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AccountRegisterResponse extends Model
{
    // 账户did
    /**
     * @example did:private:xxxcxxxxx
     *
     * @var string
     */
    public $userDid;
    protected $_name = [
        'userDid' => 'user_did',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountRegisterResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }

        return $model;
    }
}
