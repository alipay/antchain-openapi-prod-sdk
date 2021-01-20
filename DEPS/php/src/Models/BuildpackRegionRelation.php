<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackRegionRelation extends Model {
    protected $_name = [
        'buildpackId' => 'buildpack_id',
        'buildpackTenantId' => 'buildpack_tenant_id',
        'fileChecksum' => 'file_checksum',
        'fileLocation' => 'file_location',
        'fileSize' => 'file_size',
        'fileStatus' => 'file_status',
        'originalFileName' => 'original_file_name',
        'readableFileSize' => 'readable_file_size',
        'regionId' => 'region_id',
        'regionIdentity' => 'region_identity',
        'regionName' => 'region_name',
        'storageType' => 'storage_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->buildpackTenantId) {
            $res['buildpack_tenant_id'] = $this->buildpackTenantId;
        }
        if (null !== $this->fileChecksum) {
            $res['file_checksum'] = $this->fileChecksum;
        }
        if (null !== $this->fileLocation) {
            $res['file_location'] = $this->fileLocation;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileStatus) {
            $res['file_status'] = $this->fileStatus;
        }
        if (null !== $this->originalFileName) {
            $res['original_file_name'] = $this->originalFileName;
        }
        if (null !== $this->readableFileSize) {
            $res['readable_file_size'] = $this->readableFileSize;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->regionIdentity) {
            $res['region_identity'] = $this->regionIdentity;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->storageType) {
            $res['storage_type'] = $this->storageType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackRegionRelation
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['buildpack_tenant_id'])){
            $model->buildpackTenantId = $map['buildpack_tenant_id'];
        }
        if(isset($map['file_checksum'])){
            $model->fileChecksum = $map['file_checksum'];
        }
        if(isset($map['file_location'])){
            $model->fileLocation = $map['file_location'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['file_status'])){
            $model->fileStatus = $map['file_status'];
        }
        if(isset($map['original_file_name'])){
            $model->originalFileName = $map['original_file_name'];
        }
        if(isset($map['readable_file_size'])){
            $model->readableFileSize = $map['readable_file_size'];
        }
        if(isset($map['region_id'])){
            $model->regionId = $map['region_id'];
        }
        if(isset($map['region_identity'])){
            $model->regionIdentity = $map['region_identity'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['storage_type'])){
            $model->storageType = $map['storage_type'];
        }
        return $model;
    }
    // 技术栈版本的id
    /**
     * @example 
     * @var string
     */
    public $buildpackId;

    // 技术栈租户ID
    /**
     * @example 
     * @var string
     */
    public $buildpackTenantId;

    // 文件的checksum
    /**
     * @example 
     * @var string
     */
    public $fileChecksum;

    // 文件存储地址
    /**
     * @example 
     * @var string
     */
    public $fileLocation;

    // 文件大小，类似1100
    /**
     * @example 
     * @var int
     */
    public $fileSize;

    // 文件状态
    /**
     * @example 
     * @var string
     */
    public $fileStatus;

    // 文件的初始名称
    /**
     * @example 
     * @var string
     */
    public $originalFileName;

    // 文件可读的大小，类似1.1MB
    /**
     * @example 
     * @var string
     */
    public $readableFileSize;

    // region的ID
    /**
     * @example 
     * @var string
     */
    public $regionId;

    // region的标识符
    /**
     * @example 
     * @var string
     */
    public $regionIdentity;

    // region的名称
    /**
     * @example 
     * @var string
     */
    public $regionName;

    // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
    /**
     * @example 
     * @var string
     */
    public $storageType;

}
