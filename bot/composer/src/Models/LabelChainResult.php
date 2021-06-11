<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LabelChainResult extends Model
{
    // 标签ID
    /**
     * @example 86F000001A51C02000000010
     *
     * @var string
     */
    public $labelId;

    // 业务资产ID，接入方自行定义
    /**
     * @example XXX
     *
     * @var string
     */
    public $assetId;

    // 标签最近一次上链的txHash
    /**
     * @example 855e7ba37a0f227e384691e250f90bb2240adf11839016cf08506c9aa5c11cef
     *
     * @var string
     */
    public $txHash;

    // 错误码
    /**
     * @example XXXX
     *
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'labelId'   => 'label_id',
        'assetId'   => 'asset_id',
        'txHash'    => 'tx_hash',
        'errorCode' => 'error_code',
        'errorMsg'  => 'error_msg',
    ];

    public function validate()
    {
        Model::validateRequired('labelId', $this->labelId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('errorMsg', $this->errorMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->labelId) {
            $res['label_id'] = $this->labelId;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelChainResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label_id'])) {
            $model->labelId = $map['label_id'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
