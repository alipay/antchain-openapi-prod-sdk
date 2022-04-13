<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NativeTechStackVersion extends Model
{
    // 版本描述
    /**
     * @example 蚂蚁SOFA4
     *
     * @var string
     */
    public $description;

    // 用户扩展的自定义Dockerfile指令
    /**
     * @example ["Add http://xxx.tar.gz /tmp", "RUN tar -xvf /tmp/xxx.tar.gz"]
     *
     * @var string[]
     */
    public $extendCommands;

    // 版本扩展信息，e.g 公共环境变量
    /**
     * @example "{"key": "val"}"
     *
     * @var string
     */
    public $extendProperties;

    // 基础镜像存放地址
    /**
     * @example acs-reg.alipay.com:ce4456_jdk7_tengine16
     *
     * @var string
     */
    public $fromImage;

    // 唯一标识ID
    /**
     * @example 000000000001
     *
     * @var string
     */
    public $id;

    // 可见范围：全局可见|租户内可见
    /**
     * @example PUBLIC|TENANT
     *
     * @var string
     */
    public $scope;

    // 所属技术栈
    /**
     * @example SOFA
     *
     * @var string
     */
    public $techStack;

    // 所属技术栈标识id
    /**
     * @example 00000000001
     *
     * @var string
     */
    public $techStackId;

    // 技术栈版本
    /**
     * @example ce4456_jdk7_tengine16
     *
     * @var string
     */
    public $version;

    // 创建时间（UTC）
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreated;

    // 最近修改时间（UTC）
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'description'      => 'description',
        'extendCommands'   => 'extend_commands',
        'extendProperties' => 'extend_properties',
        'fromImage'        => 'from_image',
        'id'               => 'id',
        'scope'            => 'scope',
        'techStack'        => 'tech_stack',
        'techStackId'      => 'tech_stack_id',
        'version'          => 'version',
        'utcCreated'       => 'utc_created',
        'utcModified'      => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('extendCommands', $this->extendCommands, true);
        Model::validateRequired('extendProperties', $this->extendProperties, true);
        Model::validateRequired('fromImage', $this->fromImage, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('techStack', $this->techStack, true);
        Model::validateRequired('techStackId', $this->techStackId, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('utcCreated', $this->utcCreated, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validatePattern('utcCreated', $this->utcCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extendCommands) {
            $res['extend_commands'] = $this->extendCommands;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }
        if (null !== $this->fromImage) {
            $res['from_image'] = $this->fromImage;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->techStack) {
            $res['tech_stack'] = $this->techStack;
        }
        if (null !== $this->techStackId) {
            $res['tech_stack_id'] = $this->techStackId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->utcCreated) {
            $res['utc_created'] = $this->utcCreated;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NativeTechStackVersion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extend_commands'])) {
            if (!empty($map['extend_commands'])) {
                $model->extendCommands = $map['extend_commands'];
            }
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }
        if (isset($map['from_image'])) {
            $model->fromImage = $map['from_image'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['tech_stack'])) {
            $model->techStack = $map['tech_stack'];
        }
        if (isset($map['tech_stack_id'])) {
            $model->techStackId = $map['tech_stack_id'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['utc_created'])) {
            $model->utcCreated = $map['utc_created'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
