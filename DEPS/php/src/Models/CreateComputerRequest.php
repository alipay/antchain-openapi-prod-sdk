<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateComputerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'description' => 'description',
        'imageId' => 'image_id',
        'instanceCount' => 'instance_count',
        'name' => 'name',
        'paasword' => 'paasword',
        'region' => 'region',
        'deployType' => 'deploy_type',
        'securityGroupId' => 'security_group_id',
        'specId' => 'spec_id',
        'systemDiskSize' => 'system_disk_size',
        'systemDiskType' => 'system_disk_type',
        'vSwitchId' => 'v_switch_id',
        'workspace' => 'workspace',
        'zone' => 'zone',
    ];
    public function validate() {
        Model::validateRequired('imageId', $this->imageId, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('systemDiskSize', $this->systemDiskSize, true);
        Model::validateRequired('systemDiskType', $this->systemDiskType, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('zone', $this->zone, true);
        Model::validateMaxLength('paasword', $this->paasword, 30);
        Model::validateMinLength('paasword', $this->paasword, 8);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->imageId) {
            $res['image_id'] = $this->imageId;
        }
        if (null !== $this->instanceCount) {
            $res['instance_count'] = $this->instanceCount;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->paasword) {
            $res['paasword'] = $this->paasword;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->systemDiskSize) {
            $res['system_disk_size'] = $this->systemDiskSize;
        }
        if (null !== $this->systemDiskType) {
            $res['system_disk_type'] = $this->systemDiskType;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateComputerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['image_id'])){
            $model->imageId = $map['image_id'];
        }
        if(isset($map['instance_count'])){
            $model->instanceCount = $map['instance_count'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['paasword'])){
            $model->paasword = $map['paasword'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['deploy_type'])){
            $model->deployType = $map['deploy_type'];
        }
        if(isset($map['security_group_id'])){
            $model->securityGroupId = $map['security_group_id'];
        }
        if(isset($map['spec_id'])){
            $model->specId = $map['spec_id'];
        }
        if(isset($map['system_disk_size'])){
            $model->systemDiskSize = $map['system_disk_size'];
        }
        if(isset($map['system_disk_type'])){
            $model->systemDiskType = $map['system_disk_type'];
        }
        if(isset($map['v_switch_id'])){
            $model->vSwitchId = $map['v_switch_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        if(isset($map['zone'])){
            $model->zone = $map['zone'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 实例描述
    /**
     * @var string
     */
    public $description;

    // 镜像文件ID，启动实例时选择的镜像资源。
    /**
     * @var string
     */
    public $imageId;

    // 创建的实例数量。默认为 1 台
    /**
     * @var int
     */
    public $instanceCount;

    // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
    /**
     * @var string
     */
    public $name;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是：
    // ()`~!@#^&*-_+=|{}[]:;'<>,.?/
    // 其中，Windows实例不能以斜线号（/）为密码首字符。
    /**
     * @var string
     */
    public $paasword;

    // 实例所在地域
    /**
     * @var string
     */
    public $region;

    // image 或者 package
    /**
     * @var string
     */
    public $deployType;

    // 新创建实例所属于的安全组ID，同一个安全组内的实例之间可以互相访问。
    /**
     * @var string
     */
    public $securityGroupId;

    // 实例的资源规格。
    /**
     * @var string
     */
    public $specId;

    // 单位 G。系统盘大小，需根据选择的 image 类型决定。
    /**
     * @var string
     */
    public $systemDiskSize;

    // 系统盘类型
    /**
     * @var string
     */
    public $systemDiskType;

    // VPC类型的实例，需要指定虚拟交换机ID。
    /**
     * @var string
     */
    public $vSwitchId;

    // 实例所在工作空间
    /**
     * @var string
     */
    public $workspace;

    // 实例所在可用区
    /**
     * @var string
     */
    public $zone;

}
