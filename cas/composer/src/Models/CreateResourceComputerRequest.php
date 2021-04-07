<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceComputerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 实例所属的部署单元
    /**
     * @var string
     */
    public $cell;

    // 数据盘的云盘种类。取值范围：
    //
    // cloud_efficiency：高效云盘
    // cloud_ssd：SSD云盘
    // ephemeral_ssd：本地SSD盘
    // cloud_essd：ESSD云盘
    // cloud：普通云盘
    // I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
    /**
     * @var string
     */
    public $dataDiskCategory;

    // 数据盘的容量大小，n的取值范围为1~16，内存单位为GiB。取值范围：
    //
    // cloud_efficiency：20~32768
    // cloud_ssd：20~32768
    // cloud_essd：20~32768
    // ephemeral_ssd：5~800
    // cloud：5~2000
    // 该参数的取值必须大于等于参数SnapshotId指定的快照的大小。
    /**
     * @var int
     */
    public $dataDiskSize;

    // 实例的描述信息
    /**
     * @var string
     */
    public $description;

    // 云服务器的主机名。
    //
    // 点号（.）和短横线（-）不能作为首尾字符，更不能连续使用。
    // Windows实例：字符长度为2~15，不支持点号（.），不能全是数字。允许大小写英文字母、数字和短横线（-）。
    // 其他类型实例（Linux等）：字符长度为2~64，支持多个点号（.），点之间为一段，每段允许大小写英文字母、数字和短横线（-）。
    /**
     * @var string
     */
    public $hostName;

    // 镜像文件ID，启动实例时选择的镜像资源。
    /**
     * @var string
     */
    public $imageId;

    // 实例的资源规格。
    /**
     * @var string
     */
    public $instanceType;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。
    /**
     * @var string
     */
    public $password;

    // 实例所属的地域ID。
    /**
     * @var string
     */
    public $regionId;

    // 系统盘的云盘种类。取值范围：
    //
    // cloud_efficiency：高效云盘
    // cloud_ssd：SSD云盘
    // cloud：普通云盘
    /**
     * @var string
     */
    public $systemDiskCategory;

    // 系统盘大小，单位为GiB。取值范围：20~500
    //
    // 该参数的取值必须大于或者等于max{20, ImageSize}。
    /**
     * @var int
     */
    public $systemDiskSize;
    protected $_name = [
        'authToken'          => 'auth_token',
        'cell'               => 'cell',
        'dataDiskCategory'   => 'data_disk_category',
        'dataDiskSize'       => 'data_disk_size',
        'description'        => 'description',
        'hostName'           => 'host_name',
        'imageId'            => 'image_id',
        'instanceType'       => 'instance_type',
        'password'           => 'password',
        'regionId'           => 'region_id',
        'systemDiskCategory' => 'system_disk_category',
        'systemDiskSize'     => 'system_disk_size',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('hostName', $this->hostName, true);
        Model::validateRequired('imageId', $this->imageId, true);
        Model::validateRequired('instanceType', $this->instanceType, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('systemDiskCategory', $this->systemDiskCategory, true);
        Model::validateRequired('systemDiskSize', $this->systemDiskSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->dataDiskCategory) {
            $res['data_disk_category'] = $this->dataDiskCategory;
        }
        if (null !== $this->dataDiskSize) {
            $res['data_disk_size'] = $this->dataDiskSize;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->imageId) {
            $res['image_id'] = $this->imageId;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->systemDiskCategory) {
            $res['system_disk_category'] = $this->systemDiskCategory;
        }
        if (null !== $this->systemDiskSize) {
            $res['system_disk_size'] = $this->systemDiskSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['data_disk_category'])) {
            $model->dataDiskCategory = $map['data_disk_category'];
        }
        if (isset($map['data_disk_size'])) {
            $model->dataDiskSize = $map['data_disk_size'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['host_name'])) {
            $model->hostName = $map['host_name'];
        }
        if (isset($map['image_id'])) {
            $model->imageId = $map['image_id'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['system_disk_category'])) {
            $model->systemDiskCategory = $map['system_disk_category'];
        }
        if (isset($map['system_disk_size'])) {
            $model->systemDiskSize = $map['system_disk_size'];
        }

        return $model;
    }
}
