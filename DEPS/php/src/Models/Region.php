<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Region extends Model {
    protected $_name = [
        'description' => 'description',
        'iaasProviderId' => 'iaas_provider_id',
        'id' => 'id',
        'identity' => 'identity',
        'name' => 'name',
        'networkType' => 'network_type',
        'state' => 'state',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
        'zoneDtos' => 'zone_dtos',
        'buildpackId' => 'buildpack_id',
        'fileStatus' => 'file_status',
        'fileLocation' => 'file_location',
        'objectName' => 'object_name',
        'fileSize' => 'file_size',
        'readableFileSize' => 'readable_file_size',
        'fileChecksum' => 'file_checksum',
        'originalFileName' => 'original_file_name',
        'buildpackTenantId' => 'buildpack_tenant_id',
        'fromRegionId' => 'from_region_id',
        'creationTime' => 'creation_time',
        'modificationTime' => 'modification_time',
    ];
    public function validate() {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->iaasProviderId) {
            $res['iaas_provider_id'] = $this->iaasProviderId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->zoneDtos) {
            $res['zone_dtos'] = $this->zoneDtos;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->fileStatus) {
            $res['file_status'] = $this->fileStatus;
        }
        if (null !== $this->fileLocation) {
            $res['file_location'] = $this->fileLocation;
        }
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->readableFileSize) {
            $res['readable_file_size'] = $this->readableFileSize;
        }
        if (null !== $this->fileChecksum) {
            $res['file_checksum'] = $this->fileChecksum;
        }
        if (null !== $this->originalFileName) {
            $res['original_file_name'] = $this->originalFileName;
        }
        if (null !== $this->buildpackTenantId) {
            $res['buildpack_tenant_id'] = $this->buildpackTenantId;
        }
        if (null !== $this->fromRegionId) {
            $res['from_region_id'] = $this->fromRegionId;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Region
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['iaas_provider_id'])){
            $model->iaasProviderId = $map['iaas_provider_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['identity'])){
            $model->identity = $map['identity'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        if(isset($map['zone_dtos'])){
            $model->zoneDtos = $map['zone_dtos'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['file_status'])){
            $model->fileStatus = $map['file_status'];
        }
        if(isset($map['file_location'])){
            $model->fileLocation = $map['file_location'];
        }
        if(isset($map['object_name'])){
            $model->objectName = $map['object_name'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['readable_file_size'])){
            $model->readableFileSize = $map['readable_file_size'];
        }
        if(isset($map['file_checksum'])){
            $model->fileChecksum = $map['file_checksum'];
        }
        if(isset($map['original_file_name'])){
            $model->originalFileName = $map['original_file_name'];
        }
        if(isset($map['buildpack_tenant_id'])){
            $model->buildpackTenantId = $map['buildpack_tenant_id'];
        }
        if(isset($map['from_region_id'])){
            $model->fromRegionId = $map['from_region_id'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        return $model;
    }
    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // iaasProviderId
    /**
     * @example iaasProviderId
     * @var string
     */
    public $iaasProviderId;

    // region名称
    /**
     * @example 
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     * @var string
     */
    public $identity;

    // region显示名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // networkType
    /**
     * @example networkType
     * @var string
     */
    public $networkType;

    // state
    /**
     * @example state
     * @var string
     */
    public $state;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcModified;

    // zoneDtos
    /**
     * @example zoneDtos
     * @var string
     */
    public $zoneDtos;

    // buildpackId
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // fileStatus
    /**
     * @example fileStatus
     * @var string
     */
    public $fileStatus;

    // fileLocation
    /**
     * @example fileLocation
     * @var string
     */
    public $fileLocation;

    // objectName
    /**
     * @example objectName
     * @var string
     */
    public $objectName;

    // fileSize
    /**
     * @example 
     * @var int
     */
    public $fileSize;

    // readableFileSize
    /**
     * @example readableFileSize
     * @var string
     */
    public $readableFileSize;

    // fileChecksum
    /**
     * @example fileChecksum
     * @var string
     */
    public $fileChecksum;

    // originalFileName
    /**
     * @example originalFileName
     * @var string
     */
    public $originalFileName;

    // buildpackTenantId
    /**
     * @example buildpackTenantId
     * @var string
     */
    public $buildpackTenantId;

    // fromRegionId
    /**
     * @example fromRegionId
     * @var string
     */
    public $fromRegionId;

    // creationTime
    /**
     * @example creationTime
     * @var string
     */
    public $creationTime;

    // modificationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modificationTime;

}
