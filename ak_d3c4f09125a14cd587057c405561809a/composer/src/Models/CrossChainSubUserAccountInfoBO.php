<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class CrossChainSubUserAccountInfoBO extends Model
{
    // 跨链账号Id
    /**
     * @example 34814bfc9b2a40d3889222013228dd02
     *
     * @var string
     */
    public $crossChainUserAccountId;

    // 跨链账号地址
    /**
     * @example 0x9f18be920360500f216495cd589895d3917cd9f2
     *
     * @var string
     */
    public $targetUserAddress;

    // 目标链所在链
    /**
     * @example CONFLUX_TEST_NET
     *
     * @var string
     */
    public $targetChainName;
    protected $_name = [
        'crossChainUserAccountId' => 'cross_chain_user_account_id',
        'targetUserAddress'       => 'target_user_address',
        'targetChainName'         => 'target_chain_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->crossChainUserAccountId) {
            $res['cross_chain_user_account_id'] = $this->crossChainUserAccountId;
        }
        if (null !== $this->targetUserAddress) {
            $res['target_user_address'] = $this->targetUserAddress;
        }
        if (null !== $this->targetChainName) {
            $res['target_chain_name'] = $this->targetChainName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrossChainSubUserAccountInfoBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cross_chain_user_account_id'])) {
            $model->crossChainUserAccountId = $map['cross_chain_user_account_id'];
        }
        if (isset($map['target_user_address'])) {
            $model->targetUserAddress = $map['target_user_address'];
        }
        if (isset($map['target_chain_name'])) {
            $model->targetChainName = $map['target_chain_name'];
        }

        return $model;
    }
}
