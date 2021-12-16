<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTradecoreSoldspecinstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商业中台用来唯一标记商户的id
    // merchant_id 与 merchant_login_main_id至少填一个
    /**
     * @var string
     */
    public $merchantId;

    // 商户(买家)登录主账号
    // merchant_id 与 merchant_login_main_id至少填一个
    /**
     * @var string
     */
    public $merchantLoginMainId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'merchantId'          => 'merchant_id',
        'merchantLoginMainId' => 'merchant_login_main_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantLoginMainId) {
            $res['merchant_login_main_id'] = $this->merchantLoginMainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTradecoreSoldspecinstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_login_main_id'])) {
            $model->merchantLoginMainId = $map['merchant_login_main_id'];
        }

        return $model;
    }
}
