<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OperateLeasePetcomparepetsRequest extends Model
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

    //
    // 算法服务
    /**
     * @var string
     */
    public $sceneCode;

    // 算法功能
    /**
     * @var string
     */
    public $uri;

    // 来源系统
    /**
     * @var string
     */
    public $source;

    // 额外参数
    /**
     * @var string
     */
    public $ext;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'uri'               => 'uri',
        'source'            => 'source',
        'ext'               => 'ext',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('uri', $this->uri, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('ext', $this->ext, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->uri) {
            $res['uri'] = $this->uri;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateLeasePetcomparepetsRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['uri'])) {
            $model->uri = $map['uri'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
