<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CountUniversalsaasDigitalhumanVoiceNoiseRequest extends Model
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

    // 音视频文件url
    /**
     * @var string
     */
    public $mediaUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'mediaUrl'          => 'media_url',
    ];

    public function validate()
    {
        Model::validateRequired('mediaUrl', $this->mediaUrl, true);
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
        if (null !== $this->mediaUrl) {
            $res['media_url'] = $this->mediaUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountUniversalsaasDigitalhumanVoiceNoiseRequest
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
        if (isset($map['media_url'])) {
            $model->mediaUrl = $map['media_url'];
        }

        return $model;
    }
}
