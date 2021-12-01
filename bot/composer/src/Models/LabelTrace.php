<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LabelTrace extends Model
{
    // 操作内容
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $content;

    // 链上哈希
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $txHash;

    // 上链时间
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $txTime;

    // 上链失败的错误码
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $errorCode;

    // 上链失败的错误信息
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $errorMsg;

    // 是否上链成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuccess;

    // 标签对应资产版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'content'   => 'content',
        'txHash'    => 'tx_hash',
        'txTime'    => 'tx_time',
        'errorCode' => 'error_code',
        'errorMsg'  => 'error_msg',
        'isSuccess' => 'is_success',
        'version'   => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validatePattern('txTime', $this->txTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelTrace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['is_success'])) {
            $model->isSuccess = $map['is_success'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
