<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTSG\Models;

use AlibabaCloud\Tea\Model;

class SendCollectorResult extends Model
{
    // 原入参的数组索引
    /**
     * @example 0
     *
     * @var int
     */
    public $originalIndex;

    // 失败数据对应的异常码，成功时该字段为空
    /**
     * @example params.invalid
     *
     * @var string
     */
    public $errorCode;

    // 异常信息
    /**
     * @example 可信设备与DEVICE-ID不匹配
     *
     * @var string
     */
    public $errorMsg;

    // 返回的扩展信息
    /**
     * @example {"assetId":"Q02GYQGAY5","labelId":"86F000001A51A01000003836"}
     *
     * @var string
     */
    public $extraInfo;

    // 数据的链上哈希
    //
    /**
     * @example 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'originalIndex' => 'original_index',
        'errorCode'     => 'error_code',
        'errorMsg'      => 'error_msg',
        'extraInfo'     => 'extra_info',
        'txHash'        => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('originalIndex', $this->originalIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->originalIndex) {
            $res['original_index'] = $this->originalIndex;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCollectorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['original_index'])) {
            $model->originalIndex = $map['original_index'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
