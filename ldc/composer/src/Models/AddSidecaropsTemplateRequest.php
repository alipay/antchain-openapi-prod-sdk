<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddSidecaropsTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // sidecar名称
    /**
     * @var string
     */
    public $sidecarName;

    // 镜像地址
    /**
     * @var string
     */
    public $image;

    // 新的模板
    /**
     * @var string
     */
    public $template;

    // 基线模板作用域范围，如：["gray", "prod"]，不填时默认全局
    /**
     * @var string[]
     */
    public $scope;

    // 版本描述
    /**
     * @var string
     */
    public $description;
    protected $_name = [
        'authToken'   => 'auth_token',
        'sidecarName' => 'sidecar_name',
        'image'       => 'image',
        'template'    => 'template',
        'scope'       => 'scope',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSidecaropsTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['template'])) {
            $model->template = $map['template'];
        }
        if (isset($map['scope'])) {
            if (!empty($map['scope'])) {
                $model->scope = $map['scope'];
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
