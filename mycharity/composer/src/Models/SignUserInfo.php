<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class SignUserInfo extends Model
{
    // 签约记录id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 支付宝代扣账号
    /**
     * @example 133XXXX4444
     *
     * @var string
     */
    public $alipayAccount;
    protected $_name = [
        'id'            => 'id',
        'alipayAccount' => 'alipay_account',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('alipayAccount', $this->alipayAccount, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('alipayAccount', $this->alipayAccount, 100);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
        }

        return $model;
    }
}
