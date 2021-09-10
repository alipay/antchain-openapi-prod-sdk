<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class GetAccountBalanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
    /**
     * @var string
     */
    public $fromChannel;

    // 租户id,外部用户唯一id，如蚂蚁通行证id
    /**
     * @var string
     */
    public $tenant;
    protected $_name = [
        'authToken'   => 'auth_token',
        'fromChannel' => 'from_channel',
        'tenant'      => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('fromChannel', $this->fromChannel, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fromChannel) {
            $res['from_channel'] = $this->fromChannel;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccountBalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['from_channel'])) {
            $model->fromChannel = $map['from_channel'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
