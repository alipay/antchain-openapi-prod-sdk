<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateBuildpackNativetechstackversionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 技术栈类别
    /**
     * @var string
     */
    public $techStack;

    // 云原生技术栈版本名称
    /**
     * @var string
     */
    public $techStackVersion;

    // 基础镜像名称
    /**
     * @var string
     */
    public $fromImage;

    // 版本描述信息
    /**
     * @var string
     */
    public $description;

    // 扩展指令列表
    /**
     * @var string[]
     */
    public $extCommands;

    // 扩展属性 - 表现为Map<String,String>序列化后的字符串
    /**
     * @var string
     */
    public $extendProperties;
    protected $_name = [
        'authToken'        => 'auth_token',
        'techStack'        => 'tech_stack',
        'techStackVersion' => 'tech_stack_version',
        'fromImage'        => 'from_image',
        'description'      => 'description',
        'extCommands'      => 'ext_commands',
        'extendProperties' => 'extend_properties',
    ];

    public function validate()
    {
        Model::validateRequired('techStack', $this->techStack, true);
        Model::validateRequired('techStackVersion', $this->techStackVersion, true);
        Model::validateRequired('fromImage', $this->fromImage, true);
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
        if (null !== $this->fromImage) {
            $res['from_image'] = $this->fromImage;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extCommands) {
            $res['ext_commands'] = $this->extCommands;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBuildpackNativetechstackversionRequest
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
        if (isset($map['from_image'])) {
            $model->fromImage = $map['from_image'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['ext_commands'])) {
            if (!empty($map['ext_commands'])) {
                $model->extCommands = $map['ext_commands'];
            }
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }

        return $model;
    }
}
