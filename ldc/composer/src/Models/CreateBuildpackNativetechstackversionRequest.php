<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateBuildpackNativetechstackversionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // ce4456_jdk8_tengine6
    /**
     * @var string
     */
    public $displayVersion;

    // 版本描述
    /**
     * @var string
     */
    public $description;

    // 完整的镜像地址
    /**
     * @var string
     */
    public $fromImage;

    // 所属技术栈大类
    /**
     * @var string
     */
    public $techStack;

    // 技术栈大类对应的id，如不填写，后台默认根据名称校验所属技术栈大类
    /**
     * @var string
     */
    public $techStackId;

    // 指定该版本可见范围：
    // PUBLIC - 全站点各个租户都可见；
    // TENANT - 仅创建改版本对应的租户内可见
    /**
     * @var string
     */
    public $scope;

    // 扩展的Dockerfile指令。
    // 用于在FromImage的基础上扩展Dockerfile指令
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
        'displayVersion'   => 'display_version',
        'description'      => 'description',
        'fromImage'        => 'from_image',
        'techStack'        => 'tech_stack',
        'techStackId'      => 'tech_stack_id',
        'scope'            => 'scope',
        'extCommands'      => 'ext_commands',
        'extendProperties' => 'extend_properties',
    ];

    public function validate()
    {
        Model::validateRequired('displayVersion', $this->displayVersion, true);
        Model::validateRequired('fromImage', $this->fromImage, true);
        Model::validateRequired('techStack', $this->techStack, true);
        Model::validateRequired('scope', $this->scope, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->displayVersion) {
            $res['display_version'] = $this->displayVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fromImage) {
            $res['from_image'] = $this->fromImage;
        }
        if (null !== $this->techStack) {
            $res['tech_stack'] = $this->techStack;
        }
        if (null !== $this->techStackId) {
            $res['tech_stack_id'] = $this->techStackId;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
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
     * @return CreateBuildpackNativetechstackversionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['display_version'])) {
            $model->displayVersion = $map['display_version'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['from_image'])) {
            $model->fromImage = $map['from_image'];
        }
        if (isset($map['tech_stack'])) {
            $model->techStack = $map['tech_stack'];
        }
        if (isset($map['tech_stack_id'])) {
            $model->techStackId = $map['tech_stack_id'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
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
