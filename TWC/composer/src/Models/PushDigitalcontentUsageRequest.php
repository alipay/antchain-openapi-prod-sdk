<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PushDigitalcontentUsageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 内容id
    /**
     * @var string
     */
    public $contentId;

    // 设备id
    /**
     * @var string
     */
    public $deviceId;

    // 使用量，按次使用需要为数字
    /**
     * @var string
     */
    public $usage;

    // 客户端幂等token
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contentId'         => 'content_id',
        'deviceId'          => 'device_id',
        'usage'             => 'usage',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('usage', $this->usage, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->usage) {
            $res['usage'] = $this->usage;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushDigitalcontentUsageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['usage'])) {
            $model->usage = $map['usage'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
