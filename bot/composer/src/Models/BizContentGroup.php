<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BizContentGroup extends Model
{
    // 设备链上Id，与scene参数至少有一个参数不为空
    //
    //
    /**
     * @example txhash123
     *
     * @var string
     */
    public $chainDeviceId;

    // 业务Id
    //
    //
    /**
     * @example 123123
     *
     * @var string
     */
    public $bizId;

    // 业务类型
    //
    //
    /**
     * @example 123123
     *
     * @var string
     */
    public $bizType;

    // 数据内容 JSON字符串
    //
    //
    /**
     * @example {"":"",""}
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'chainDeviceId' => 'chain_device_id',
        'bizId'         => 'biz_id',
        'bizType'       => 'biz_type',
        'content'       => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizContentGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
