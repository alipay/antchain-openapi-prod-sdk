<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CarbonAccountInfo extends Model
{
    // 账户did
    /**
     * @example did:private:xxx
     *
     * @var string
     */
    public $userDid;

    // 账户名称
    /**
     * @example xxx企业
     *
     * @var string
     */
    public $userName;
    protected $_name = [
        'userDid'  => 'user_did',
        'userName' => 'user_name',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('userName', $this->userName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarbonAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }

        return $model;
    }
}
