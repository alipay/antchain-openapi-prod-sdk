<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateFeatureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // feature_id
    /**
     * @var string
     */
    public $id;

    // 可以序列化成Map的Json字符串
    /**
     * @var string
     */
    public $content;

    // 详情参考 https://velocity.apache.org/engine/
    /**
     * @var string
     */
    public $conditionalContent;
    protected $_name = [
        'authToken'          => 'auth_token',
        'id'                 => 'id',
        'content'            => 'content',
        'conditionalContent' => 'conditional_content',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->conditionalContent) {
            $res['conditional_content'] = $this->conditionalContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFeatureRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['conditional_content'])) {
            $model->conditionalContent = $map['conditional_content'];
        }

        return $model;
    }
}
