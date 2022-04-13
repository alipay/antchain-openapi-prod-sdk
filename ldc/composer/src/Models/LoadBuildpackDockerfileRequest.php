<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadBuildpackDockerfileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 技术栈大版本
    /**
     * @var string
     */
    public $techStack;

    // 云原生技术栈版本
    /**
     * @var string
     */
    public $techStackVersion;

    // 应用包地址，可以为相对目录，或者远程可访问存储地址. 用于组装Dockerfile模板中对应的应用包获取地址
    /**
     * @var string
     */
    public $packageUrl;
    protected $_name = [
        'authToken'        => 'auth_token',
        'techStack'        => 'tech_stack',
        'techStackVersion' => 'tech_stack_version',
        'packageUrl'       => 'package_url',
    ];

    public function validate()
    {
        Model::validateRequired('techStack', $this->techStack, true);
        Model::validateRequired('techStackVersion', $this->techStackVersion, true);
        Model::validateRequired('packageUrl', $this->packageUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->techStack) {
            $res['tech_stack'] = $this->techStack;
        }
        if (null !== $this->techStackVersion) {
            $res['tech_stack_version'] = $this->techStackVersion;
        }
        if (null !== $this->packageUrl) {
            $res['package_url'] = $this->packageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBuildpackDockerfileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tech_stack'])) {
            $model->techStack = $map['tech_stack'];
        }
        if (isset($map['tech_stack_version'])) {
            $model->techStackVersion = $map['tech_stack_version'];
        }
        if (isset($map['package_url'])) {
            $model->packageUrl = $map['package_url'];
        }

        return $model;
    }
}
