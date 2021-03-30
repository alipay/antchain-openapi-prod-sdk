<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class EvidenceInfo extends Model
{
    // 自定义序列
    /**
     * @example 1
     *
     * @var int
     */
    public $bizId;

    // 资产id
    /**
     * @example assetId
     *
     * @var string
     */
    public $assetId;

    // 请求信息
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // 创建是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 短码
    /**
     * @example qrCode
     *
     * @var string
     */
    public $qrCode;
    protected $_name = [
        'bizId'   => 'biz_id',
        'assetId' => 'asset_id',
        'message' => 'message',
        'success' => 'success',
        'qrCode'  => 'qr_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }

        return $model;
    }
}
