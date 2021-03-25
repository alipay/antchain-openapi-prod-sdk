<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildpackOS extends Model {
    protected $_name = [
        'creationTime' => 'creation_time',
        'description' => 'description',
        'extraInfo' => 'extra_info',
        'fullName' => 'full_name',
        'id' => 'id',
        'modificationTime' => 'modification_time',
        'name' => 'name',
        'osBit' => 'os_bit',
        'supportedCloudDisplayNames' => 'supported_cloud_display_names',
        'supportedCloudNames' => 'supported_cloud_names',
        'version' => 'version',
        'osBitNum' => 'os_bit_num',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->fullName) {
            $res['full_name'] = $this->fullName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->osBit) {
            $res['os_bit'] = $this->osBit;
        }
        if (null !== $this->supportedCloudDisplayNames) {
            $res['supported_cloud_display_names'] = $this->supportedCloudDisplayNames;
        }
        if (null !== $this->supportedCloudNames) {
            $res['supported_cloud_names'] = $this->supportedCloudNames;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->osBitNum) {
            $res['os_bit_num'] = $this->osBitNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildpackOS
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['full_name'])){
            $model->fullName = $map['full_name'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['os_bit'])){
            $model->osBit = $map['os_bit'];
        }
        if(isset($map['supported_cloud_display_names'])){
            if(!empty($map['supported_cloud_display_names'])){
                $model->supportedCloudDisplayNames = $map['supported_cloud_display_names'];
            }
        }
        if(isset($map['supported_cloud_names'])){
            if(!empty($map['supported_cloud_names'])){
                $model->supportedCloudNames = $map['supported_cloud_names'];
            }
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['os_bit_num'])){
            $model->osBitNum = $map['os_bit_num'];
        }
        return $model;
    }
    // creationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // 描述
    /**
     * @example description
     * @var string
     */
    public $description;

    // extraInfo
    /**
     * @example json
     * @var string
     */
    public $extraInfo;

    // 全名
    /**
     * @example fullName
     * @var string
     */
    public $fullName;

    // id
    /**
     * @example 
     * @var int
     */
    public $id;

    // modificationTime
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modificationTime;

    // 名字
    /**
     * @example name
     * @var string
     */
    public $name;

    // 操作系统位数
    /**
     * @example 64
     * @var int
     */
    public $osBit;

    // supportedCloudDisplayNames
    /**
     * @example 
     * @var string[]
     */
    public $supportedCloudDisplayNames;

    // supportedCloudNames
    /**
     * @example 
     * @var string[]
     */
    public $supportedCloudNames;

    // 版本
    /**
     * @example version
     * @var string
     */
    public $version;

    // 操作系统位数，e.g. 32 or 64
    /**
     * @example 
     * @var int
     */
    public $osBitNum;

}
