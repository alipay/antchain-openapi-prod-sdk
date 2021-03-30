<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryRegisterstatusResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 登记状态
    /**
     * @var string
     */
    public $status;

    // 存证时间
    /**
     * @var int
     */
    public $timestamp;

    // 文件hash
    /**
     * @var string
     */
    public $hash;

    // 统一证据编号（存证交易HASH）
    /**
     * @var string
     */
    public $txHash;

    // 存证块高
    /**
     * @var int
     */
    public $blockHeight;

    // tsr信息
    /**
     * @var string
     */
    public $tsr;

    // 公证处证书下载链接
    /**
     * @var string
     */
    public $certificateUrl;

    // 公证处证书编号
    /**
     * @var string
     */
    public $certificateStorageNo;

    // 授时中心证书下载链接
    /**
     * @var string
     */
    public $certificateTimeUrl;

    // 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
    /**
     * @var string
     */
    public $packageUrl;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'status'               => 'status',
        'timestamp'            => 'timestamp',
        'hash'                 => 'hash',
        'txHash'               => 'tx_hash',
        'blockHeight'          => 'block_height',
        'tsr'                  => 'tsr',
        'certificateUrl'       => 'certificate_url',
        'certificateStorageNo' => 'certificate_storage_no',
        'certificateTimeUrl'   => 'certificate_time_url',
        'packageUrl'           => 'package_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->certificateStorageNo) {
            $res['certificate_storage_no'] = $this->certificateStorageNo;
        }
        if (null !== $this->certificateTimeUrl) {
            $res['certificate_time_url'] = $this->certificateTimeUrl;
        }
        if (null !== $this->packageUrl) {
            $res['package_url'] = $this->packageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRegisterstatusResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['certificate_storage_no'])) {
            $model->certificateStorageNo = $map['certificate_storage_no'];
        }
        if (isset($map['certificate_time_url'])) {
            $model->certificateTimeUrl = $map['certificate_time_url'];
        }
        if (isset($map['package_url'])) {
            $model->packageUrl = $map['package_url'];
        }

        return $model;
    }
}
