<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpCopyrightResponse extends Model
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

    // 存证状态，PROCESSING：存证中；SUCCESS：存证成功；FAIL：存证失败
    /**
     * @var string
     */
    public $status;

    // 文件hash
    /**
     * @var string
     */
    public $hash;

    // 存证交易hash
    /**
     * @var string
     */
    public $txHash;

    // 存证块高
    /**
     * @var int
     */
    public $blockHeight;

    // 存证时间
    /**
     * @var int
     */
    public $timestamp;

    // 证书oss地址
    /**
     * @var string
     */
    public $certificateOss;

    // 证书下载链接
    /**
     * @var string
     */
    public $certificateDownurl;

    // 公证处证书编号
    /**
     * @var string
     */
    public $certificateNo;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'status'             => 'status',
        'hash'               => 'hash',
        'txHash'             => 'tx_hash',
        'blockHeight'        => 'block_height',
        'timestamp'          => 'timestamp',
        'certificateOss'     => 'certificate_oss',
        'certificateDownurl' => 'certificate_downurl',
        'certificateNo'      => 'certificate_no',
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
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->certificateOss) {
            $res['certificate_oss'] = $this->certificateOss;
        }
        if (null !== $this->certificateDownurl) {
            $res['certificate_downurl'] = $this->certificateDownurl;
        }
        if (null !== $this->certificateNo) {
            $res['certificate_no'] = $this->certificateNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpCopyrightResponse
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
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['certificate_oss'])) {
            $model->certificateOss = $map['certificate_oss'];
        }
        if (isset($map['certificate_downurl'])) {
            $model->certificateDownurl = $map['certificate_downurl'];
        }
        if (isset($map['certificate_no'])) {
            $model->certificateNo = $map['certificate_no'];
        }

        return $model;
    }
}
