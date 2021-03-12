<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppCodeCreate extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // transaction_hash
    /**
     * @example transaction_hash
     *
     * @var string
     */
    public $transactionHash;

    // base64_q_r_code_p_n_g
    /**
     * @example base64_q_r_code_p_n_g
     *
     * @var string
     */
    public $base64QRCodePNG;

    // q_r_code_content
    /**
     * @example q_r_code_content
     *
     * @var string
     */
    public $qRCodeContent;
    protected $_name = [
        'antChainId'      => 'ant_chain_id',
        'transactionHash' => 'transaction_hash',
        'base64QRCodePNG' => 'base64_q_r_code_p_n_g',
        'qRCodeContent'   => 'q_r_code_content',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->transactionHash) {
            $res['transaction_hash'] = $this->transactionHash;
        }
        if (null !== $this->base64QRCodePNG) {
            $res['base64_q_r_code_p_n_g'] = $this->base64QRCodePNG;
        }
        if (null !== $this->qRCodeContent) {
            $res['q_r_code_content'] = $this->qRCodeContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppCodeCreate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['transaction_hash'])) {
            $model->transactionHash = $map['transaction_hash'];
        }
        if (isset($map['base64_q_r_code_p_n_g'])) {
            $model->base64QRCodePNG = $map['base64_q_r_code_p_n_g'];
        }
        if (isset($map['q_r_code_content'])) {
            $model->qRCodeContent = $map['q_r_code_content'];
        }

        return $model;
    }
}
