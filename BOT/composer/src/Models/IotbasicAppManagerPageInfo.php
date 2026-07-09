<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicAppManagerPageInfo extends Model
{
    // 应用类型
    /**
     * @example apk
     *
     * @var string
     */
    public $fileFormat;

    // 应用大小
    /**
     * @example
     *
     * @var int
     */
    public $fileSize;

    // 应用模块名称
    /**
     * @example 温控设备客户端
     *
     * @var string
     */
    public $moduleName;

    // 设备品类code
    /**
     * @example code
     *
     * @var string
     */
    public $deviceCategory;

    // 设备品类名称
    /**
     * @example name
     *
     * @var string
     */
    public $deviceCategoryName;

    // 应用模块包名
    /**
     * @example packageName
     *
     * @var string
     */
    public $packageName;

    // 应用描述
    /**
     * @example desc
     *
     * @var string
     */
    public $remark;

    // 应用版本号
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apkVersion;

    // 应用包类型（整包：0/差分：1）
    /**
     * @example 0
     *
     * @var int
     */
    public $apkType;

    // 应用名称
    /**
     * @example apkName
     *
     * @var string
     */
    public $apkName;

    // 应用包id
    /**
     * @example apkId
     *
     * @var string
     */
    public $apkId;

    // 下载次数
    /**
     * @example 0
     *
     * @var int
     */
    public $downloadCount;

    // 安装次数
    /**
     * @example 0
     *
     * @var int
     */
    public $installCount;

    // 设备型号
    /**
     * @example model
     *
     * @var string
     */
    public $deviceModel;
    protected $_name = [
        'fileFormat'         => 'file_format',
        'fileSize'           => 'file_size',
        'moduleName'         => 'module_name',
        'deviceCategory'     => 'device_category',
        'deviceCategoryName' => 'device_category_name',
        'packageName'        => 'package_name',
        'remark'             => 'remark',
        'apkVersion'         => 'apk_version',
        'apkType'            => 'apk_type',
        'apkName'            => 'apk_name',
        'apkId'              => 'apk_id',
        'downloadCount'      => 'download_count',
        'installCount'       => 'install_count',
        'deviceModel'        => 'device_model',
    ];

    public function validate()
    {
        Model::validateRequired('fileFormat', $this->fileFormat, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('moduleName', $this->moduleName, true);
        Model::validateRequired('deviceCategory', $this->deviceCategory, true);
        Model::validateRequired('deviceCategoryName', $this->deviceCategoryName, true);
        Model::validateRequired('packageName', $this->packageName, true);
        Model::validateRequired('apkVersion', $this->apkVersion, true);
        Model::validateRequired('apkType', $this->apkType, true);
        Model::validateRequired('apkName', $this->apkName, true);
        Model::validateRequired('apkId', $this->apkId, true);
        Model::validateRequired('downloadCount', $this->downloadCount, true);
        Model::validateRequired('installCount', $this->installCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileFormat) {
            $res['file_format'] = $this->fileFormat;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->deviceCategory) {
            $res['device_category'] = $this->deviceCategory;
        }
        if (null !== $this->deviceCategoryName) {
            $res['device_category_name'] = $this->deviceCategoryName;
        }
        if (null !== $this->packageName) {
            $res['package_name'] = $this->packageName;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->apkType) {
            $res['apk_type'] = $this->apkType;
        }
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->apkId) {
            $res['apk_id'] = $this->apkId;
        }
        if (null !== $this->downloadCount) {
            $res['download_count'] = $this->downloadCount;
        }
        if (null !== $this->installCount) {
            $res['install_count'] = $this->installCount;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicAppManagerPageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_format'])) {
            $model->fileFormat = $map['file_format'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['module_name'])) {
            $model->moduleName = $map['module_name'];
        }
        if (isset($map['device_category'])) {
            $model->deviceCategory = $map['device_category'];
        }
        if (isset($map['device_category_name'])) {
            $model->deviceCategoryName = $map['device_category_name'];
        }
        if (isset($map['package_name'])) {
            $model->packageName = $map['package_name'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['apk_type'])) {
            $model->apkType = $map['apk_type'];
        }
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['apk_id'])) {
            $model->apkId = $map['apk_id'];
        }
        if (isset($map['download_count'])) {
            $model->downloadCount = $map['download_count'];
        }
        if (isset($map['install_count'])) {
            $model->installCount = $map['install_count'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }

        return $model;
    }
}
