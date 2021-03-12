<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChain extends Model
{
    // notary_blockchain
    /**
     * @example notary_blockchain
     *
     * @var ALiYunNotaryBlockchain
     */
    public $notaryBlockchain;

    // contract_blockchain
    /**
     * @example contract_blockchain
     *
     * @var ALiYunContractBlockchain
     */
    public $contractBlockchain;

    // old_contract_blockchain
    /**
     * @example old_contract_blockchain
     *
     * @var ALiYunOldContractBlockchain
     */
    public $oldContractBlockchain;
    protected $_name = [
        'notaryBlockchain'      => 'notary_blockchain',
        'contractBlockchain'    => 'contract_blockchain',
        'oldContractBlockchain' => 'old_contract_blockchain',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->notaryBlockchain) {
            $res['notary_blockchain'] = null !== $this->notaryBlockchain ? $this->notaryBlockchain->toMap() : null;
        }
        if (null !== $this->contractBlockchain) {
            $res['contract_blockchain'] = null !== $this->contractBlockchain ? $this->contractBlockchain->toMap() : null;
        }
        if (null !== $this->oldContractBlockchain) {
            $res['old_contract_blockchain'] = null !== $this->oldContractBlockchain ? $this->oldContractBlockchain->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['notary_blockchain'])) {
            $model->notaryBlockchain = ALiYunNotaryBlockchain::fromMap($map['notary_blockchain']);
        }
        if (isset($map['contract_blockchain'])) {
            $model->contractBlockchain = ALiYunContractBlockchain::fromMap($map['contract_blockchain']);
        }
        if (isset($map['old_contract_blockchain'])) {
            $model->oldContractBlockchain = ALiYunOldContractBlockchain::fromMap($map['old_contract_blockchain']);
        }

        return $model;
    }
}
