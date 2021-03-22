<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class WalletInfo extends Model
{
    // 授信钱包信息
    /**
     * @example
     *
     * @var CreditWallet
     */
    public $creditWallet;

    // 余额钱包信息
    /**
     * @example
     *
     * @var DebitWallet
     */
    public $debitWallet;

    // 钱包统计信息
    /**
     * @example
     *
     * @var StatisticalInfo
     */
    public $statisticalInfo;
    protected $_name = [
        'creditWallet'    => 'credit_wallet',
        'debitWallet'     => 'debit_wallet',
        'statisticalInfo' => 'statistical_info',
    ];

    public function validate()
    {
        Model::validateRequired('creditWallet', $this->creditWallet, true);
        Model::validateRequired('debitWallet', $this->debitWallet, true);
        Model::validateRequired('statisticalInfo', $this->statisticalInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creditWallet) {
            $res['credit_wallet'] = null !== $this->creditWallet ? $this->creditWallet->toMap() : null;
        }
        if (null !== $this->debitWallet) {
            $res['debit_wallet'] = null !== $this->debitWallet ? $this->debitWallet->toMap() : null;
        }
        if (null !== $this->statisticalInfo) {
            $res['statistical_info'] = null !== $this->statisticalInfo ? $this->statisticalInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WalletInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['credit_wallet'])) {
            $model->creditWallet = CreditWallet::fromMap($map['credit_wallet']);
        }
        if (isset($map['debit_wallet'])) {
            $model->debitWallet = DebitWallet::fromMap($map['debit_wallet']);
        }
        if (isset($map['statistical_info'])) {
            $model->statisticalInfo = StatisticalInfo::fromMap($map['statistical_info']);
        }

        return $model;
    }
}
