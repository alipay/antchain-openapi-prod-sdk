<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateImportassetResponse extends Model
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

    // 资产id
    /**
     * @var string
     */
    public $assetId;

    // 区块链信息
    /**
     * @var BlockchainInfo
     */
    public $info;

    // 时间
    /**
     * @var int
     */
    public $date;

    // 请求标识
    /**
     * @var string
     */
    public $requestId;

    // 短码
    /**
     * @var string
     */
    public $qrCode;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'assetId'    => 'asset_id',
        'info'       => 'info',
        'date'       => 'date',
        'requestId'  => 'request_id',
        'qrCode'     => 'qr_code',
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->info) {
            $res['info'] = null !== $this->info ? $this->info->toMap() : null;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateImportassetResponse
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
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['info'])) {
            $model->info = BlockchainInfo::fromMap($map['info']);
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }

        return $model;
    }
}
