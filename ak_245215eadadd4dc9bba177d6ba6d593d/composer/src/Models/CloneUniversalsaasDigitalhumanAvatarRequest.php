<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CloneUniversalsaasDigitalhumanAvatarRequest extends Model
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

    // 数字人训练视频url
    /**
     * @var string
     */
    public $fileUrl;

    // 数字人名称
    /**
     * @var string
     */
    public $name;

    // 是否克隆声音，默认为false
    /**
     * @var string
     */
    public $cloneVoice;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl'           => 'file_url',
        'name'              => 'name',
        'cloneVoice'        => 'clone_voice',
    ];

    public function validate()
    {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cloneVoice) {
            $res['clone_voice'] = $this->cloneVoice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloneUniversalsaasDigitalhumanAvatarRequest
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
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['clone_voice'])) {
            $model->cloneVoice = $map['clone_voice'];
        }

        return $model;
    }
}
