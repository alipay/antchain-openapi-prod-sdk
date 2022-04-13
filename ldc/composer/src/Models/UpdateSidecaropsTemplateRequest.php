<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecaropsTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要更新的sidecar名称
    /**
     * @var string
     */
    public $sidecarName;

    // 指定要更新的sidecar版本
    /**
     * @var string
     */
    public $sidecarVersion;

    // 根据image筛选要更新的基线
    /**
     * @var string
     */
    public $image;

    // 要更新的sidecar模板
    /**
     * @var string
     */
    public $template;

    // 要设置成的scope
    /**
     * @var string[]
     */
    public $scope;
    protected $_name = [
        'authToken'      => 'auth_token',
        'sidecarName'    => 'sidecar_name',
        'sidecarVersion' => 'sidecar_version',
        'image'          => 'image',
        'template'       => 'template',
        'scope'          => 'scope',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarName', $this->sidecarName, true);
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
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSidecaropsTemplateRequest
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
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
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

        return $model;
    }
}
