<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AccountData extends Model
{
    // 账号id
    /**
     * @example 111111
     *
     * @var string
     */
    public $accountId;

    // 账号名称
    /**
     * @example 小明
     *
     * @var string
     */
    public $accountName;

    // 账号平台（支付宝，淘宝，微信，抖音等）
    /**
     * @example WEIXIN
     *
     * @var string
     */
    public $accountPlatform;
    protected $_name = [
        'accountId'       => 'account_id',
        'accountName'     => 'account_name',
        'accountPlatform' => 'account_platform',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('accountPlatform', $this->accountPlatform, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountPlatform) {
            $res['account_platform'] = $this->accountPlatform;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_platform'])) {
            $model->accountPlatform = $map['account_platform'];
        }

        return $model;
    }
}
