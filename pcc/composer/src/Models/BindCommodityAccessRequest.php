<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class BindCommodityAccessRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商品编码
    /**
     * @var string
     */
    public $commodityCode;

    // 服务接入码
    /**
     * @var string
     */
    public $accessCode;
    protected $_name = [
        'authToken'     => 'auth_token',
        'commodityCode' => 'commodity_code',
        'accessCode'    => 'access_code',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCommodityAccessRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }

        return $model;
    }
}
