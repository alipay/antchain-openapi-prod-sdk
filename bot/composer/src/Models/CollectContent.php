<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CollectContent extends Model
{
    // 链上设备ID（与可信设备ID至少填一项）
    /**
     * @example 1122
     *
     * @var string
     */
    public $chainDeviceId;

    // 可信设备ID（与链上设备ID至少填一项）
    /**
     * @example 7006071575519457281
     *
     * @var int
     */
    public $trustiotDeviceId;

    // 收集的内容
    /**
     * @example {"name","1"}
     *
     * @var string
     */
    public $content;

    // 对内容的签名
    /**
     * @example wwexe02j
     *
     * @var string
     */
    public $signature;

    // 服务端发送的扩展数据（非可信设备直接产生的数据）
    /**
     * @example {"extraKey":"extraValue"}
     *
     * @var string
     */
    public $extraData;

    // 数据模型Id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $dataModelId;
    protected $_name = [
        'chainDeviceId'    => 'chain_device_id',
        'trustiotDeviceId' => 'trustiot_device_id',
        'content'          => 'content',
        'signature'        => 'signature',
        'extraData'        => 'extra_data',
        'dataModelId'      => 'data_model_id',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->trustiotDeviceId) {
            $res['trustiot_device_id'] = $this->trustiotDeviceId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = $this->extraData;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CollectContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['trustiot_device_id'])) {
            $model->trustiotDeviceId = $map['trustiot_device_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['extra_data'])) {
            $model->extraData = $map['extra_data'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }

        return $model;
    }
}
