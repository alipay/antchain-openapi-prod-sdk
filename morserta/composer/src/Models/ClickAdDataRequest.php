<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class ClickAdDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 广告主id
    /**
     * @var int
     */
    public $accountId;

    // 渠道，支持TENCENT
    /**
     * @var string
     */
    public $channel;

    // 点击明细json string
    /**
     * @var string
     */
    public $data;
    protected $_name = [
        'authToken' => 'auth_token',
        'accountId' => 'account_id',
        'channel'   => 'channel',
        'data'      => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClickAdDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
