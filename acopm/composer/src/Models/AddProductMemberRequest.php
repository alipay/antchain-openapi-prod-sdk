<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class AddProductMemberRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // user_id
    /**
     * @var string[]
     */
    public $memberList;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;
    protected $_name = [
        'authToken'  => 'auth_token',
        'memberList' => 'member_list',
        'prodCode'   => 'prod_code',
    ];

    public function validate()
    {
        Model::validateRequired('memberList', $this->memberList, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->memberList) {
            $res['member_list'] = $this->memberList;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddProductMemberRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['member_list'])) {
            if (!empty($map['member_list'])) {
                $model->memberList = $map['member_list'];
            }
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }

        return $model;
    }
}
