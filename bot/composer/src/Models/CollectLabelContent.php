<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CollectLabelContent extends Model
{
    // 链上设备ID
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $chainDeviceId;

    // 1.设备端上报数据内容
    // 2.与设备上报的数据一致，服务端不可修改
    // 3.解析后需与DataModel匹配
    // 4.映射 Label 对象结构化存储
    // 5.转为JSON后如果是JSONObject 映射单个 Label
    // 6.转为JSON后如果是JSONArray 映射多个 Label
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $content;

    // content的签名
    // 与设备上报的签名保持一致，服务端不可修改
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $signature;

    // 未经设备签名的附加数据JSON String
    // 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $extraData;
    protected $_name = [
        'chainDeviceId' => 'chain_device_id',
        'content'       => 'content',
        'signature'     => 'signature',
        'extraData'     => 'extra_data',
    ];

    public function validate()
    {
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CollectLabelContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
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

        return $model;
    }
}
