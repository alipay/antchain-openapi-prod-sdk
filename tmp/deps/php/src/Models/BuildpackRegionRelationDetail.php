<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Region;

class BuildpackRegionRelationDetail extends Model {
    protected $_name = [
        'buildpackId' => 'buildpack_id',
        'buildpackTenantId' => 'buildpack_tenant_id',
        'creationTime' => 'creation_time',
        'fileChecksum' => 'file_checksum',
        'fileLocation' => 'file_location',
        'fileSize' => 'file_size',
        'fileStatus' => 'file_status',
        'fromRegionId' => 'from_region_id',
        'id' => 'id',
        'modificationTime' => 'modification_time',
        'objectName' => 'object_name',
        'originalFileName' => 'original_file_name',
        'readableFileSize' => 'readable_file_size',
        'region' => 'region',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->buildpackTenantId) {
            $res['buildpack_tenant_id'] = $this->buildpackTenantId;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
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
        if (null !== $this->fromRegionId) {
            $res['from_region_id'] = $this->fromRegionId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }
        if (null !== $this->originalFileName) {
            $res['original_file_name'] = $this->originalFileName;
        }
        if (null !== $this->readableFileSize) {
            $res['readable_file_size'] = $this->readableFileSize;
        }
        if (null !== $this->region) {
            $res['region'] = null !== $this->region ? $this->region->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackRegionRelationDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['buildpack_tenant_id'])){
            $model->buildpackTenantId = $map['buildpack_tenant_id'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
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
        if(isset($map['from_region_id'])){
            $model->fromRegionId = $map['from_region_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['object_name'])){
            $model->objectName = $map['object_name'];
        }
        if(isset($map['original_file_name'])){
            $model->originalFileName = $map['original_file_name'];
        }
        if(isset($map['readable_file_size'])){
            $model->readableFileSize = $map['readable_file_size'];
        }
        if(isset($map['region'])){
            $model->region = Region::fromMap($map['region']);
        }
        return $model;
    }
    // buildpackId
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // buildpackTenantId
    /**
     * @example buildpackTenantId
     * @var string
     */
    public $buildpackTenantId;

    // creationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // fileChecksum
    /**
     * @example fileChecksum
     * @var string
     */
    public $fileChecksum;

    // fileLocation
    /**
     * @example fileLocation
     * @var string
     */
    public $fileLocation;

    // fileSize
    /**
     * @example 
     * @var int
     */
    public $fileSize;

    // fileStatus
    /**
     * @example fileStatus
     * @var string
     */
    public $fileStatus;

    // fromRegionId
    /**
     * @example fromRegionId
     * @var string
     */
    public $fromRegionId;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // modificationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modificationTime;

    // objectName
    /**
     * @example objectName
     * @var string
     */
    public $objectName;

    // originalFileName
    /**
     * @example originalFileName
     * @var string
     */
    public $originalFileName;

    // readableFileSize
    /**
     * @example readableFileSize
     * @var string
     */
    public $readableFileSize;

    // RegionDto
    /**
     * @example 
     * @var Region
     */
    public $region;

}
