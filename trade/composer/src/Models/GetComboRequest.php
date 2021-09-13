<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class GetComboRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐编码
    /**
     * @var string
     */
    public $comboCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'comboCode' => 'combo_code',
    ];

    public function validate()
    {
        Model::validateRequired('comboCode', $this->comboCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetComboRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['combo_code'])) {
            $model->comboCode = $map['combo_code'];
        }

        return $model;
    }
}
